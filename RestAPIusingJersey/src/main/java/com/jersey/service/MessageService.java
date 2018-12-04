package com.jersey.service;

import java.util.Map;

import com.jersey.util.MessageUtils;

public class MessageService {
	public Map<Integer, String> getMessages() {
		return MessageUtils.getMessages();
	}
}
