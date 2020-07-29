package com.neusoft.ecs.om.controller;

import com.neusoft.ecs.om.model.OrderModel;
import com.neusoft.ecs.om.service.ifs.IOrderService;
import com.neusoft.ecs.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//订单管理模块 - 订单 - REST API Controller

@RestController
@RequestMapping(value="/order")
public class OrderController
{
	@Autowired
	private IOrderService orderService=null;

	@PostMapping(value="/add")
	public Result<String> add(OrderModel orderModel) throws Exception
	{
		Result<String> result = new Result<>();
		orderService.add(orderModel);
		result.setStatus("OK");
		result.setMessage("成功添加订单");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(OrderModel orderModel) throws Exception
	{
		Result<String> result = new Result<>();
		orderService.delete(orderModel);
		result.setStatus("OK");
		result.setMessage("成功删除订单");
		return result;
	}
	
	@PostMapping(value="/modify")
	public Result<String> modity(OrderModel orderModel) throws Exception
	{
		Result<String> result = new Result<>();
		orderService.modify(orderModel);
		result.setStatus("OK"); 
		result.setMessage("成功修改订单");
		return result;
	}
	
	@GetMapping(value="/get/all")
	public Result<OrderModel> getAll() throws Exception
	{
		Result<OrderModel> result = new Result<>();
		result.setResultList(orderService.getAll());
		result.setStatus("OK"); 
		result.setMessage("成功取得所有订单信息");
		return result;
	}

	@GetMapping(value="/get/byid")
	public Result<OrderModel> getById(@RequestParam(required = true) int id) throws Exception
	{
		Result<OrderModel> result = new Result<>();
		result.setResult(orderService.getById(id));
		result.setStatus("OK"); 
		result.setMessage("成功取得指定ID订单信息");
		return result;
	}
}
