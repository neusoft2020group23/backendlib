package com.neusoft.ecs.cm.service.ifs;

import java.util.List;

import com.neusoft.ecs.cm.model.CommodityModel;

//商品管理模块 - 商品信息 - Service接口

public interface ICommodityService 
{
	//增加商品
	public void add(CommodityModel commodityModel) throws Exception;
	
	//删除商品
	public void delete(CommodityModel commodityModel) throws Exception;
	
	//修改商品
	public void modify(CommodityModel commodityModel) throws Exception;
	
	//查看全部商品
	public List<CommodityModel> getAll() throws Exception;

	//根据商品ID查找商品
	public CommodityModel getById(int id) throws Exception;
}
