package com.nanal.rest_assured_training;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleGetRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		Response response =	RestAssured.get("http://google.co.in");

		int statuscode =response.statusCode();	
		
		String statusline = response.statusLine();
		System.out.println(statuscode);
		System.out.println(statusline);

		



	}

}
