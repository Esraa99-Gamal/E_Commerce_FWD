@smoke
  Feature: Select Euro currency from the dropdown list
#Navigate to home page from Hooks class
    Scenario: guest user could Select Euro currency
      Given Select Euro currency from the dropdown list on the top left of home page
      Then verify Euro Symbol is shown
