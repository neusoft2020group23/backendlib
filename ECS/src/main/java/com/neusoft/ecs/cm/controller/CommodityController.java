package com.neusoft.ecs.cm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ecs.cm.model.CommodityModel;
import com.neusoft.ecs.cm.service.ifs.ICommodityService;
import com.neusoft.ecs.result.Result;

//商品管理模块 - 商品信息 - REST API Controller

@RestController
@RequestMapping(value="/commodity")
public class CommodityController 
{
	@Autowired
	private ICommodityService commodityService=null;
	
	@PostMapping(value="/add")
	public Result<String> add(CommodityModel commodityModel) throws Exception
	{
		Result<String> result = new Result<String>();
		commodityService.add(commodityModel);
		result.setStatus("OK");
		result.setMessage("成功添加商品");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(CommodityModel commodityModel) throws Exception
	{
		Result<String> result = new Result<String>();
		commodityService.delete(commodityModel);
		result.setStatus("OK");
		result.setMessage("成功删除商品");
		return result;
	}
	
	@PostMapping(value="/modify")
	public Result<String> modity(CommodityModel commodityModel) throws Exception
	{
		Result<String> result = new Result<String>();
		commodityService.modify(commodityModel);
		result.setStatus("OK"); 
		result.setMessage("成功修改商品信息");
		return result;
	}
	
	@GetMapping(value="/get/all")
	public Result<CommodityModel> getAll() throws Exception
	{
		Result<CommodityModel> result = new Result<CommodityModel>();
		result.setResultList(commodityService.getAll());
		result.setStatus("OK"); 
		result.setMessage("成功取得所有商品信息");
		return result;
	}

	@GetMapping(value="/get/byid")
	public Result<CommodityModel> getById(@RequestParam(required = true) int id) throws Exception
	{
		Result<CommodityModel> result = new Result<CommodityModel>();
		result.setResult(commodityService.getById(id));
		result.setStatus("OK"); 
		result.setMessage("成功取得指定ID商品信息");
		return result;
	}
}
