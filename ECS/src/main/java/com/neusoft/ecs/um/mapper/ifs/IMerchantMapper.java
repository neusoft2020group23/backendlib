package com.neusoft.ecs.um.mapper.ifs;

import com.neusoft.ecs.um.model.MerchantModel;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

//用户管理模块 - 商家信息 - Mapper接口

@Mapper
public interface IMerchantMapper
{
	/***************
	 * 基本的增删改查
	 ***************/
	//根据MerchantModel除主键以外的信息插入元组
	public void insert(MerchantModel merchantModel) throws Exception;
		
	//删除主键与MerchantModel一致的元组
	public void delete(MerchantModel merchantModel) throws Exception;
		
	//根据 MerchantModel除主键以外的信息 改写 主键与MerchantModel一致 的元组
	public void update(MerchantModel merchantModel) throws Exception;
		
	//查看全部元组
	public List<MerchantModel> selectAll() throws Exception;
		
	//根据MerchantModel主键ID查找元组
	public MerchantModel selectById(int id) throws Exception;
}