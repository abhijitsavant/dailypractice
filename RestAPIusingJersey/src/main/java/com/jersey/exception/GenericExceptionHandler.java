package com.jersey.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.jersey.bean.ExceptionBean;
//@Provider
public class GenericExceptionHandler implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable genericException) {
		ExceptionBean exceptionBean = new ExceptionBean(12222, "Not Found");
		return Response.status(Status.NOT_FOUND).entity(exceptionBean).build();
	}

}
