Feature: Add employee scenarios

  Background:
    #Given user is able to access HRMS application
    When user enters valid username and password
    And user click on login button
    Then user is able to see dashboard page
    When user clicks on PIM option
    And user clicks on Add employee option


  @test
  Scenario: Adding new employee
    And user enters firstName, middleName  and lastName
    And user clicks on save button
    Then employee is added successfully

  Scenario: Adding employee unique employee ID
    And user enters firstname,  middlename, lastname and employee Id
    And user clicks on save button
    Then employee is added successfully

  @datatable
  Scenario Outline: adding multiple employees for data driven testing using examples table
    And user enters "<firstName>" and "<middleName>" and "<lastName>" values
    And user clicks on save button
    Then employee is added successfully
    Examples:
      | firstName | middleName | lastName  |
      | John      | Ada        | Smith     |
      | Michael   | Lane       | Johnson   |
      | Robert    | Joy        | Davis     |
      | David     | Thea       | Lopez     |
      | Patricia  | Ruth       | Wilson    |
      | Linda     | Sara       | Anderson  |
      | Elizabeth | Eve        | Williams  |
      | Jessica   | Mina       | Brown     |
      | Susan     | Anne       | Rodriguez |
      | Karen     | Bridget    | Garcia    |


  @exceltable
  Scenario: adding multiple employees using excel table
    And user enters firstname middlename and lastname values from excel table
      | firstName | middleName | lastName  |
      | John      | Ada        | Smith     |
      | Michael   | Lane       | Johnson   |
      | Robert    | Joy        | Davis     |
      | David     | Thea       | Lopez     |
      | Patricia  | Ruth       | Wilson    |
      | Linda     | Sara       | Anderson  |
      | Elizabeth | Eve        | Williams  |
      | Jessica   | Mina       | Brown     |
      | Susan     | Anne       | Rodriguez |
      | Karen     | Bridget    | Garcia    |


  @excel
  Scenario: adding employees using excel
    And user enters multiple employees using excel file