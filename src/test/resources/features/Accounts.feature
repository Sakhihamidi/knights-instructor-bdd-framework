Feature: Validate Accounts Table

  @US_9
  Scenario: Validate account table rows
    Given Login with username as "supervisor" and password as "tek_supervisor"
    When Wait 2 Second
    When Click on "Accounts" Link
    When Wait 60 Second
    Then Validate accounts table have 10 rows

  @US_10
  Scenario Outline: Validate Change Item per page
    Given Login with username as "supervisor" and password as "tek_supervisor"
    When Wait 2 Second
    When Click on "Accounts" Link
    When Wait 60 Second
    Then Validate accounts table have 10 rows
    When change item per page to "<itemPerPage>"
    When Wait 2 Second
    Then Validate accounts table have <itemPerPage> rows

    Examples:
      | itemPerPage |
      | 5           |
      | 25          |
      | 100         |