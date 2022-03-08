Feature: OpenCart-Register

Background:
Given Click on My Account Drop menu


Scenario: Register
Then  Click on Register option 
And Enter new Account Details into the Mandatory Fields
Then Click on Continue button
Then  Click on Continue button that is displayed in the Account Success
Then Close Browser

@SmokeTest
Scenario: Login
Then Click on Login option 
Then Enter valid email address into the "<E-Mail>" 
Then Enter valid password into the "<Password>"
Then Click on Login button 
Then Select Logout option
Then Click on Continue button for confirmation
#Then Click on Forgotten Password link
Examples:
|E-Mail|Password|
|pujashelke10@gmail.com|Puja@99|



@SmokeTest
Scenario: LogOut
Then Click on Login option 
Then Enter valid email address into the "<E-Mail>" 
Then Enter valid password into the "<Password>"
Then Click on Login button 
Then Select Logout option
Then Click on Continue button for confirmation
Examples:
|E-Mail|Password|
|pujashelke10@gmail.com|Puja@99|



@SmokeTest
Scenario: Forgetton Password
Then Click on Login option 
Then Enter valid email address into the "<E-Mail>" 
Then Enter valid password into the "<Password>"
#Then Click on Login button 
Then Click on Forgotten Password link
Examples:
|E-Mail|Password|
|pujashelke10@gmail.com|Puja@99|

@SmokeTest
Scenario: Forget Password
Then Click on Login option 
#Then Enter valid email address into the "<E-Mail>" 
#Then Enter valid password into the "<Password>"
#Then Click on Login button 
Then Click on Forgotten Password link
Then  Enter the "<E-Mail>" address of an existing account for which you have forgot the password 
Then  Click on Continue button after email updation
When Enter the "<E-Mail>" address into the E-Mail address field and the new resetted "<Password>" into the Password field 
Then Click on Login button After all updation
Examples:
|E-Mail|Password|
|pujashelke10@gmail.com|Puja@99|








