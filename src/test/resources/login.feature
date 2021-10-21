Feature:As a Swag Labs customer who is not locked out, I need to be able to log in so that I can purchase Sauce Labs merch.
  Background:
    Given I am on the Sauce Demo Login Page

Scenario: 1 Successful Login
When I fill the account information for account StandardUser into the "standard_user" field and the "secret_sauce"
And I click the Login Button
Then I am redirected to the Sauce Demo Main Page
And I verify the App Logo exists

Scenario: 2 Failed Login
When I fill the account information for account LockedOutUser into the "locked_out_user" field and the "secret_sauce"
And I click the Login Button
Then I verify the Error Message contains the text "Sorry, this user has been banned."
