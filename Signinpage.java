//registration of a new user
package pages;
    
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	public class Signinpage {
	     
		WebDriver driver;
	     
	     public Signinpage(WebDriver driver) {
	       
	    	 PageFactory.initElements(driver, this);
	        this.driver = driver;
	    }
	   
	     //for signin
	     
	    @FindBy(how = How.LINK_TEXT, using = "Sign in")
	    public WebElement signIn;
	   
	    @FindBy(how = How.NAME, using ="email_create") 
	    public WebElement email; 
	    
	    @FindBy(how = How.NAME, using ="SubmitCreate") 
	    public WebElement SubmitCreate;
	    
	    @FindBy(how = How.NAME, using ="customer_firstname") 
	    public WebElement First_name;
	    
	    @FindBy(how = How.NAME, using ="customer_lastname") 
	    public WebElement Last_name;
	   
	    @FindBy(how = How.NAME, using = "passwd")
	    public WebElement passwrd;
	    
	    @FindBy(how = How.NAME, using = "address1")
	    public WebElement Address;
	    
	    @FindBy(how = How.NAME, using ="city") 
	    public WebElement City;
	    
	    @FindBy(how = How.NAME, using = "id_state")
	    public WebElement statename;
	    
	    @FindBy(how = How.NAME, using ="postcode") 
	    public WebElement zip;
	    
	    @FindBy(how =How.NAME,using = "id_country")
	    public WebElement country;
	    
	   @FindBy(how = How.NAME, using ="phone_mobile") 
	    public WebElement mobile_no;
	   
	   @FindBy(how = How.NAME, using ="alias") 
	    public WebElement alias_name;
	    
	   @FindBy(how = How.NAME, using ="submitAccount") 
	    public WebElement submitaccount;
	   
	   
	    public void clickSignIn(){
	        
	    	signIn.click();
	    }
	    
	    public void enterEmail(String eMail){
	        
	    	email.sendKeys(eMail);
	    }
	    
	    public void SubmitCreate(){
	    	
	    	SubmitCreate.click();
	    }
	    
	    public void firstname(String first_name){
            
	    	First_name.sendKeys(first_name);
         }
	    
	    public void lastname(String last_name){
	    	
	    	Last_name.sendKeys(last_name);
	    }

	    public void enterPassword(String password){
	        
	    	passwrd.sendKeys(password);
	    }
	    
	    public void address1(String address){
             
	    	Address.sendKeys(address);
        }
	    
	    public void city1(String city){	         
	    	
	    	City.sendKeys(city);
	    }
	    
	    public void state(String state_name){
	         
	    	statename.sendKeys(state_name);
	    }
	    
	    public void postcode(String zipcode){
           
	    	zip.sendKeys(zipcode);
        }
	    
	    public void country1(String Country){
            
	    	country.sendKeys(Country);
        }
	    
	    public void phone(String phone_no){
	        
	    	mobile_no.sendKeys(phone_no);
	    }
		   
	    public void add_alias(String alias){
            
	    	alias_name.sendKeys(alias);
	    }
	    
	   public void clickSubmit(){
	    	
		   submitaccount.click();
	    }
}
	