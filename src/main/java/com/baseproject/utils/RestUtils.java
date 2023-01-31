package com.baseproject.utils;

import ch.qos.logback.core.net.SyslogOutputStream;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.sql.SQLOutput;

public class RestUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestUtils.class);
    public static RequestSpecification requestSpecification;
    public static Response response;

    public static void setBaseUrl(String baseUrl) {
        RestAssured.baseURI = baseUrl;
        requestSpecification = RestAssured.given();
        LOGGER.info("Sending POST request to endpoint: {}", RestAssured.baseURI);
    }

    public static void setBasePath(String basePath) {
        RestAssured.basePath = basePath;
        requestSpecification = RestAssured.given();
        LOGGER.info("Sending POST request to endpoint: {}", RestAssured.basePath);
    }

    public static void setContentType(String contentType) {
        requestSpecification.contentType(contentType);
    }

    public static Response performPostRequest(String payload) {
		RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        requestSpecification.body(payload);
        LOGGER.info("Payload: {}", payload);
        response = requestSpecification.post(RestAssured.basePath);
        response.then().log().all();
        LOGGER.info("Post URL: {}", RestAssured.baseURI + RestAssured.basePath);
		LOGGER.info("Received response status code: {}", response.getStatusCode());
		return response;
    }
}
