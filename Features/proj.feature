Feature: To verify Checkbox,Radio Button,Dropdown

Background: 
Given user is on DemoQa page

Scenario: verifying checkbox

When user clicks checkbox
Then user verifies whether the checkbox is selected or not

Scenario: Radio button Verification

When user clicks on the radio button
Then user verifies whether the radio is selected or not

Scenario: Dropdown default text Verification

When user clicks the dropdown menu
Then user verifies whether the dropdown default value is same or not
