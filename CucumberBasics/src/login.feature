Feature: Login
  
  In order to perform successful login 
  As a user
  I want to enter correct username and password

  Scenario Outline: In order to verify login to facebook
    Given user navigates to facebook website
    When user validates the home page title
    Then user entered "<username> " username
    And user entered "<password> " password
    And user selects the age category
      | Age      |
      | Below 18 |
      | Above 18 |
    Then user "<loginType> " be successfully logged in

    Examples: 
      | username | password | loginType |
      | valid    | valid    | should    |
      | invalid  | invalid  | shouldnot |
