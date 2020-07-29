package com.neusoft.ecs.result;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

//REST API 结果类

public class Result<T> 
{
	private T result = null; 			//接收返回的单个model对象
	private List<T> resultList = null;  //接收返回的多个model对象
	
	private int intResult = 0;			//接收返回的int型结果
	private String strResult = null;	//接收返回的String型结果
	@JsonFormat(pattern = "yyyy-MM-dd") 
	private Date dateResult = null;		//接收返回的Date型结果
	
	private String status = null;		//返回执行的状态(OK/ERROR)
	private String message = null;		//返回执行的消息
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	public List<T> getResultList() {
		return resultList;
	}
	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}
	public int getIntResult() {
		return intResult;
	}
	public void setIntResult(int intResult) {
		this.intResult = intResult;
	}
	public String getStrResult() {
		return strResult;
	}
	public void setStrResult(String strResult) {
		this.strResult = strResult;
	}
	public Date getDateResult() {
		return dateResult;
	}
	public void setDateResult(Date dateResult) {
		this.dateResult = dateResult;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
