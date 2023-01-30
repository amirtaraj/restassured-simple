Feature: API Test Example

  Scenario Outline: Test API for various operations
    Given I have the API endpoint for <operation>
    When I send a <operation> request to the API
    Then I should receive a <response_code> response

    Examples:
      | operation | response_code |
      | "post"    | 201           |
      | "put"     | 200           |
      | "get"     | 200           |
      | "delete"  | 204           |
