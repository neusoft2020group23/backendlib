package com.neusoft.ecs.om.mapper.ifs;

import com.neusoft.ecs.om.model.OrderModel;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

//订单管理模块 - 订单评论 - Mapper接口

@Mapper
public interface IOrderMapper
{
	/***************
	 * 基本的增删改查
	 ***************/
	//根据orderModel除主键以外的信息插入元组
	public void insert(OrderModel orderModel) throws Exception;
		
	//删除主键与orderModel一致的元组
	public void delete(OrderModel orderModel) throws Exception;
		
	//根据 orderModel除主键以外的信息 改写 主键与orderModel一致 的元组
	public void update(OrderModel orderModel) throws Exception;
		
	//查看全部元组
	public List<OrderModel> selectAll() throws Exception;
		
	//根据orderModel主键ID查找元组
	public OrderModel selectById(int id) throws Exception;
}