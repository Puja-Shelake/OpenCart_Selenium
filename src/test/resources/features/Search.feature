Feature: Search Product

Background:
Given Open URL


@Sanity
Scenario: Product
Then Enter any existing product "<name>" into the Search text box
When Click on the button having search icon 
Examples:
|name|
|Mac|
#|Fitbit|


@xyz
Scenario:Product_0
When  Enter any existing product name into the "<Search>" text box field 
Then  Click on the button having search icon 
When Select List option
Then Click on the Image of the Product and name of the product 
Then Repeat Steps first to second and Select Grid option 
Then Click on the Image of the Product and name of the product After Selection of Gird 
Examples:
|Search|
|iMac|

@demo_1
Scenario:Product_1
Then Do not enter anything into the Search text box field 
When Click on the button having search icon 
Then  Enter any text from the Product Description into the "<Search Criteria>"
Then  Select Search in product descriptions checkbox option
Then  Click on Search button 
#Then Hover the mouse cursor on Compare this Product option available on the Product that is displayed in the Search Results
Then Select Compare this Product option  
Then Click on product comparision link from the displayed success message
Examples:
|Search Criteria|
|iLife|






 



