Feature: ANZ customer application test

Background: 

Given user opens browser
When user is on home page
Then user provides Your Detail
Then user provides Your earnings
Then user provides Your Expences

Scenario: Validate amount scenario

Given Calculate button appears
When user clicks on calculate button
Then user validates borrow amount
Then user closes browser


Scenario: Validate start over scenario

Given user clicks on calculate button
When user clicks on start over button
Then user validates empty form
Then browser closing


Scenario: Validate error message scenario

Given user clicking on calculate button
When user clicking on start over button
Then user provides only living expense as 1 
Then user click on calculate button
Then user validates error message
Then browser closed

