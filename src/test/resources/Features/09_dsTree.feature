Feature: I)Automatating Tree Module pages

  @TreePage
  Scenario: Get started to Tree from DS Algo home page
    Given User is on the DS algo home page
    When User clicks Get started button from Tree pane
    Then User should be redirected to "Tree" Tree home page

  #------------------------------------------- Overview of Trees Link 1 -------------------------------------------------------------------------------------
  @OverviewofTree
  Scenario: Tree home page Link
    Given User is on Tree home page
    When User clicks Overview of Trees link
    Then User should be redirected to "Overview of Trees" Tree OT page

  @PythonEditor
  Scenario: Overview of Trees page
    Given User is on Overview of Trees page
    When User clicks a Try Here link on Overview of Trees page
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
      | sheetname   | colname             | rownum |
      | Python_code | Python_Invalid_Data |      2 |

  @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Valid_Data |      2 |

  @previousPage
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #------------------------------------------------ Terminologies Link 2 -------------------------------------------------------------------------------------------
  @Terminologies
  Scenario: Terminologies page Link
    Given User is on Overview of Trees page
    When User clicks Terminologies link
    Then User should be redirected to "Terminologies" Tree Terminologies page

  @PythonEditor
  Scenario: Terminologies page
    Given User is on Terminologies page
    When User clicks a Try Here link on Terminologies page
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
      | sheetname   | colname             | rownum |
      | Python_code | Python_Invalid_Data |      2 |

  @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Valid_Data |      2 |

  @previousPage
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #--------------------------------------------- Types of Trees Link 3 -------------------------------------------------------------------------------
  @TypesofTrees
  Scenario: Types of Trees page Link
    Given User is on Terminologies page
    When User clicks Types of Trees link
    Then User should be redirected to "Types of Trees" Types of Trees page

  @PythonEditor
  Scenario: Types of Trees page
    Given User is on Types of Trees page
    When User clicks a Try Here link on Types of Trees page
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
      | sheetname   | colname             | rownum |
      | Python_code | Python_Invalid_Data |      2 |

  @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Valid_Data |      2 |

  @previousPage
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #---------------------------------------- Tree Traversals Link 4 -----------------------------------------------------------------------------------
  @TreeTraversals
  Scenario: Tree Traversals page Link
    Given User is on Types of Trees page
    When User clicks Tree Traversals link
    Then User should be redirected to "Tree Traversals" Tree Traversals of Tree page

  @PythonEditor
  Scenario: Tree Traversals page
    Given User is on Tree Traversals page
    When User clicks a Try Here link on Tree Traversals page
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
      | sheetname   | colname             | rownum |
      | Python_code | Python_Invalid_Data |      2 |

  @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Valid_Data |      2 |

  @previousPage
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #---------------------------------------- Traversals-Illustration Link 5 -----------------------------------------------------------------------------------
  @TraversalsIllustration
  Scenario: Traversals-Illustration page Link
    Given User is on Tree Traversals page
    When User clicks Traversals-Illustration link
    Then User should be redirected to "Traversals-Illustration" Traversals-Illustration Tree page

  @PythonEditor
  Scenario: Traversals-Illustration page
    Given User is on Traversals-Illustration page
    When User clicks a Try Here link on Traversals-Illustration page
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
      | sheetname   | colname             | rownum |
      | Python_code | Python_Invalid_Data |      2 |

  @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Valid_Data |      2 |

  @previousPage
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #---------------------------------------- Binary Trees Link 6 -----------------------------------------------------------------------------------
  @BinaryTrees
  Scenario: Binary Trees page Link
    Given User is on Traversals-Illustration page
    When User clicks Binary Trees link
    Then User should be redirected to "Binary Trees" Binary Trees page

  @PythonEditor
  Scenario: Binary Trees page
    Given User is on Binary Trees page
    When User clicks a Try Here link on Binary Trees page
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
      | sheetname   | colname             | rownum |
      | Python_code | Python_Invalid_Data |      2 |

  @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Valid_Data |      2 |

  @previousPage
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #---------------------------------------- Types of Binary Trees Link 7 -----------------------------------------------------------------------------------
  @TypesofBinaryTrees
  Scenario: Types of Binary Trees page Link
    Given User is on Binary Trees page
    When User clicks Types of Binary Trees link
    Then User should be redirected to "Types of Binary Trees" Types of Binary Trees page

  @PythonEditor
  Scenario: Types of Binary Trees page
    Given User is on Types of Binary Trees page
    When User clicks a Try Here link on Types of Binary Trees page
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
      | sheetname   | colname             | rownum |
      | Python_code | Python_Invalid_Data |      2 |

  @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Valid_Data |      2 |

  @previousPage
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #---------------------------------------- Implementation in Python Link 8 -----------------------------------------------------------------------------------
  @ImplementationinPython
  Scenario: Implementation in Python page Link
    Given User is on Types of Binary Trees page
    When User clicks Implementation in Python link
    Then User should be redirected to "Implementation in Python" Implementation in Python Tree page

  @PythonEditor
  Scenario: Implementation in Python page
    Given User is on Implementation in Python page
    When User clicks a Try Here link on Implementation in Python page
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
      | sheetname   | colname             | rownum |
      | Python_code | Python_Invalid_Data |      2 |

  @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Valid_Data |      2 |

  @previousPage
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #---------------------------------------- Binary Tree Traversals Link 9 -----------------------------------------------------------------------------------
  @binaryTreeTraversals
  Scenario: Binary Tree Traversals page Link
    Given User is on Implementation in Python page
    When User clicks Binary Tree Traversals link
    Then User should be redirected to "Binary Tree Traversals" Binary Tree Traversals page

  @PythonEditor
  Scenario: Binary Tree Traversals page
    Given User is on Binary Tree Traversals page
    When User clicks a Try Here link on Binary Tree Traversals page
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
      | sheetname   | colname             | rownum |
      | Python_code | Python_Invalid_Data |      2 |

  @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Valid_Data |      2 |

  @previousPage
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #---------------------------------------- Implementation of Binary Trees Link 10 -----------------------------------------------------------------------------------
  @ImplementationofBinaryTrees
  Scenario: Implementation of Binary Trees page Link
    Given User is on Binary Tree Traversals page
    When User clicks Implementation of Binary Trees link
    Then User should be redirected to "Implementation of Binary Trees" Implementation of Binary Trees page

  @PythonEditor
  Scenario: Implementation of Binary Trees page
    Given User is on Implementation of Binary Trees page
    When User clicks a Try Here link on Implementation of Binary Trees page
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
      | sheetname   | colname             | rownum |
      | Python_code | Python_Invalid_Data |      2 |

  @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Valid_Data |      2 |

  @previousPage
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #---------------------------------------- Applications of Binary trees Link 11 -----------------------------------------------------------------------------------
  @applicationsofBinaryTrees
  Scenario: Applications of Binary trees page Link
    Given User is on Implementation of Binary Trees page
    When User clicks Applications of Binary trees link
    Then User should be redirected to "Applications of Binary trees" Applications of Binary trees page

  @PythonEditor
  Scenario: Applications of Binary trees page
    Given User is on Applications of Binary trees page
    When User clicks a Try Here link on Applications of Binary trees page
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
      | sheetname   | colname             | rownum |
      | Python_code | Python_Invalid_Data |      2 |

  @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Valid_Data |      2 |

  @previousPage
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #---------------------------------------- Binary Search Trees Link 12 -----------------------------------------------------------------------------------
  @binarySearchTrees
  Scenario: Binary Search Trees page Link
    Given User is on Applications of Binary trees page
    When User clicks Binary Search Trees link
    Then User should be redirected to "Binary Search Trees" Binary Search Treese page

  @PythonEditor
  Scenario: Binary Search Trees page
    Given User is on Binary Search Trees page
    When User clicks a Try Here link on Binary Search Trees page
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
      | sheetname   | colname             | rownum |
      | Python_code | Python_Invalid_Data |      2 |

  @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Valid_Data |      2 |

  @previousPage
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #---------------------------------------- Implementation Of BST Link 13 -----------------------------------------------------------------------------------
  @implementationofBST
  Scenario: Implementation Of BST page Link
    Given User is on Binary Search Trees page
    When User clicks Implementation Of BST link
    Then User should be redirected to "Implementation Of BST" Implementation Of BST Tree page

  @PythonEditor
  Scenario: Implementation Of BST page
    Given User is on Implementation Of BST page
    When User clicks a Try Here link on Implementation Of BST page
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
      | sheetname   | colname             | rownum |
      | Python_code | Python_Invalid_Data |      2 |

  @PythonEditor_Valid
  Scenario Outline: Python Editor page with valid data
    Given The user is on the tryEditor page
    And enters data in the Editor after reading data from excel sheet "<sheetname>" with column_name "<colname>" and row_number <rownum>
    When User clicks a run button
    Then output should be displayed on the console

    Examples: 
      | sheetname   | colname           | rownum |
      | Python_code | Python_Valid_Data |      2 |

  @previousPage
  Scenario: User go back to the previous page
    Given The user is already on tryEditor page
    When User able to see output in console
    Then User go back to the previous page

  #-------------------------------- Practice Question -------------------------------------------------------------------------------------------------
  @PracticeQuestions
  Scenario: Tree page Practice Questions
    Given User is on Implementation Of BST page
    When User clicks Practice Questions link of tree
    Then User should be redirected to " Practice Questions " Practice Questions of Tree page

  @backtoDSHomePage
  Scenario: User go back to the DS Algo home page
    Given The user is already on Practice Questions page
    When Nothing is displayed on the page
    Then User go back to the "https://dsportalapp.herokuapp.com/home" DS Algo home page
