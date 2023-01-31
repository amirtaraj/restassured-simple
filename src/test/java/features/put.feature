Feature: Put Request Feature

  Scenario: Example Put Scenario
    Given I have set the "base_url"
    And I have set the content type to "application"
    And I have set the path "users" with param "2"
    When I perform a PUT request to with payload "put_request"
    Then I should receive a response with status code 200
