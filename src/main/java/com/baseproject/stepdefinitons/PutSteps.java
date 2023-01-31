package com.baseproject.stepdefinitons;

import com.baseproject.utils.RestUtils;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.io.IOException;

public class PutSteps {

    private Response response;

    @When("I perform a PUT request to with payload {string}")
    public void putRequest(String payload) throws IOException {
        response = RestUtils.performPutRequest(payload);
    }
}