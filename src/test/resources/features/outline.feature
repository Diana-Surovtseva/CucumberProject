Feature: Scenario Outline

  @Regression
  Scenario Outline: Login to Jira
    Given I navigate to Jira Login Page

    When I enter Username as "<username>" and Password as "<password>"
    And I click on the login button
    Then login should be unsuccessful
    Examples:
      | username  | password  |
      | username1 | password1 |
      | username2 | password2 |