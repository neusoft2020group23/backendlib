package com.neusoft.ecs.cm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.ecs.cm.mapper.ifs.IManufacturerMapper;
import com.neusoft.ecs.cm.model.ManufacturerModel;
import com.neusoft.ecs.cm.service.ifs.IManufacturerService;

//商品管理模块 - 供应商信息 - Service实现

@Service("ManufacturerService")
@Transactional  
public class ManufacturerServiceImpl implements IManufacturerService 
{
	@Autowired
	private IManufacturerMapper manufacturerMapper=null;
	
	@Override
	public void add(ManufacturerModel manufacturerModel) throws Exception 
	{
		manufacturerMapper.insert(manufacturerModel);
	}

	@Override
	public void delete(ManufacturerModel manufacturerModel) throws Exception 
	{
		manufacturerMapper.delete(manufacturerModel);
	}

	@Override
	public void modify(ManufacturerModel manufacturerModel) throws Exception 
	{
		manufacturerMapper.update(manufacturerModel);
	}

	@Override
	public List<ManufacturerModel> getAll() throws Exception 
	{
		return manufacturerMapper.selectAll();
	}

	@Override
	public ManufacturerModel getById(int id) throws Exception 
	{
		return manufacturerMapper.selectById(id);
	}

}
