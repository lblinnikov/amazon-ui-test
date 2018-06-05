Feature: Eshop

Scenario: Add product to basket twice and assert total

  Given user goes to the e-shop page
  And user searches Watch
  When user adds first product
  And user goes to edit basket
  And user adds one more instance of the product
  Then cost is correctly calculated


Scenario: Add products to basket twice and assert total if searched using keyboard only

    Given user goes to the e-shop page
    And user presses RETURN after searching Watch
    When user adds first product
    And user goes to edit basket
    And user adds one more instance of the product
    Then cost is correctly calculated


Scenario: Add specified product to basket twice and assert total

    Given user goes to the e-shop page
    And user searches DASSARI Patina Distressed Hand Finished Italian Leather Watch Band Black 20mm
    When user adds product named DASSARI Patina Distressed Hand Finished Italian Leather Watch Band Black 20mm
    And user goes to edit basket
    And user adds one more instance of the product
    Then cost is correctly calculated