Feature: To test signup page
  Scenario: 01. Open account page
    Given main page is opened
    When a user clicks on account link
    Then account page is opened

    Scenario Outline: 011. Input email address
      When a user inputs email <email>
      And click Continue button
      Then a user is redirected to New customer page

      Examples:
        | email                      |
        | testEmail+398566@gmail.com |
