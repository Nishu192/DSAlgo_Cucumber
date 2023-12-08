Feature: H)To test the Queue page

  Scenario: Enter into Queue page
    Given The user is on the DS Home page after logged in
    When The user clicks the GetStarted in Queue Panel or select QueueDS item from the drop down menu
    Then The user should be directed to "Queue" queue Page

  #---------------------------------- link 1: Implementation of Queue in Python---------------------------------------------------------
  @qp_Imple_Q_py
  Scenario: User Perform Implementation in python on queue page
    Given The user is in the Queue page after logged in
    When The user clicks Implementation of Queue in Python button
    Then The user should be directed to "Implementation of Queue in Python" Pageq1

  @Operationseditor
  Scenario: check user is directed to tryeditor
    Given The user is in the Implementation of Queue in Python in Queue page
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a "Run" button to test

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
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #--------------------------------------------- Link 2: Implementation using collections.deque---------------------------------------------------
  @qp_implementation.deq
  Scenario: To test the Implementation.dq on queue page
    Given The user is in the Implementation of Queue in Python in Queue page
    When The user clicks Implementation using Collections.deque button
    Then The user should be directed to "Implementation using collections.deque" collections deque Pageq2

  @Operationseditor
  Scenario: check user directed to tryeditor
    Given The user is in the Operations in Stack page
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a "Run" button to test

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
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #----------------------------------------- Link 3: Implementation using Array -------------------------------------------------------------
  @qp_Imp_array
  Scenario: To test the Implementation using array
    Given The user is in the Queue page after logged in
    When The user clicks Implementation using Array button
    Then The user should be directed to "Implementation using array" Implementation using Array Pageq3

  @Operationseditor
  Scenario: check user directed to tryeditor
    Given The user is in the Operations in Stack page
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a "Run" button to test

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
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #--------------------------------------------- Link 4: Queue Operations ---------------------------------------------------------------------
  @qp_Qoperations
  Scenario: To perform Queue Operations
    Given The user is in  Implementation using Array Page
    When The user clicks Queue Operations button
    Then The user should be directed to "Queue Operations" Queue Operations Pageq33

  @Operationseditor
  Scenario: check user directed to tryeditor
    Given The user is in the Operations in Stack page
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a "Run" button to test

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
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #------------------------------------- practice Question -----------------------------------------------------------------------
  @qp_pracQues
  Scenario: to test practice question link
    Given The user is in the Queue page
    When The user clicks Practice Questions on queue
    Then The user should be redirected to "Practice Questions" Practice Questions page of queue

  @backtoDSHomePage
  Scenario: User go back to the DS Algo home page
    Given The user is already on Practice Questions page
    When Nothing is displayed on the page
    Then User go back to the "https://dsportalapp.herokuapp.com/home" DS Algo home page
