package com.nanal.rest_assured_training;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class JSONValidations {
	
	@Test
	public void Jsonvalidation() {
		
	//JSONObject jsonobject = new JSONObject();
	
	//jsonobject.get("https://dummyjson.com/Products");
	
	//System.out.println(jsonobject.toJSONString());
	
		get("https://dummyjson.com/Products/1").then().body("title", equalTo("iPhone 9"));
		
		get("https://dummyjson.com/Products/1").then().body("price", greaterThan(500));
		
			System.out.println("Overpriced");
			
		get("https://dummyjson.com/Products/1").then().body("discountPercentage", equalTo(12.96f));
	
	}

	
	}


