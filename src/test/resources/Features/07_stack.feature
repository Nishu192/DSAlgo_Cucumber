Feature: G)To Automate  the Stack page of DS_Algo

  @stack_homepage
  Scenario: DS Algo home page
    Given The user is in the DS Home page after logged in
    When The user clicks the Get Started in Stack Panel or select Stack item from the drop down menu
    Then The user should be directed to "Stack" Stack Page

  @sp_operations
  Scenario: User Perform Operations on Stack page
    Given The user is in the  after logged in
    When The user clicks Operations in Stack button
    Then The user should be directed to the "Operations in Stack" Operations in Stack Page

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
	

  @sp_implementation
  Scenario: To test the Implementation on stack page
    Given The user is in the Stack page after logged in
    When The user clicks Implementation button
    Then The user should be directed to "Implementation" Implementation Page2
    
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
    

  @sp_application
  Scenario: To test application on stack page
    Given The user is in the Stack page1 after logged in
    When The user clicks Application button
    Then The user should be directed to "Applications" Applications Page3

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
    


  @sp_practiceQ
  Scenario: To test practice questions on stack page
    Given The user is in the Stack page2 after logged in
    When The user clicks Practice Questions button in Stack
    Then The user should be redirected to "Practice Questions" P Questions page

  @backtoDSHomePage
  Scenario: User go back to the DS Algo home page
    Given The user is already on Practice Questions page
    When Nothing is displayed on the page
    Then User go back to the "https://dsportalapp.herokuapp.com/home" DS Algo home page
 