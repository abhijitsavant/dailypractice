package com.jersey.service;

import java.util.Map;

import com.jersey.bean.Message;
import com.jersey.exception.GenericException;
import com.jersey.util.MessageUtils;

public class MessageService {
	public Map<Integer, Message> getMessages() {
		return MessageUtils.getMessages();
	}

	public Message getMessage(int id) {
		Message message = MessageUtils.getMessage(id);
		if (message==null) {
			throw new GenericException("Not Found");
		}
		return message;
	}

	public Message createMessage(Message message) {
		return MessageUtils.createMessage(message);
	}

	public Message updateMessage(int id, Message message) {
		return MessageUtils.updateMessage(id, message);
	}

	public Message deleteMessage(int id) {
		return MessageUtils.deleteMessage(id);
	}
}
