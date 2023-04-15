package com.nanal.rest_assured_training;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class SampleGetRequest_01 {

	@Test
	public void GetRequest() {

		Response response = RestAssured.get("https://dummyjson.com/products");

		//	System.out.println(response.asString());

		ResponseBody responsebody = response.body();

		System.out.println(responsebody.asPrettyString());

	}

	@Test
	public void SecondGetRequest()
	{
		RestAssured.baseURI="http://localhost:3000";

		ValidatableResponse response = RestAssured.given().when().get("employees/4").then().statusCode(200);

		System.out.println(response.statusCode(200));


	}

}
