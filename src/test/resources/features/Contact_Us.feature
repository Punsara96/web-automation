@contact-us @regression

Feature: WebDriver University - Contact Us Page

  Scenario: Validate successful submission - Unique data
    Given I access the webdriver university contact us page
    When I enter a unique first name
    And I enter a unique last name
    And I enter a unique email address
    And I enter a unique comment
    And I click on the submit button
    Then I should be presented with a successful contact us submission message


  Scenario: Validate successful submission - Specific data
    Given I access the webdriver university contact us page
    When I enter a specific first name punsara
    And I enter a specific last name achintha
    And I enter a specific email address punsara@gmail.com
    And I enter a specific comment "hello world"
    And I click on the submit button
#    Then I should be presented with a successful contact us submission message






