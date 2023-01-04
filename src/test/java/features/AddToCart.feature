Feature: Add to cart
  Scenario: Successful adding products to cart
    Given open browser
    When user goes to cart
    Then product is added to cart