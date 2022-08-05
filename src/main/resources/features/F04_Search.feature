@smoke
Feature: Search for product
  #Navigate to home page from Hooks class

#  Scenario Outline: user could search using product name
#    Given user clicks on search field
#    And enters product name as <name>
#    And user clicks on search button
#    Then  search shows relevant results
#    Examples:	| name |
#                |book|
#                |laptop|
#                |nike|
#
#  Scenario Outline: user could search for product using sku
#    Given user clicks on search field
#    And enters product name as <name>
#    And user clicks on search button
#    Then  search shows relevant results
#    Examples:	| name |
#                |SCI_FAITH|
#                |APPLE_CAM|
#                |SF_PRO_11|

  Scenario: user could search using PName
    Given user clicks on search field
    When user search for product like "Nokia"
    And user click on search Button
    Then user could search successfully and go to search page

  Scenario: user search using SKU
    Given   user clicks on search field
    When    user search for product like "AP_MBP_13"
    And     user click on search Button
    Then    user could search successfully with SKU