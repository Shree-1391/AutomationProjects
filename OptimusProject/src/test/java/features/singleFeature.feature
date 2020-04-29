Feature: To add products to the Cart and Validate the Cart and Price

Scenario: Search a product and add the product to the Cart
Given User search for Product " Round Neck Shirt 16 "
When User add the product to the Cart
And user clicks on cart icon
Then User should navigate to Your cart Page
And Added product should be available in Your cart page