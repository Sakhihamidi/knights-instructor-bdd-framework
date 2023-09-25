@Regression
Feature: CSR Plans Page Feature

  Background: Login and navigate to Plans
    Given Login with username as "supervisor" and password as "tek_supervisor"
    When Wait 2 Second
    When Click on "Plans" Link
    When Wait 2 Second

  @US_8
  Scenario: Validate Plans are exist in table
    Then Validate Section title is "Plans"
    Then Validate Table row is 4
    And Validate All Plans are Valid

  @US_11
  Scenario: Validate plan code headers
    Then Validate Section title is "Plans"
    Then validate plan table header
      | 0         | 1          | 2           | 3          | 4            | 5            |
      | Plan Type | Base Price | Date Expire | Created By | Date Created | Plan Expired |
