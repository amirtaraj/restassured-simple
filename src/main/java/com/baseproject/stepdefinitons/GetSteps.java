package com.baseproject.stepdefinitons;

import com.baseproject.utils.RestUtils;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class GetSteps {

    private Response response;

    @When("I perform a GET request")
    public void getRequest(){
        response = RestUtils.performGetRequest();
    }
}