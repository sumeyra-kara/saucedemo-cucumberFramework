Feature: Login Functionality
  As a user, I should be able to login with different credentials

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


  Scenario Outline: negative login test wit DDT
    Given user is on the login page
    When user enters "<username>" username "<password>" password and clicks on the login button
    Then verify that user can see "<message>"
    Examples:
      | username        | password     | message                                                                   |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
      | locked_out_user | test         | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user |              | Epic sadface: Password is required                                        |
      | standard_user   | 12345        | Epic sadface: Username and password do not match any user in this service |
      | standard_user   |              | Epic sadface: Password is required                                        |
      | test            | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      |                 | secret_sauce | Epic sadface: Username is required                                        |
      |                 |              | Epic sadface: Username is required                                        |
      | +++             | ****         | Epic sadface: Username and password do not match any user in this service |


