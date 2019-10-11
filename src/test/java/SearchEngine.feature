Feature: Search Engine
Scenario: Valid Search
Given User is in the search page
When user enter "head" in the search box
Then user completes payment

Scenario: Invalid Search
Given User is in the search page
When User enter Telephone in the search box
Then Unsuccessful

Scenario: Blank
Given User is in the search page
When User left the  search box blank
Then popup 
