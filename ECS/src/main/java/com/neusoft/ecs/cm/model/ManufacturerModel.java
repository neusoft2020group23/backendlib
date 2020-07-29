package com.neusoft.ecs.cm.model;

import java.util.List;

import org.apache.ibatis.type.Alias;

//商品管理模块 - 供应商信息 - model
//对应数据库ecs中：manufacturer

@Alias("Manufacturer")
public class ManufacturerModel 
{
	private int id = 0;				//编号		MFR_ID
	private String name = null;		//名称		MFR_NAME
	
	//Getters & Setters
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}
