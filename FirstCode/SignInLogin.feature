Feature: Sign in with valid credentials
  I am on home page and I want to sign in

  Background: 
    Given The Trio Team Challengers starts testing the Data Structure Algo portal.

  Scenario: DS_Algo sign in
    Given User is on "https://dsportalapp.herokuapp.com/home" home page
    When User clicks sign in button
    Then User should be redirected to "https://dsportalapp.herokuapp.com/login" login page

  Scenario Outline: Login with valid credentials
    Given User is on login page
    When User enters "<username>" and "<password>"
    And Clicks login button
    Then User should be redirected to "https://dsportalapp.herokuapp.com/home" home page with username

    Examples: 
      | username            | password        |
      | Trioteamchallengers | triothebest@123 |
