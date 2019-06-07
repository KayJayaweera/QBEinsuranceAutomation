Feature: Get an anonymous quote for a CTP

#Only needs to have outline if your including variales in feature file
Scenario: Get an anonymous quote for CTP in NSW
Given Initialise browser and navigate to website
When Enter details
Then Get a quote
And close the page
