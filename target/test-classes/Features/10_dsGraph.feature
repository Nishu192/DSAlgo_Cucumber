Feature: J)Automatating Graph Module pages

@Graphpage
  Scenario: Get started to graph from DS Algo home page
    Given User is on DS algo home page 
    When User clicks Get started button
    Then User should be redirected to "https://dsportalapp.herokuapp.com/graph/" graph home page

@Graphpage
  Scenario: Graph home page
    Given User is on Graph home page
    When User clicks Graph link
    Then User should be redirected to "Graph" graph page
 
 @PythonEditor
  Scenario: Graph page
    Given User is on Graph page
    When User clicks Try Here link
    Then User should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" tryEditor page having Editor and run button

@PythonEditor_Blank
  Scenario: Python Editor page without data
    Given The user is on tryEditor page
    When The user clicks the run button without entring the code in the Editor
    Then Nothing happens to the page and no error message is displayed

@PythonEditor_Invalid
  Scenario Outline: Python Editor page with Invalid data
    Given User is on the tryEditor page
    And enters the data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When The User clicks a run button
    Then The user see error msg in alert window and press ok button

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Invalid_Data |      2 |

@PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname         | rownum |
      | Python_code | Python_Valid_Data |      2 |

@previousPage
  Scenario: User go back to Graph page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

@GraphRepresentations
  Scenario: Graph page second link
    Given User is on Graph page
    When User clicks Graph Representations link
    Then User should be redirected to "Graph Representations" Graph Representations page

@PythonEditor
  Scenario: Graph Representations page
    Given User is on Graph Representations page
    When User clicks Try Here link
    Then User should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" tryEditor page having Editor and run button

@PythonEditor_Blank
  Scenario: Python Editor page without data
    Given The user is on tryEditor page
    When The user clicks the run button without entring the code in the Editor
    Then Nothing happens to the page and no error message is displayed

@PythonEditor_Invalid
  Scenario Outline: Python Editor page with Invalid data
    Given User is on the tryEditor page
    And enters the data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When The User clicks a run button
    Then The user see error msg in alert window and press ok button

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Invalid_Data |      2 |

 @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname         | rownum |
      | Python_code | Python_Valid_Data |      2 |

 @previousPage
  Scenario: User go back to Graph page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

@GraphPracticeQuestions
  Scenario: Graph page Practice Questions
    Given User is on Graph page
    When User clicks Practice Questions link
    Then User should be redirected to " Practice Questions " Practice Questions page

@backtoDSHomePage
  Scenario: User go back to the DS Algo home page
    Given The user is already on Practice Questions page of Graph
    When Nothing is displayed on the page of Practice Questions
    Then User go back to the "https://dsportalapp.herokuapp.com/home" DS home page
