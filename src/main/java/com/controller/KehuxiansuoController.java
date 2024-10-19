
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 客户线索
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/kehuxiansuo")
public class KehuxiansuoController {
    private static final Logger logger = LoggerFactory.getLogger(KehuxiansuoController.class);

    @Autowired
    private KehuxiansuoService kehuxiansuoService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private YuangongService yuangongService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("员工".equals(role))
            params.put("yuangongId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = kehuxiansuoService.queryPage(params);

        //字典表数据转换
        List<KehuxiansuoView> list =(List<KehuxiansuoView>)page.getList();
        for(KehuxiansuoView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        KehuxiansuoEntity kehuxiansuo = kehuxiansuoService.selectById(id);
        if(kehuxiansuo !=null){
            //entity转view
            KehuxiansuoView view = new KehuxiansuoView();
            BeanUtils.copyProperties( kehuxiansuo , view );//把实体数据重构到view中

                //级联表
                YuangongEntity yuangong = yuangongService.selectById(kehuxiansuo.getYuangongId());
                if(yuangong != null){
                    BeanUtils.copyProperties( yuangong , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYuangongId(yuangong.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody KehuxiansuoEntity kehuxiansuo, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,kehuxiansuo:{}",this.getClass().getName(),kehuxiansuo.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("员工".equals(role))
            kehuxiansuo.setYuangongId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

            kehuxiansuo.setInsertTime(new Date());
            kehuxiansuo.setCreateTime(new Date());
            kehuxiansuoService.insert(kehuxiansuo);
            return R.ok();

    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody KehuxiansuoEntity kehuxiansuo, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,kehuxiansuo:{}",this.getClass().getName(),kehuxiansuo.toString());

            kehuxiansuoService.updateById(kehuxiansuo);//根据id更新
            return R.ok();

    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        kehuxiansuoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<KehuxiansuoEntity> kehuxiansuoList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            KehuxiansuoEntity kehuxiansuoEntity = new KehuxiansuoEntity();
//                            kehuxiansuoEntity.setYuangongId(Integer.valueOf(data.get(0)));   //员工 要改的
//                            kehuxiansuoEntity.setKehuxiansuoName(data.get(0));                    //姓名 要改的
//                            kehuxiansuoEntity.setKehuxiansuoPhone(data.get(0));                    //手机号 要改的
//                            kehuxiansuoEntity.setKehuxiansuoIdNumber(data.get(0));                    //身份证号 要改的
//                            kehuxiansuoEntity.setKehuxiansuoPhoto("");//照片
//                            kehuxiansuoEntity.setSexTypes(Integer.valueOf(data.get(0)));   //性别 要改的
//                            kehuxiansuoEntity.setKehuxiansuoEmail(data.get(0));                    //电子邮箱 要改的
//                            kehuxiansuoEntity.setKehuxiansuoTypes(Integer.valueOf(data.get(0)));   //线索类型 要改的
//                            kehuxiansuoEntity.setKehuxiansuoContent("");//照片
//                            kehuxiansuoEntity.setInsertTime(date);//时间
//                            kehuxiansuoEntity.setCreateTime(date);//时间
                            kehuxiansuoList.add(kehuxiansuoEntity);


                            //把要查询是否重复的字段放入map中
                                //手机号
                                if(seachFields.containsKey("kehuxiansuoPhone")){
                                    List<String> kehuxiansuoPhone = seachFields.get("kehuxiansuoPhone");
                                    kehuxiansuoPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> kehuxiansuoPhone = new ArrayList<>();
                                    kehuxiansuoPhone.add(data.get(0));//要改的
                                    seachFields.put("kehuxiansuoPhone",kehuxiansuoPhone);
                                }
                                //身份证号
                                if(seachFields.containsKey("kehuxiansuoIdNumber")){
                                    List<String> kehuxiansuoIdNumber = seachFields.get("kehuxiansuoIdNumber");
                                    kehuxiansuoIdNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> kehuxiansuoIdNumber = new ArrayList<>();
                                    kehuxiansuoIdNumber.add(data.get(0));//要改的
                                    seachFields.put("kehuxiansuoIdNumber",kehuxiansuoIdNumber);
                                }
                        }

                        //查询是否重复
                         //手机号
                        List<KehuxiansuoEntity> kehuxiansuoEntities_kehuxiansuoPhone = kehuxiansuoService.selectList(new EntityWrapper<KehuxiansuoEntity>().in("kehuxiansuo_phone", seachFields.get("kehuxiansuoPhone")));
                        if(kehuxiansuoEntities_kehuxiansuoPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(KehuxiansuoEntity s:kehuxiansuoEntities_kehuxiansuoPhone){
                                repeatFields.add(s.getKehuxiansuoPhone());
                            }
                            return R.error(511,"数据库的该表中的 [手机号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //身份证号
                        List<KehuxiansuoEntity> kehuxiansuoEntities_kehuxiansuoIdNumber = kehuxiansuoService.selectList(new EntityWrapper<KehuxiansuoEntity>().in("kehuxiansuo_id_number", seachFields.get("kehuxiansuoIdNumber")));
                        if(kehuxiansuoEntities_kehuxiansuoIdNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(KehuxiansuoEntity s:kehuxiansuoEntities_kehuxiansuoIdNumber){
                                repeatFields.add(s.getKehuxiansuoIdNumber());
                            }
                            return R.error(511,"数据库的该表中的 [身份证号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        kehuxiansuoService.insertBatch(kehuxiansuoList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
