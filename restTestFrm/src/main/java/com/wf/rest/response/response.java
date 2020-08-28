package com.wf.rest.response;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class response {
	@SerializedName("id")
	@Expose
	private int id;
	@SerializedName("map")
	@Expose
	private map map;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public map getMap() {
		return map;
	}
	public void setMap(map map) {
		this.map = map;
	}
	public response(int id, com.wf.rest.response.map map) {
		//super();
		this.id = id;
		this.map = map;
	}
	
	

}
