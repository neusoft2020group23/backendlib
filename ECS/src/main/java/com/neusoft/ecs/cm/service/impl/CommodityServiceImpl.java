package com.neusoft.ecs.cm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.ecs.cm.mapper.ifs.ICommodityMapper;
import com.neusoft.ecs.cm.model.CommodityModel;
import com.neusoft.ecs.cm.service.ifs.ICommodityService;

//商品管理模块 - 商品信息 - Service实现

@Service("CommodityService")
@Transactional  
public class CommodityServiceImpl implements ICommodityService 
{
	@Autowired
	private ICommodityMapper commodityMapper=null;
	
	@Override
	public void add(CommodityModel commodityModel) throws Exception 
	{
		commodityMapper.insert(commodityModel);
	}

	@Override
	public void delete(CommodityModel commodityModel) throws Exception 
	{
		commodityMapper.delete(commodityModel);
	}

	@Override
	public void modify(CommodityModel commodityModel) throws Exception 
	{
		commodityMapper.update(commodityModel);
	}

	@Override
	public List<CommodityModel> getAll() throws Exception 
	{
		return commodityMapper.selectAll();
	}

	@Override
	public CommodityModel getById(int id) throws Exception 
	{
		return commodityMapper.selectById(id);
	}

}
