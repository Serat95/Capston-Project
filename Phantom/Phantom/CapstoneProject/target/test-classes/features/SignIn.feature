Feature: Retail SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @SignInTC01
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'Seratnazir@gmail.com' and password 'Sirat95608!!'
    And User click on login button
    Then User should be logged in into Account

  @SignInTC02
  Scenario: : Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name  | email                | password   | confrimPassword |
      | Dejai | Dejay29@tekschool.us | Dejay@8983 | Dejay@8983      |
    And User click on SignUp button
    Then User should be logged into account page
