package com.neusoft.ecs.cm.mapper.ifs;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.ecs.cm.model.ManufacturerModel;

//商品管理模块 - 供应商信息 - Mapper接口

@Mapper
public interface IManufacturerMapper
{
	/***************
	 * 基本的增删改查
	 ***************/
	//根据ManufacturerModel除主键以外的信息插入元组
	public void insert(ManufacturerModel manufacturerModel) throws Exception;
		
	//删除主键与ManufacturerModel一致的元组
	public void delete(ManufacturerModel manufacturerModel) throws Exception;
		
	//根据 ManufacturerModel除主键以外的信息 改写 主键与ManufacturerModel一致 的元组
	public void update(ManufacturerModel manufacturerModel) throws Exception;
		
	//查看全部元组
	public List<ManufacturerModel> selectAll() throws Exception;
		
	//根据ManufacturerModel主键ID查找元组
	public ManufacturerModel selectById(int id) throws Exception;
}
