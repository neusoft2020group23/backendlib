package com.neusoft.ecs.om.service.ifs;

import com.neusoft.ecs.om.model.OrderModel;
import java.util.List;

//订单管理模块 - 订单信息 - Service接口

public interface IOrderService
{
	//增加订单
	public void add(OrderModel orderModel) throws Exception;
	
	//删除订单
	public void delete(OrderModel orderModel) throws Exception;
	
	//修改订单
	public void modify(OrderModel orderModel) throws Exception;
	
	//查看全部订单
	public List<OrderModel> getAll() throws Exception;

	//根据订单ID查找订单
	public OrderModel getById(int id) throws Exception;
}
