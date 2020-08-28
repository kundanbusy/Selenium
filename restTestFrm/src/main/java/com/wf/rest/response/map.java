package com.wf.rest.response;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class map {
	
	@SerializedName("body")
	@Expose
	private String body;
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("userId")
	@Expose
	private int userId;

	public String getBody() {
	return body;
	}

	public void setBody(String body) {
	this.body = body;
	}

	public String getTitle() {
	return title;
	}

	public void setTitle(String title) {
	this.title = title;
	}

	public int getUserId() {
	return userId;
	}

	public void setUserId(int userId) {
	this.userId = userId;
	}

	public map(String body, String title, int userId) {
		//super();
		this.body = body;
		this.title = title;
		this.userId = userId;
	}
	
	}
