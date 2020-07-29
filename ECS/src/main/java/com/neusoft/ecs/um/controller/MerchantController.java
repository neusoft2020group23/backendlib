package com.neusoft.ecs.um.controller;

import com.neusoft.ecs.um.model.MerchantModel;
import com.neusoft.ecs.result.Result;
import com.neusoft.ecs.um.service.ifs.IMerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//用户管理模块 - 商家信息 - REST API Controller

@RestController
@RequestMapping(value="/merchant")
public class MerchantController
{
	@Autowired
	private IMerchantService merchantService=null;

	@PostMapping(value="/add")
	public Result<String> add(MerchantModel merchantModel) throws Exception
	{
		Result<String> result = new Result<>();
		merchantService.add(merchantModel);
		result.setStatus("OK");
		result.setMessage("成功添加商家");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(MerchantModel merchantModel) throws Exception
	{
		Result<String> result = new Result<>();
		merchantService.delete(merchantModel);
		result.setStatus("OK");
		result.setMessage("成功删除商家");
		return result;
	}
	
	@PostMapping(value="/modify")
	public Result<String> modity(MerchantModel merchantModel) throws Exception
	{
		Result<String> result = new Result<>();
		merchantService.modify(merchantModel);
		result.setStatus("OK"); 
		result.setMessage("成功修改商家信息");
		return result;
	}
	
	@GetMapping(value="/get/all")
	public Result<MerchantModel> getAll() throws Exception
	{
		Result<MerchantModel> result = new Result<>();
		result.setResultList(merchantService.getAll());
		result.setStatus("OK"); 
		result.setMessage("成功取得所有商家信息");
		return result;
	}

	@GetMapping(value="/get/byid")
	public Result<MerchantModel> getById(@RequestParam(required = true) int id) throws Exception
	{
		Result<MerchantModel> result = new Result<>();
		result.setResult(merchantService.getById(id));
		result.setStatus("OK"); 
		result.setMessage("成功取得指定ID商家信息");
		return result;
	}
}
