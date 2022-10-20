package testngexamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_Annotation3 {
	@BeforeMethod
	public void enterAppurl() {
	System.out.println("@BeforeMethod-app url is entered");
	}
    @Test(priority=1)
    public void verifyLogin() {
    	System.out.println("Testcase1-Successfully login...");
    	 }
    @AfterMethod
    public void logout() {
    	System.out.println("@AfterMethod-logout from the application");
    	
    }
    @Test(priority=2)
    public void createTask() {
    	System.out.println("TestCase-2 Task created Successfully");
    		
    	}
    @BeforeTest
    public void openBrowser() {
    	System.out.println("@BrowserTest-Browser is opened...");
    	
    }
    @AfterTest
    public void closeBrowser() {
    	System.out.println("@AfterTest-Browser is closed...");
    	
    }
    }
/**
 * @BeforeMethod
 */
    
