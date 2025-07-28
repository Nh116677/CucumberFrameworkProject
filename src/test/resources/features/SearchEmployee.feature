Feature: Search Employee

  Background:
    #Given user is navigated to HRMS application
    When user enters username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on employee list option

@employeeId
  Scenario: Search by employee Id
    When user enters valid employee id
    And user clicks on the search button
    Then user should be able to see employee detail
@employeename
  Scenario: Search by employee name
    When user enters valid employee name
    And user clicks on the search button
    Then user should be able to see employee details
@invalidname
  Scenario: Invalid search by employee name
    When user enters invalid employee name
    And user click on the search button
  Then user can see the name error message


  @invalidId
  Scenario: Invalid search by employee ID
    When user enters invalid employee ID
    And user click on the search button
    Then user can see the ID error message