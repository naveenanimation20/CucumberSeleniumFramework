Feature: Free CRM Login Feature

Scenario: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
Then user clicks on login button
Then user is on home page


Scenario: user is able to create a new contact

Given user is already on home page
When user mouse over on contacts link
Then user clicks on New Contact link
Then user enters firstname and lastname
Then user clicks on save button
Then verify new contact created
