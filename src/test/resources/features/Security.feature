Feature: Application Security Functions

  Scenario: Validate Login Section Title US_3
    Then Validate the header title is "TEK Insurance Portal"
    Then Validate login section title "Customer Service Portal"

  Scenario: Validate Login button disable and enabled US_4
    Then Validate login button is "disabled"
    When Enter username as "supervisor"
    When Enter password as "tek_supervisor"
    Then Validate login button is "enabled"

  Scenario: Validate login with valid username and password
    When Enter username as "supervisor"
    When Enter password as "tek_supervisor"
    When Click on login button
    Then Validate the header title is "Tek Insurance App"
    Then Validate logged in username is "Supervisor"