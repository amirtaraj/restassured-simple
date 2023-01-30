package com.baseproject.stepdefinitons;

import com.baseproject.utils.ConfigUtils;
import com.baseproject.utils.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;


public class BaseSteps {
    @Given("I have set the base URL")
    public void setBaseUrl() {
        String baseUrl = ConfigUtils.getBaseUrl();
        RestUtils.setBaseUrl(baseUrl);
    }

    @Given("I have set the content type to {string}")
    public void setContentType(String contentType) {
        RestUtils.setContentType(contentType);
    }

    @When("I perform a POST request to {string} with payload {string}")
    public void performPostRequest(String endpoint, String payload) {
        RestUtils.performPostRequest(endpoint, payload);
    }

    @Then("I should receive a response with status code {int}")
    public void checkStatusCode(int expectedStatusCode) {
        assertEquals(expectedStatusCode, RestUtils.response.getStatusCode());
    }
}