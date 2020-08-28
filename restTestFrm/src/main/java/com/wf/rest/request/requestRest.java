package com.wf.rest.request;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class requestRest {
	
	@SerializedName("title")
	@Expose
	private String title;
	@SerializedName("body")
	@Expose
	private String body;
	@SerializedName("userId")
	@Expose
	private int userId;

	public String getTitle() {
	return title;
	}

	public void setTitle(String title) {
	this.title = title;
	}

	public String getBody() {
	return body;
	}

	public void setBody(String body) {
	this.body = body;
	}

	public int getUserId() {
	return userId;
	}

	public void setUserId(int userId) {
	this.userId = userId;
	}

	public requestRest(String title, String body, Integer userId) {
		//super();
		this.title = title;
		this.body = body;
		this.userId = userId;
	}
	

}
