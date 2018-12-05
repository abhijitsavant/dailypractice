package com.jersey.util;

import java.util.HashMap;
import java.util.Map;

import com.jersey.bean.Message;

public class MessageUtils {
	private static Map<Integer,Message> messages = new HashMap<>();
	static {
		messages.put(1, new Message(1, "Hi"));
		messages.put(2, new Message(2, "Jersey"));
	}
	public static Map<Integer, Message> getMessages() {
		return messages;
	}
	public static Message getMessage(int id) {
		return messages.get(id);
	}
	public static Message createMessage(Message message) {
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	public static Message updateMessage(int id,Message message) {
		message.setId(id);
		messages.put(id, message);
		return message;
	}
	public static Message deleteMessage(int id) {
		return messages.remove(id);
	}
}
