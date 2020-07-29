package com.neusoft.ecs.cm.service.ifs;

import java.util.List;

import com.neusoft.ecs.cm.model.CommentModel;

//商品管理模块 - 商品评论 - Service接口

public interface ICommentService 
{
	//增加评论
	public void add(CommentModel commentModel) throws Exception;
	
	//删除评论
	public void delete(CommentModel commentModel) throws Exception;
	
	//修改评论
	public void modify(CommentModel commentModel) throws Exception;
	
	//查看全部评论
	public List<CommentModel> getAll() throws Exception;

	//根据评论ID查找评论
	public CommentModel getById(int id) throws Exception;
}
