   Feature: K)Signing out from DS Algo Portal
   
   @SignOut
   Scenario: Signing out and Closing the browser
    Given The user is on DS Algo Home Page
    When The user click the Sign out link
    Then The user able to see successful message "Logged out successfully"
    And The user should able to see his Register and sign in  link on the right side of the DS Algo Introduction Page and After user logged out successfully close the browser
    
   