package com.dao;

import com.entity.KehujifenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KehujifenView;

/**
 * 客户积分 Dao 接口
 *
 * @author 
 */
public interface KehujifenDao extends BaseMapper<KehujifenEntity> {

   List<KehujifenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
