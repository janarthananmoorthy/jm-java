package com.jana.model;

public class URLObject {


	int id;
	String url;
	int statusCode;
	long loadTime;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public long getLoadTime() {
		return loadTime;
	}
	public void setLoadTime(long loadTime) {
		this.loadTime = loadTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
