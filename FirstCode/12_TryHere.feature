Feature: Check tryhere

  @Operationseditor
  Scenario: check user directed to tryeditor
    Given The user is in the Operations in Stack page
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a "Run" button to test
