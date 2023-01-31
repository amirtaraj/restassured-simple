package com.baseproject.stepdefinitons;

import com.baseproject.utils.ConfigUtils;
import com.baseproject.utils.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import org.junit.Assert;

import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class BaseSteps {
    @Given("I have set the {string}")
    public void setBaseUrl(String base_url) {
        String baseUrl = ConfigUtils.getProperties(base_url);
        RestUtils.setBaseUrl(baseUrl);
    }

    @Given("I have set the path {string}")
    public void setBasePath(String base_path) {
        String basePath = ConfigUtils.getProperties(base_path + "_path");
        RestUtils.setBasePath(basePath);
    }

    @Given("I have set the content type to {string}")
    public void setContentType(String content_type) {
        String contentType;
        if (content_type.equals("application")) {
            contentType = ConfigUtils.getProperties("content_type");
        } else {
            contentType = ConfigUtils.getProperties(content_type);
        }
        RestUtils.setContentType(contentType);
    }

    @When("I perform a POST request to with payload {string}")
    public void performPostRequest(String payload) throws IOException {
        RestUtils.performPostRequest(payload);
    }

    @Then("I should receive a response with status code {int}")
    public void checkStatusCode(int expectedStatusCode) {
        assertEquals(expectedStatusCode, RestUtils.response.getStatusCode());
    }
}