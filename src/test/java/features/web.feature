Feature: Web Automation

  @web
  Scenario: user log in with valid account
    Given user in home page
    Then User click login text
    And user input valid username with "Username0123"
    And user input valid password with "password0123"
    And user click login button
    And user success to login

  @web
  Scenario: user log in with invalid account
    Given user in home page
    Then User click login text
    And user input valid username with "Username01234"
    And user input valid password with "password01234"
    And user click login button
    And user stay on logging form

  @web
  Scenario: user log out from active account
    Given user in home page
    Then User click login text
    And user input valid username with "Username0123"
    And user input valid password with "password0123"
    And user click login button
    And user direct in home page
    And user click logout text
    And user success to log out


  @web
  Scenario: user add 1 monitor item to chart
    Given user in home page
    Then user going to monitor page
    And User add item to chart
    And user going to home page
    And user click cart text
    And user see added item in cart

  @web
  Scenario: user add all  monitors item to chart
    Given user in home page
    Then user going to monitor page
    And User add item to chart
    And user going to home page
    And user going to monitor page
    And User add second item to chart
    And user going to home page
    And user click cart text
    And user see added item in cart

  @web
  Scenario: user add 1 item for each category to chart
    Given user in home page
    Then User add item to chart
    And user going to home page
    And user going to laptop page
    And User add item to chart
    And user going to home page
    And user going to monitor page
    And User add item to chart
    And user going to home page
    And user click cart text
    And user see added item in cart






