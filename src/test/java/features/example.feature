Feature: Example Feature

  Scenario: Example Scenario
    Given I have set the base URL
    And I have set the content type to "application/json"
    When I perform a POST request to "/api/users" with payload "{\"name\": \"morpheus\",\"job\": \"leader\"}"
    Then I should receive a response with status code 201
