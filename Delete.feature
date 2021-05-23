Feature: Login to the leaftaps Application
Background:
Given Launch Chrome browser
When Load URL'http://leaftaps.com/opentaps/control/main'
And Type username as'DemoSalesManager'
And Type password as'crmsfa'
And Click Login Button 
And click the 'CRM/SFA'
Then Click the leads
Scenario Outline: Login(Positive)
And click the FindLeads
And click the Leaadid as <id>
And click findlead
And click the record
And click the delete button
And click  againfindlead button
And enter the lead id
Then verify the no record display

Examples:
|id|
|10058|
