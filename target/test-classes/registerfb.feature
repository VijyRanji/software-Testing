Feature: To validate the account creation of facebook application
Scenario: To create new account
Given To Launch the Borwse and maximize the window
When To launch the Url of facebook application
And To click the create NewAccountbutton
And To pass the FirstName in firstname textbox
And To pass the SecondName in secondname textbox
And To pass mobileno or email in Email textbox
And To create new password using new password textbox
Then To close the chromeBrowser

