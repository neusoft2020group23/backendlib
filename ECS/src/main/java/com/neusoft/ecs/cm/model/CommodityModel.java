package com.neusoft.ecs.cm.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonFormat;

//商品管理模块 - 商品信息 - model 
//对应数据库ecs中：commodity

@Alias("Commodity")
public class CommodityModel 
{
	private int id = 0;				//商品编号		COMM_ID
	private String name = null;		//商品名称		COMM_NAME
	private float price = 0;		//商品单价		COMM_PRICE
	private int merchantId = 0;		//所属商家		COMM_MERCHID
	private String type = null;     //商品种类		COMM_TYPE
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date addedDate = null;  //商品添加日期 	COMM_ADDEDDATE
	private byte[] image = null; 	//商品图片		COMM_IMAGE
	private String info = null;		//商品简介		COMM_INFO
	private int stock = 0;			//商品库存数量		COMM_STOCK
	

	//Getters & Setters
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public String getName() { return name; } 
	public void setName(String name) { this.name = name; }
	public float getPrice() { return price; }
	public void setPrice(float price) { this.price = price; }
	public int getMerchantId() { return merchantId; }
	public void setMerchantId(int merchantId) { this.merchantId = merchantId; }
	public Date getAddedDate() { return addedDate; }
	public void setAddedDate(Date addedDate) { this.addedDate = addedDate; }
	public byte[] getImage() { return image; }
	public void setImage(byte[] image) { this.image = image; }
	public String getInfo() { return info; }
	public void setInfo(String info) { this.info = info; }
	public int getStock() { return stock; }
	public void setStock(int stock) { this.stock = stock; }
}
