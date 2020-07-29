package com.neusoft.ecs.cm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.ecs.cm.mapper.ifs.ICommentMapper;
import com.neusoft.ecs.cm.model.CommentModel;
import com.neusoft.ecs.cm.service.ifs.ICommentService;

//商品管理模块 - 商品评论 - Service实现

@Service("CommentService")
@Transactional  
public class CommentServiceImpl implements ICommentService 
{
	@Autowired
	private ICommentMapper commentMapper=null;
	
	@Override
	public void add(CommentModel commentModel) throws Exception 
	{
		commentMapper.insert(commentModel);
	}

	@Override
	public void delete(CommentModel commentModel) throws Exception 
	{
		commentMapper.delete(commentModel);
	}

	@Override
	public void modify(CommentModel commentModel) throws Exception 
	{
		commentMapper.update(commentModel);
	}

	@Override
	public List<CommentModel> getAll() throws Exception 
	{
		return commentMapper.selectAll();
	}

	@Override
	public CommentModel getById(int id) throws Exception 
	{
		return commentMapper.selectById(id);
	}

}
