package com.jersey.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.jersey.bean.Message;
import com.jersey.service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService messageService = new MessageService();

	/*
	 * @GET
	 * 
	 * @Produces(MediaType.APPLICATION_XML) public List<Message> getMessages() {
	 * return new ArrayList<>(messageService.getMessages().values()); }
	 */
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam(value = "messageId") int id) {
		return messageService.getMessage(id);
	}

	@PUT
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Message updateMessage(@PathParam(value = "messageId") int id, Message message) {
		return messageService.updateMessage(id, message);
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Message createMessage(Message message) {
		return messageService.createMessage(message);
	}

	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message deleteMessage(@PathParam(value = "messageId") int id) {
		return messageService.deleteMessage(id);
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
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
}
