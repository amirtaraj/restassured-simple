Feature: Delete Request Feature

  @smoke
  Scenario: Example Delete Scenario
    Given I have set the "base_url"
    And I have set the content type to "application"
    And I have set the path "users" with param "2"
    When I perform a DELETE request
    Then I should receive a response with status code 204
