package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.Signuppage;
import utils.BaseTest;

    public class SignupStepDefinition extends BaseTest{
	  Signuppage  signuppage = null;
	
     @Before 
	 public void SetupBrowser(){
	 
     BaseTest.intializeDriver();
	 BaseTest.openBrowser();
     }
	
	@After 
	public void CloseBrowser(){
	 
		BaseTest.closeBrowser();
    }
	
	@Given("^the user is on home page$")
	public void the_user_is_on_home_page() throws Throwable{
       signuppage = new Signuppage(driver);
    }
	
	@Then("^the user click on signin button$")
	public void the_user_click_on_signin_button() throws Throwable{
	   signuppage.clickSignin();
	}
	
	@Then("^the user enters valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_valid_and_(String eMail,String pass) throws Throwable{
	   signuppage.enterEmail(eMail);
	   signuppage.enterPassword(pass);
     }
	
	@Then("^the user enters invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_invalid_and_(String eMail,String pass) throws Throwable{
	   signuppage.enterEmail(eMail);
	   signuppage.enterPassword(pass);
	}
	
	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable{
		signuppage.clickSubmit();
	}
}	
	
	
	
	


