package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KehuxiansuoEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 客户线索 服务类
 */
public interface KehuxiansuoService extends IService<KehuxiansuoEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}