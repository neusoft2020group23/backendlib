package com.neusoft.ecs.om.service.impl;

import com.neusoft.ecs.om.mapper.ifs.IOrderMapper;
import com.neusoft.ecs.om.model.OrderModel;
import com.neusoft.ecs.om.service.ifs.IOrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//订单管理模块 - 订单信息 - Service实现

@Service("OrderService")
@Transactional  
public class OrderServiceImpl implements IOrderService
{
	@Autowired
	private IOrderMapper orderMapper=null;
	
	@Override
	public void add(OrderModel orderModel) throws Exception
	{
		orderMapper.insert(orderModel);
	}

	@Override
	public void delete(OrderModel OrderModel) throws Exception
	{
		orderMapper.delete(OrderModel);
	}

	@Override
	public void modify(OrderModel OrderModel) throws Exception
	{
		orderMapper.update(OrderModel);
	}

	@Override
	public List<OrderModel> getAll() throws Exception
	{
		return orderMapper.selectAll();
	}

	@Override
	public OrderModel getById(int id) throws Exception
	{
		return orderMapper.selectById(id);
	}

}
