package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author BbBoss818
 * @email 1915740629@qq.com
 * @date 2020-03-31 22:42:39
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
