package com.neusoft.ecs.cm.service.ifs;

import java.util.List;

import com.neusoft.ecs.cm.model.ManufacturerModel;

//商品管理模块 - 供应商信息 - Service接口

public interface IManufacturerService 
{
	//增加供应商
	public void add(ManufacturerModel manufacturerModel) throws Exception;
	
	//删除供应商
	public void delete(ManufacturerModel manufacturerModel) throws Exception;
	
	//修改供应商
	public void modify(ManufacturerModel manufacturerModel) throws Exception;
	
	//查看全部供应商
	public List<ManufacturerModel> getAll() throws Exception;

	//根据供应商ID查找供应商
	public ManufacturerModel getById(int id) throws Exception;
}
