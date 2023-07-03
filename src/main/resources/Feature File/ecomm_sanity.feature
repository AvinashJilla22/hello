@web
Feature: Value Validation

  Scenario Outline: Verify the values displayed on the page
    Given I am on the '<value>' page
    Then I should see the correct values for all labels
    Examples:
      | value |
      | lblTtlVal|

