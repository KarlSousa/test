package utils;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
   
   public class BaseTest {
	   public static WebDriver driver;
	
         //initialization of Web driver
	   
	   public static void intializeDriver(){
			
		   System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vibhakumari\\Desktop\\CucumberWorkingEnvironment\\CucumberAssignmentMain\\Resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

	          //open the browser
	   
		public static void openBrowser(){
			
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         }
		
		     //close the browser
		
		public static void closeBrowser(){
           driver.quit();
		}
}



