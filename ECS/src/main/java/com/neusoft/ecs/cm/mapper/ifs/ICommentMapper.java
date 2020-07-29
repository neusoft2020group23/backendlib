package com.neusoft.ecs.cm.mapper.ifs;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.ecs.cm.model.CommentModel;

//商品管理模块 - 商品评论 - Mapper接口

@Mapper
public interface ICommentMapper
{
	/***************
	 * 基本的增删改查
	 ***************/
	//根据CommentModel除主键以外的信息插入元组
	public void insert(CommentModel commentModel) throws Exception;
		
	//删除主键与CommentModel一致的元组
	public void delete(CommentModel commentModel) throws Exception;
		
	//根据 CommentModel除主键以外的信息 改写 主键与CommentModel一致 的元组
	public void update(CommentModel commentModel) throws Exception;
		
	//查看全部元组
	public List<CommentModel> selectAll() throws Exception;
		
	//根据CommentModel主键ID查找元组
	public CommentModel selectById(int id) throws Exception;
}