   Feature: Login to application
   user should be able to login to the application
   on entering valid email and password.
   the user should not able to login to application.
   on entering invalid email and password.

   @tag3
   Scenario Outline: User should be able to login to the page
   on entering valid email and password
   Given the user is on home page
   Then the user click on signin button
   Then the user enters valid "<eMail>" and "<pass>"
   Then click on login button

   Examples:
   |eMail             |pass    |
   |ranjvib@gmail.com |vibha345|

   @tag4
   Scenario Outline: User should not be able to login to the on entering invalid email and password
   Given the user is on home page 
   Then the user click on signin button
   Then the user enters invalid "<eMail>" and "<pass>" 
   Then click on login button

     Examples:
    |eMail               |pass |
    |rranjana97@hmail.com|vibha|


