Feature: Add products to cart

  As a Swag Labs customer I want to add products to my cart In order to buy them

  Background:
    Given user is on the login page
    Then user logs in as "standard"
    And user verifies that "Swag Labs" page title is displayed

    Scenario: user can see items which are at the inventory
    Then user verify that 6 items at the inventory

    Scenario: user can get the list of items which are at the inventory
    Then user get list of all items at the inventory