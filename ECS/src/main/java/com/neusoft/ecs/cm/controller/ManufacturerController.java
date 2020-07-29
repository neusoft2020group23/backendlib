package com.neusoft.ecs.cm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ecs.cm.model.ManufacturerModel;
import com.neusoft.ecs.cm.service.ifs.IManufacturerService;
import com.neusoft.ecs.result.Result;

//供应商管理模块 - 供应商信息 - REST API Controller

@RestController
@RequestMapping(value="/manufacturer")
public class ManufacturerController 
{
	@Autowired
	private IManufacturerService manufacturerService=null;
	
	@PostMapping(value="/add")
	public Result<String> add(ManufacturerModel manufacturerModel) throws Exception
	{
		Result<String> result = new Result<String>();
		manufacturerService.add(manufacturerModel);
		result.setStatus("OK");
		result.setMessage("成功添加供应商");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(ManufacturerModel manufacturerModel) throws Exception
	{
		Result<String> result = new Result<String>();
		manufacturerService.delete(manufacturerModel);
		result.setStatus("OK");
		result.setMessage("成功删除供应商");
		return result;
	}
	
	@PostMapping(value="/modify")
	public Result<String> modity(ManufacturerModel manufacturerModel) throws Exception
	{
		Result<String> result = new Result<String>();
		manufacturerService.modify(manufacturerModel);
		result.setStatus("OK"); 
		result.setMessage("成功修改供应商信息");
		return result;
	}
	
	@GetMapping(value="/get/all")
	public Result<ManufacturerModel> getAll() throws Exception
	{
		Result<ManufacturerModel> result = new Result<ManufacturerModel>();
		result.setResultList(manufacturerService.getAll());
		result.setStatus("OK"); 
		result.setMessage("成功取得所有供应商信息");
		return result;
	}

	@GetMapping(value="/get/byid")
	public Result<ManufacturerModel> getById(@RequestParam(required = true) int id) throws Exception
	{
		Result<ManufacturerModel> result = new Result<ManufacturerModel>();
		result.setResult(manufacturerService.getById(id));
		result.setStatus("OK"); 
		result.setMessage("成功取得指定ID供应商信息");
		return result;
	}
	

	 

	


}
