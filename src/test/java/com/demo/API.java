package com.demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class API {

	public static void main(String[] args) {
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		 Response response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(API.AddPlace()).when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).extract().response();
		 
		 
		 response.getBody().asString().contains(DEFAULT_SESSION_ID_VALUE);
		
		
	
		
	}

	public static String AddPlace()

	{
		return "{\r\n" + "  \"location\": {\r\n" + "    \"lat\": -38.383494,\r\n" + "    \"lng\": 33.427362\r\n"
				+ "  },\r\n" + "  \"accuracy\": 50,\r\n" + "  \"name\": \"Rahul Shetty Academy\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n" + "  \"types\": [\r\n" + "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n" + "  ],\r\n" + "  \"website\": \"http://rahulshettyacademy.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n" + "}\r\n" + "";

	}

}
