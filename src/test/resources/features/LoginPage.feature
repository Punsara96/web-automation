@login @regression

Feature:Webdriver university - Login page

  Background:
    Given I access the webdriver university login page


  Scenario Outline: Verify successful and unsuccessful login
    When I enter valid username <username>
    And I enter valid password <password>
    And I click on the login button
    Then I should be presented with a successful login submission message <loginValidationText>

    Examples:
      | username  | password     | loginValidationText  |
      | webdriver | webdriver123 | validation succeeded |
      | webdriver | webdriver12  | validation failed    |
