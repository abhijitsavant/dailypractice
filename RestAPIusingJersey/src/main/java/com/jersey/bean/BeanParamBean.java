package com.jersey.bean;

import javax.ws.rs.CookieParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;

public class BeanParamBean { 
	private @MatrixParam(value = "matrixParam") String matrixParam;
	private @HeaderParam("Accept") String headerParam; 
	private @CookieParam("Cookie_1")String cookieParam;
	public String getMatrixParam() {
		return matrixParam;
	}
	public void setMatrixParam(String matrixParam) {
		this.matrixParam = matrixParam;
	}
	public String getHeaderParam() {
		return headerParam;
	}
	public void setHeaderParam(String headerParam) {
		this.headerParam = headerParam;
	}
	public String getCookieParam() {
		return cookieParam;
	}
	public void setCookieParam(String cookieParam) {
		this.cookieParam = cookieParam;
	}
	
	
}
