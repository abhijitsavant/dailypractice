package com.jersey.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ExceptionBean {
	private long code;
	private String message;
	
	public ExceptionBean() {
		// TODO Auto-generated constructor stub
	}
	
	public ExceptionBean(long code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
