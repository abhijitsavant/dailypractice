package com.jersey.util;

import java.util.HashMap;
import java.util.Map;

public class MessageUtils {
	private static Map<Integer,String> messages = new HashMap<>();
	
	public static Map<Integer, String> getMessages() {
		return messages;
	}
}
