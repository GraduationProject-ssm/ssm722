package com.dao;

import com.entity.FenkuguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FenkuguanliView;

/**
 * 分库管理员 Dao 接口
 *
 * @author 
 */
public interface FenkuguanliDao extends BaseMapper<FenkuguanliEntity> {

   List<FenkuguanliView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
