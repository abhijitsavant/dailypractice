package com.jersey.bean;

/**
 * @author ABHIJIT
 * Class created for HATEOAS implementation
 *
 */
public class Link {
	private String link;
	private String url;
	public Link(){
		
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
