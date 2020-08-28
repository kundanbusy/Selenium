package com.wf.rest.service;

import org.json.JSONObject;
import org.testng.Assert;

import com.google.gson.Gson;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import com.wf.rest.request.requestRest;
import com.wf.rest.request.serviceProperties;
import com.wf.rest.response.response;

public class testService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		requestRest req = new requestRest("Wells", "This is a rest payload", 120);
		JSONObject json = new JSONObject(req);
		RequestSpecification rs=RestAssured.given();
		rs.contentType("application/json");
		rs.accept("application/json");
		rs.body(json);
		System.out.println("Request ");
		System.out.println(json);
		System.out.println("--------------------");
		System.out.println("url"+serviceProperties.url);
		Response rsp=(Response)rs.post(serviceProperties.url);
		System.out.println("--------------------");
		System.out.println("Response");
		System.out.println(rsp.asString());
		
		Gson gson = new Gson();
		response restRsp;
		restRsp=(response) gson.fromJson(rsp.asString(), response.class);
		try {
		Assert.assertEquals(restRsp.getId(), 203);}
		catch (AssertionError ex)
		{
			System.out.println("Test Diff : "+ex.getMessage());
		}
		

	}

}
