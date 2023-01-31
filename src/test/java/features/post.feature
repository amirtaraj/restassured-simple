Feature: Post Request Feature

  Scenario: Example Post Scenario
    Given I have set the "base_url"
    And I have set the path "users"
    And I have set the content type to "application"
    When I perform a POST request to with payload "post_request"
    Then I should receive a response with status code 201
