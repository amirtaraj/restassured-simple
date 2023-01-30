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
    private String apiEndpoint;
    private int responseCode;

    @Given("I have the API endpoint for {string}")
    public void setApiEndpoint(String operation) {
        String baseUrl = ConfigUtils.getBaseUrl();
        apiEndpoint = baseUrl + operation;
    }

    @When("I send a {string} request to the API")
    public void sendRequest(String operation) {
        switch (operation) {
            case "post":
                responseCode = RestUtils.postRequest(apiEndpoint, "{}").getStatusCode();
                break;
            case "put":
                responseCode = RestUtils.putRequest(apiEndpoint, "{}").getStatusCode();
                break;
            case "get":
                responseCode = RestUtils.getRequest(apiEndpoint).getStatusCode();
                break;
            case "delete":
                responseCode = RestUtils.deleteRequest(apiEndpoint).getStatusCode();
                break;
        }
    }

    @Then("I should receive a {int} response")
    public void validateResponseCode(int expectedResponseCode) {
        Assert.assertEquals(expectedResponseCode, responseCode);
    }
}
