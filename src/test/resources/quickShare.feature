Feature: Share my ride
strory as you like
Scenario: Valid post with success message
Given employee "Naveen" enter details like "Office" as source, "Hoem" as destination and time is "5.30pm"
And his email is "naveenhome@gmail.com" and phone is "9810547500"
When click on "Share"
Then data get saved and message "Posting was successful." get displayed with "OK" button
And clicking on "OK" will take him to "Home" page

Scenario: Invalid post with failed message
Given employee "Raman" enter details like "Office" as source, "Hoem" as destination and time is "5.30pm"
And his email is "naveenhome@gmail.com" and phone is "9810547500"
When click on "Share"
Then data get saved and message "Posting was unsuccessful." get displayed with "OK" button
And clicking on "OK" will take him to "Home" page