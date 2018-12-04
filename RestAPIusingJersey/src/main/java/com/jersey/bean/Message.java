package com.jersey.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ABHIJIT
 *
 */
@XmlRootElement
public class Message {
	private int id;
	private String content;
	public Message() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
