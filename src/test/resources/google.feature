Feature: Search my name on google
Scenario: Display total counts mathcing with my name
Given user enter "Naveen Kumar Singh" in google search box
When click on google "Search"
Then google should display count below
