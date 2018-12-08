package com.jersey.resource;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.jersey.bean.BeanParamBean;
import com.jersey.bean.Message;
import com.jersey.service.MessageService;

@Path("/messages")
@Consumes(value= {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces(value= {MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.TEXT_PLAIN})
public class MessageResource {
	MessageService messageService = new MessageService();

	
	 @GET
	 public List<Message> getMessages() {
		 return new ArrayList<>(messageService.getMessages().values()); 
	 }
	 
	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam(value = "messageId") int id,@Context UriInfo uriInfo) {
		Message message = messageService.getMessage(id);
		message.addLink("self", uriInfo.getBaseUriBuilder().path(MessageResource.class).path(message.getId()+"").toString());
		return message;
	}

	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam(value = "messageId") int id, Message message) {
		return messageService.updateMessage(id, message);
	}

	@POST
	public Response createMessage(Message message, @Context UriInfo uriInfo) {
		Message messageCreated = messageService.createMessage(message);
		URI uri = uriInfo.getAbsolutePathBuilder().path(messageCreated.getId()+"").build();
		return Response.created(uri)
				.entity(messageCreated)
				.build();
	}

	@DELETE
	@Path("/{messageId}")
	public Message deleteMessage(@PathParam(value = "messageId") int id) {
		return messageService.deleteMessage(id);
	}

	@GET
	@Path("filter")
	public List<Message> getMessagesUsingQueryString(@QueryParam(value = "filter") String condition) {
		List<Message> filteredMessages = new ArrayList<>();
		List<Message> messages = new ArrayList<>(messageService.getMessages().values());
		for (Message message : messages) {
			if (condition.contains(message.getContent())) {
				filteredMessages.add(message);
			}
		}
		return filteredMessages;
	}
	
	@GET
	@Path("matrix")
	//pass param like query param seperated by ;
	public String testMatrixParam(@MatrixParam(value = "matrixParam") String matrixParam,@HeaderParam("Accept") String headerParam, @CookieParam("Cookie_1")String cookieParam) {
		return "This is matrix param : "+matrixParam+" Header Param: "+headerParam+" cookieParam : "+cookieParam;
	}

	@GET
	@Path("context")
	public String testContext(@Context UriInfo info,@Context HttpHeaders headers) {
		return info.getAbsolutePath().toString()+" "+headers.getCookies();
		
	}
	
	@GET
	@Path("beanparam")
	public String testBeanParam(@BeanParam BeanParamBean bean) {
		return bean.getCookieParam() +" "+ bean.getHeaderParam()+" "+bean.getMatrixParam();
		
	}
	
	@GET
	@Path("responsecode")
	public Response testSendResponse(@BeanParam BeanParamBean bean) {
		return Response.status(Status.CREATED).build();
	}
}
