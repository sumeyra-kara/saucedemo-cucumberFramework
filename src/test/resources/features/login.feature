Feature: Login Functionality
  As a user, I should be able to login with different credentials
  @wip
  Scenario Outline: positive login test wit DDT
    Given user is on the login page
    When user enters "<username>" username "<password>" password and clicks on the login button
    Then verify that user can see "Products" on the Dashboard
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | problem_user            | secret_sauce |
