package com.neusoft.ecs.cm.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonFormat;

//商品管理模块 - 商品评论 - model
//对应数据库ecs中：comment

@Alias("Comment")
public class CommentModel 
{
	private int id = 0;					//评论编号		CMT_ID
	private String content = null;		//评论内容		CMT_COMTENT
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date = null;			//评论日期		CMT_DATE
	private String commenterId = null;  //评论人ID		CMT_CMTERID
	private int commodityId = 0;		//评论商品ID		CMT_COMMID
	
	
	//Getters & Setters
	public int getId() { return id; }
	public void setId(int id) {	this.id = id; }
	public String getContent() { return content; }
	public void setContent(String content) { this.content = content; }
	public Date getDate() { return date; }
	public void setDate(Date date) { this.date = date; }
	public String getCommenterId() { return commenterId; }
	public void setCommenterId(String commenterId) { this.commenterId = commenterId; }
	public int getCommodityId() { return commodityId; }
	public void setCommodityId(int commodityId) { this.commodityId = commodityId; }
}
