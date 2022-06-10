Feature: Assignment Feature
  
  Background: Navigate to Home Page
  	Given user navigate to amazon home page
  	Then user verifies amazon home page

  Scenario: To select second largest priced Samsung TV
     When user clicks on hamburger menu
     Then clicks on TV_Appliances_Electronics menu 
     Then clicks on Televisions menu
     And selects brand checkbox as samsung
     Then sorts result as HighandLow price
     And clicks on second highest item
     And switch to next window
     And assert the aboutthisitem field