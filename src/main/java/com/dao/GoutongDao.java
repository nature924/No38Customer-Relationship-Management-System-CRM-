package com.dao;

import com.entity.GoutongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GoutongView;

/**
 * 沟通记录 Dao 接口
 *
 * @author 
 */
public interface GoutongDao extends BaseMapper<GoutongEntity> {

   List<GoutongView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
