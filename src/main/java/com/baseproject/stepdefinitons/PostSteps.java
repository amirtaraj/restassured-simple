package com.baseproject.stepdefinitons;

import com.baseproject.utils.RestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class PostSteps {

    @When("I perform a POST request to with payload {string}")
    public void performPostRequest(String payload) throws IOException {
        RestUtils.performPostRequest(payload);
    }

}