package com.baseproject.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestUtils {

	public static Response postRequest(String url, String body) {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.body(body);
		return request.post(url);
	}

	public static Response putRequest(String url, String body) {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.body(body);
		return request.put(url);
	}

	public static Response getRequest(String url) {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		return request.get(url);
	}

	public static Response deleteRequest(String url) {
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		return request.delete(url);
	}

}
