package com.neusoft.ecs.um.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.ecs.um.mapper.ifs.IMerchantMapper;
import com.neusoft.ecs.um.model.MerchantModel;
import com.neusoft.ecs.um.service.ifs.IMerchantService;

//用户管理模块 - 商家信息 - Service实现

@Service("MerchantService")
@Transactional  
public class MerchantServiceImpl implements IMerchantService
{
	@Autowired
	private IMerchantMapper merchantMapper=null;
	
	@Override
	public void add(MerchantModel merchantModel) throws Exception
	{
		merchantMapper.insert(merchantModel);
	}

	@Override
	public void delete(MerchantModel merchantModel) throws Exception
	{
		merchantMapper.delete(merchantModel);
	}

	@Override
	public void modify(MerchantModel merchantModel) throws Exception
	{
		merchantMapper.update(merchantModel);
	}

	@Override
	public List<MerchantModel> getAll() throws Exception
	{
		return merchantMapper.selectAll();
	}

	@Override
	public MerchantModel getById(int id) throws Exception
	{
		return merchantMapper.selectById(id);
	}

}
