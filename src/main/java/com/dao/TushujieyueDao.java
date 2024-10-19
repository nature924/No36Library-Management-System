package com.dao;

import com.entity.TushujieyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TushujieyueView;

/**
 * 借阅信息 Dao 接口
 *
 * @author 
 */
public interface TushujieyueDao extends BaseMapper<TushujieyueEntity> {

   List<TushujieyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
