package stepDefinition;

import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Signinpage;
import utils.BaseTest;

   public class SigninStepDefinition extends BaseTest{
	 Signinpage signinpage = null;
	
	@Given("^user is on Register page$")
	public void the_user_is_on_register_page() throws Throwable{
		signinpage = new Signinpage(driver);
	}
	
    @When("^user click on signin button$")
	public void user_click_on_signin_button() throws Throwable{
		signinpage.clickSignIn();
	}
	
	@Then("^User create a new account by entering the email \"([^\"]*)\"$")
	public void User_create_a_new_account_by_entering_the_email(String eMail) throws Throwable{
		signinpage.enterEmail(eMail);
	}
	
	@Then("^click on create account$")
	public void click_on_create_account() throws Throwable{
		signinpage.SubmitCreate();
		Thread.sleep(3000);
	}
	
   @Then("^user enter the \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\" and \"([^\"]*)\" and\"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"and \"([^\"]*)\"and\"([^\"]*)\"$")
	public void user_enter_the_and_and_and_and_and_and_and_and_and(String first_name, String last_name, String password, String address, String city, String state_name, String zipcode, String Country, String phone_no, String alias) {
	    signinpage.firstname(first_name );
		signinpage.lastname(last_name);
		signinpage.enterPassword(password);
		signinpage.address1(address);
		signinpage.city1(city);
		signinpage.state(state_name);
		signinpage.postcode(zipcode);
		signinpage.country1(Country);
		signinpage.phone(phone_no);
		signinpage.add_alias(alias);
		
	 }

	@Then("^user click on register button$")
	public void user_click_on_register_button() throws  Throwable{
		signinpage.clickSubmit();
	 }
	
	
	@Then("^user enter the invalid \"([^\"]*)\"$")
	 public void user_enter_the_invalid_(String eMail) {
		 signinpage.enterEmail(eMail);
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable{
		Assert.assertTrue(driver.getTitle().contains("Login"));
	}
}
	


	
	
		
	
	
	
	




	
	
	
		

