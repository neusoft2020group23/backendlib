package com.neusoft.ecs.cm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.ecs.cm.model.CommentModel;
import com.neusoft.ecs.cm.service.ifs.ICommentService;
import com.neusoft.ecs.result.Result;

//评论管理模块 - 商品评论 - REST API Controller

@RestController
@RequestMapping(value="/comment")
public class CommentController 
{
	@Autowired
	private ICommentService commentService=null;
	
	@PostMapping(value="/add")
	public Result<String> add(CommentModel commentModel) throws Exception
	{
		Result<String> result = new Result<String>();
		commentService.add(commentModel);
		result.setStatus("OK");
		result.setMessage("成功添加评论");
		return result;
	}
	
	@PostMapping(value="/delete")
	public Result<String> delete(CommentModel commentModel) throws Exception
	{
		Result<String> result = new Result<String>();
		commentService.delete(commentModel);
		result.setStatus("OK");
		result.setMessage("成功删除评论");
		return result;
	}
	
	@PostMapping(value="/modify")
	public Result<String> modity(CommentModel commentModel) throws Exception
	{
		Result<String> result = new Result<String>();
		commentService.modify(commentModel);
		result.setStatus("OK"); 
		result.setMessage("成功修改评论信息");
		return result;
	}
	
	@GetMapping(value="/get/all")
	public Result<CommentModel> getAll() throws Exception
	{
		Result<CommentModel> result = new Result<CommentModel>();
		result.setResultList(commentService.getAll());
		result.setStatus("OK"); 
		result.setMessage("成功取得所有评论信息");
		return result;
	}

	@GetMapping(value="/get/byid")
	public Result<CommentModel> getById(@RequestParam(required = true) int id) throws Exception
	{
		Result<CommentModel> result = new Result<CommentModel>();
		result.setResult(commentService.getById(id));
		result.setStatus("OK"); 
		result.setMessage("成功取得指定ID评论信息");
		return result;
	}
	

	 

	


}
