package com.neusoft.ecs.um.model;

import org.apache.ibatis.type.Alias;

//用户管理模块 - 商家信息 - model
//对应数据库ecs中：merchant

@Alias("Merchant")
public class MerchantModel
{
	private String id = null;				//商家账号	MERCH_ID
	private String name = null;				//商家名称	MERCH_NAME
	private String password = null;			//商家密码	MERCH_PASSWORD

	//Getters & Setters
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }

}
