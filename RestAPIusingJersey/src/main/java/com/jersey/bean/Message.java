package com.jersey.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ABHIJIT
 *
 */
@XmlRootElement
public class Message {
	private int id;
	private String content;
	private List<Link> links = new ArrayList<>();
	
	public Message() {
	}
	
	public Message(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
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
	
	public void addLink(String linkName,String url) {
		Link link = new Link();
		link.setLink(linkName);
		link.setUrl(url);
		links.add(link);
	}
}
