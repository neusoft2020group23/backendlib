package com.neusoft.ecs.um.service.ifs;

import com.neusoft.ecs.um.model.MerchantModel;
import java.util.List;

//用户管理模块 - 商家信息 - Service接口

public interface IMerchantService
{
	//增加商家
	public void add(MerchantModel merchantModel) throws Exception;
	
	//删除商家
	public void delete(MerchantModel merchantModel) throws Exception;
	
	//修改商家
	public void modify(MerchantModel merchantModel) throws Exception;
	
	//查看全部商家
	public List<MerchantModel> getAll() throws Exception;

	//根据商家ID查找商家
	public MerchantModel getById(int id) throws Exception;
}
