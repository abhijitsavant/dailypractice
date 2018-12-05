package com.jersey.service;

import java.util.Map;

import com.jersey.bean.Message;
import com.jersey.util.MessageUtils;

public class MessageService {
	public Map<Integer, Message> getMessages() {
		return MessageUtils.getMessages();
	}

	public Message getMessage(int id) {
		return MessageUtils.getMessage(id);
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
