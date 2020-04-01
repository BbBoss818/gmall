package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author BbBoss818
 * @email 1915740629@qq.com
 * @date 2020-03-27 12:59:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
