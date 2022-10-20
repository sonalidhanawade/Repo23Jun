package BrowserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectValidation {


public static void main(String args[]) throws InterruptedException { 
	String chromeExePath = System.getProperty("user.dir")+"Executable\\chromedriver.exe";
	
	// setting the path for driver executable
	System.setProperty("webdriver.chrome.drive","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
	
	// creating an instance of Chrome browser and up-casting it to WebDriver
	WebDriver drive = new ChromeDriver();
	
	// explicit wait (static wait)
	Thread.sleep(2000);
	// maximize the browser window
	
	
	
	
}


}
