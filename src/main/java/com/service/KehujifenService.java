package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KehujifenEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 客户积分 服务类
 */
public interface KehujifenService extends IService<KehujifenEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}