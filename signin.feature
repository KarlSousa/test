
    Feature: registration
  
    @tag1
    Scenario Outline: create a new user
    Given user is on Register page
    Then user click on signin button
    Then User create a new account by entering the email "<eMail>"
    Then  click on create account
    Then user enter the "<first_name>"and"<last_name>"and"<password>" and "<address>" and"<city>" and "<state_name>" and "<zipcode>" and "<Country>"and "<phone_no>"and"<alias>"
    Then user click on register button

    Examples:
      |eMail                  |first_name       |last_name   |password|address    |city        |state_name  |zipcode|Country|phone_no  |alias|
      |syhdgrgh@gmail.com       |vibha            |kumari      |vibhaa  |h-31       |greaternoida|uttarpradesh|00000  |india  |8826672760|6789 |
    
    @tag2
    Scenario Outline: enter the invalid password
    Given user is on Register page
    Then user click on signin button
    Then user enter the invalid "<eMail>"
    Then click on create account
    Then user is on home page


    Examples:
    |eMail      |
    |uix@gmalcom|








