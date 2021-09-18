@Test
Feature: Simple Github test with Allure on Cucumber

  Scenario: Simple Github test
    Given Open main page on Github
    When Search repository with name "eroshenkoam/allure-example"
    And Click to repository name "eroshenkoam/allure-example"
    And Click on tab Issues
    Then Check Issue with number "68"