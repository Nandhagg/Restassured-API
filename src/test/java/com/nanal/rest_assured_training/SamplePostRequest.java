package com.nanal.rest_assured_training;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.internal.ValidatableResponseImpl;
import io.restassured.response.ValidatableResponse;

public class SamplePostRequest {
	@Test
	public void PostRequest(){


		JSONObject jsonobject = new JSONObject();

		jsonobject.put("id", "5");
		jsonobject.put("first_name", "Nandha");
		jsonobject.put("last_name", "gopal");
		jsonobject.put("email", "nandha@nanal.com");


		System.out.println(jsonobject.toString());

		RestAssured.baseURI="http://localhost:3000";

		ValidatableResponse response = RestAssured.given().header("","").body(jsonobject.toJSONString()).post("/employees").then().statusCode(201);

		}
}
