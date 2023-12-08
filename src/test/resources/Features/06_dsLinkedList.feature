Feature: F)Automatating Linked List Module pages

  @LinkedList_Page
  Scenario: Get started to Linked List from DS Algo home page
    Given User is on the DS algo portal home page
    When User clicks Get started button from Linked List pane
    Then User should be redirected to "Linked List" Linked List home page

  #---------------------------------------------------------Link 1: Introduction ------------------------------------------------------------------------------------
 	@Introduction
  Scenario: Introduction link of Linked List module
    Given User is on Linked List page in Linked List module
    When User clicks Introduction link
    Then User should be redirected to "Introduction" Introduction of Linked List page
	
	@PythonEditor
  Scenario: Introduction page
    Given User is on Introduction page
    When User clicks a Try Here link on Introduction of Linked List page
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
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #--------------------------------------------- Link 2: Creating Linked LIst -------------------------------------------------------------------------
  @CreatingLinkedList
  Scenario: Creating Linked LIst link of Linked List module
    Given User is on Introduction page
    When User clicks Creating Linked LIst link
    Then User should be redirected to "Creating Linked LIst" Creating Linked LIst of Linked List page

	@PythonEditor
  Scenario: Creating Linked LIst page
    Given User is on Creating Linked LIst page
    When User clicks a Try Here link on Creating Linked LIst of Linked List page
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
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #--------------------------------------------- Link 3: Types of Linked List -------------------------------------------------------------------------
  @TypesofLL
  Scenario: Types of Linked List link of Linked List module
    Given User is on Creating Linked LIst page
    When User clicks Types of Linked List link
    Then User should be redirected to "Types of Linked List" Types of Linked List of Linked List page

	@PythonEditor
  Scenario: Types of Linked List page
    Given User is on Types of Linked List page
    When User clicks a Try Here link on Types of Linked List of Linked List page
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
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #--------------------------------------------- Link 4: Implement Linked List in Python -------------------------------------------------------------------------
  @ImplementLLInPython
  Scenario: Implement Linked List in Python link of Linked List module
    Given User is on Types of Linked List page
    When User clicks Implement Linked List in Python link
    Then User should be redirected to "Implement Linked List in Python" Implement Linked List in Python of Linked List page

	@PythonEditor
  Scenario: Implement Linked List in Python page
    Given User is on Implement Linked List in Python page
    When User clicks a Try Here link on Implement Linked List in Python of Linked List page
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
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #--------------------------------------------- Link 5: Traversal -------------------------------------------------------------------------
  @Traversal
  Scenario: Traversal link of Linked List module
    Given User is on Implement Linked List in Python page
    When User clicks Traversal link
    Then User should be redirected to "Traversal" Traversal of Linked List page

	@PythonEditor
  Scenario: Traversal page
    Given User is on Traversal page
    When User clicks a Try Here link on Traversal of Linked List page
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
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #--------------------------------------------- Link 6: Insertion -------------------------------------------------------------------------
  @Insertion
  Scenario: Insertion link of Linked List module
    Given User is on Traversal page
    When User clicks Insertion link
    Then User should be redirected to "Insertion" Insertion of Linked List page

	@PythonEditor
  Scenario: Insertion page
    Given User is on Insertion page
    When User clicks a Try Here link on Insertion of Linked List page
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
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #--------------------------------------------- Link 7: Deletion -------------------------------------------------------------------------
  @Deletion
  Scenario: Deletion link of Linked List module
    Given User is on Insertion page
    When User clicks Deletion link
    Then User should be redirected to "Deletion" Deletion of Linked List page

	@PythonEditor
  Scenario: Deletion page
    Given User is on Deletion page
    When User clicks a Try Here link on Deletion of Linked List page
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
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #----------------------------------------------------------------------------------------------------------------------------------------------------
  @PracticeQuestions
  Scenario: Practice Questions link of Linked List module
    Given User is on Deletion page
    When User clicks  Practice Questions  link
    Then User should be redirected to " Practice Questions "  Practice Questions of Linked List page

	@backtoDSHomePage
  Scenario: User go back to the DS Algo home page
    Given The user is already on Practice Questions page
    When Nothing is displayed on the page
    Then User go back to the "https://dsportalapp.herokuapp.com/home" DS Algo home page
