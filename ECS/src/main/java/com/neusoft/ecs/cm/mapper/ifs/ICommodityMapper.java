package com.neusoft.ecs.cm.mapper.ifs;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.ecs.cm.model.CommodityModel;

//商品管理模块 - 商品信息 - Mapper接口

@Mapper
public interface ICommodityMapper
{
	/***************
	 * 基本的增删改查
	 ***************/
	//根据CommodityModel除主键以外的信息插入元组
	public void insert(CommodityModel commodityModel) throws Exception;
		
	//删除主键与CommodityModel一致的元组
	public void delete(CommodityModel commodityModel) throws Exception;
		
	//根据 CommodityModel除主键以外的信息 改写 主键与CommodityModel一致 的元组
	public void update(CommodityModel commodityModel) throws Exception;
		
	//查看全部元组
	public List<CommodityModel> selectAll() throws Exception;
		
	//根据CommodityModel主键ID查找元组
	public CommodityModel selectById(int id) throws Exception;
}