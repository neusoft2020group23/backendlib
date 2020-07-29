package com.neusoft.ecs.om.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.type.Alias;

//订单管理模块 - 订单评论 - model
//对应数据库ecs中：order

@Alias("Order")
public class OrderModel
{
	private int id = 0;						//订单账号		ORDER_ID
	private int commodityId = 0;			//订单商品ID 		ORDER_COMMID
	private int num = 0;					//订单数量		ORDER_NUM
	private String address = null;			//订单地址		ORDER_ADDRESS
	private String merchantId = null;		//订单商人ID		ORDER_MERCHID
	private String buyerId = null;			//订单客户ID		ORDER_BUYERID
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String date = null;				//订单生成的时间	ORDER_DATE
	private String status = null;			//订单状态		ORDER_STATUS

	//Getters & Setters
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	public int getCommodityId() { return commodityId; }
	public void setCommodityId(int commodityId) { this.commodityId = commodityId; }
	public int getNum() { return num; }
	public void setNum(int num) { this.num = num; }
	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }
	public String getMerchantId() { return merchantId; }
	public void setMerchantId(String merchantId) { this.merchantId = merchantId; }
	public String getBuyerId() { return buyerId; }
	public void setBuyerId(String buyerId) { this.buyerId = buyerId; }
	public String getDate() { return date; }
	public void setDate(String date) { this.date = date; }
	public String getStatus() { return status; }
	public void setStatus(String status) { this.status = status; }


}
