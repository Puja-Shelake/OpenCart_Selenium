Feature: Product Details

  Background: 
    Given Click on Url

  @SmokeTest
  Scenario: Product Details
    Then Enter any existing Product name into the Search text box field
    When Click on the button having search icon
    Then Click on the Product displayed in the Search results
    Then Check the Product Name, Brand and Product Code in the displayed Product Display Page"
