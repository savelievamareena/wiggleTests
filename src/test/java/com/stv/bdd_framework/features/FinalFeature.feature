Feature: To test Terms & Conditions works properly
  Scenario: 01. Open Terms & Conditions page
    Given main page is opened
    When a user clicks on account link
    And account page is opened
    And user clicks on Terms & Conditions link
    Then Terms & Conditions page is opened

    Scenario: 02. Open shipment info page
      Given Terms & Conditions page is opened
      When a user clicks shipping information link
      And shipping information page is opened

      Scenario: 03. Check if shipment info page works correctly
        Given shipping information page is opened
        When a user opens delivery information
        And How We Process Your Order block is not displayed
        And a user clicks How We Process Your Order tab
        And How We Process Your Order block is displayed
        Then a user returns to the main page
