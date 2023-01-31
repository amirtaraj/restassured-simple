package com.baseproject.stepdefinitons;

import com.baseproject.utils.RestUtils;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.io.IOException;

public class DeleteSteps {

    private Response response;

    @When("I perform a DELETE request")
    public void deleteRequest(){
        response = RestUtils.performDeleteRequest();
    }
}