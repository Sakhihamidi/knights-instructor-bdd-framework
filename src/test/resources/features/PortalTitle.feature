Feature: Testing application title

  Scenario: page title should be Tek Insurance Service
    Given Open browser and navigate
    Then Validate application title should be "Tek Insurance Service"
    Then Close browser