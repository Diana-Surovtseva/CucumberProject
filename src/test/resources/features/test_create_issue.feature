Feature: Create issue in Jira

  Background:
    Given I navigate to Jira Login Page
    And I enter user name - "webinar5"
    And I enter password - "webinar5"
    And I click on the login button

  @Regression
  Scenario:
    When I am on the Home Page
    And I click on the create issue button
    Then Create issue window is open
    And I clear project field
    And I input text to project field
    And I go to the Issue type field
    And I clear to issue-type field
    And I input text to issue-type field
    And I go to the Summary field
    And I input text to Summary field
    And I clear Reporter field
    And I input text to Reporter field
    When I press on the create button
    Then An issue is created
    And The issue number is shown