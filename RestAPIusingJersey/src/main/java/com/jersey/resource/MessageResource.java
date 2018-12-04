package com.jersey.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jersey.service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService messageService = new MessageService();
	/*
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got itttttt!";
    }*/
	@GET
    //@Produces(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getMessages(){
		return new ArrayList<>(messageService.getMessages().values());
	}
	
	
	
}
