Feature: Login to Production
  
  In order to perform successful login to production
  As a user
  I want to enter correct username and password

  Scenario: In order to verify login to facebook production
    Given user navigates to facebook website
    When user validates the home page title
    Then user entered "valid" username
    And user entered "valid" password
    And user validates the captcha image
    Then user "shouldbe" be successfully logged in
    
   Scenario: In order to verify login to facebook production
    Given user navigates to facebook website
    When user validates the home page title
    Then user entered "invalid" username
    And user entered "invalid" password
    And user validates the captcha image
    Then user "shouldnot" be successfully logged in