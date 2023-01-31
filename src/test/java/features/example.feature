Feature: Example Feature

  Scenario: Example Post Scenario
    Given I have set the "base_url"
    Given I have set the path "users"
    And I have set the content type to "application"
    When I perform a POST request to with payload "{\"name\": \"morpheus\",\"job\": \"leader\"}"
    Then I should receive a response with status code 201
