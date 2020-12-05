Feature: Checking if title is changed after clicking on Google Images 
    Scenario: Opening on a Chrome Driver
        Given User is present on Google home page
        When User clicks on Google Images button 
        Then Title should be changed