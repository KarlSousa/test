//login to a page

package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

   public class Signuppage{
      
	   WebDriver driver;

     public Signuppage(WebDriver driver){
        
    	 PageFactory.initElements(driver, this);
        this.driver = driver;
      
     }

 
               //for the signup
    
     @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public WebElement signIn;
   
    @FindBy(how = How.ID_OR_NAME, using = "email")
    public WebElement Email;
    
    @FindBy(how = How.NAME, using ="passwd") 
     public WebElement password;
   
    @FindBy(how = How.NAME, using ="SubmitLogin") 
     public WebElement login;
    
    

    public void clickSignin(){
        
    	signIn.click();
    }

    public void enterEmail(String eMail){
       
    	Email.sendKeys(eMail);
     }

    public void enterPassword(String pass){
       
    	password.sendKeys(pass);
    }
 
    public void clickSubmit() {
        
    	login.click();
    }
}