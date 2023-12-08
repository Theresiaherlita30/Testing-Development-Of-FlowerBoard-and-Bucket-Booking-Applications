Feature: Test for Apk(http://127.0.0.1:8000/)

	Scenario: Test Login with Valid Credentials
Given open chrome and start application
When I enter valid username and valid password
Then I click the sign in button
Then I click the store in button
Then I click the add store in button
When I enter valid name and address
Then I click the save submit button

			

