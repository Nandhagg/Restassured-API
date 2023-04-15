package com.nanal.rest_assured_training;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class SamplePutRequest {
	@Test
	public void Putrequest() {
		
		JSONObject jsonobject = new JSONObject();
		
		jsonobject.put("name", "Jerry");
		jsonobject.put("job","Gartner");
		
		baseURI ="https://reqres.in";
		
		given().when().body(jsonobject.toJSONString()).put("/api/Users/2").then().statusCode(200);
		
	}
	
	@Test
	public void Deleterequest() {
		
		baseURI ="http://localhost:3000";
		
		given().when().delete("/employees/AbvpPZV").then().statusCode(200);
	}
}
