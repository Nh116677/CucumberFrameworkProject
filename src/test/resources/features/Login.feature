Feature: Login Validation for HRMs Portal

  @AcceptanceCriteria1
  Scenario: Username field is empty
    Given the user is on the HRMs login page
    When the user leaves the username field empty
    And the user enters a valid password in the password field
    And the user clicks the Login button
    Then the user should see an error message stating Username cannot be empty.

  @AcceptanceCriteria2
  Scenario: Password field is empty
    Given the user is on the HRMs login page
    When the user enters a valid username in the username field
    And the user leaves the password field empty
    And the user clicks the Login button
    Then the user should see an error message stating Password cannot be empty.

  @AcceptanceCriteria3
  Scenario: User enters incorrect login credentials
    Given the user is on the HRMs login page
    When the user enters an incorrect username in the username field
    And the user enters an incorrect password in the password field
    And the user clicks the Login button
    Then the system should display an error message stating Invalid credentials.

  @AcceptanceCriteria4
  Scenario: Error messages are clearly visible near input fields
    Given the user is on the HRMs login page
    When the user clicks the Login button without entering any credentials
    Then the error message Username cannot be empty. should be displayed near the username field
    And the error message Password cannot be empty. should be displayed near the password field

  @AcceptanceCriteria5
  Scenario: User should be allowed to retry login after an error
    Given the user attempted to login with invalid credentials
    When the user corrects the username field
    And the user corrects the password field
    And the user clicks the Login button
    Then the user should be redirected to the HRMs dashboard
