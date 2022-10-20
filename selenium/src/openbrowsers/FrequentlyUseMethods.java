package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrequentlyUseMethods {

	public static void main(String[] args) {
	    // Step1: Set path for driver executable 
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		
		// Step2: Create an instance of Required Browser class
		WebDriver driver = new ChromeDriver();
		
		//enter the application URL
		driver.get("https://demo.actitime.com/login.do");
		
		//verify URL and title
		String actualUrl=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		System.out.println("Actual URL is:"+actualUrl);
		System.out.println("Actual title is:"+actualTitle);
		
		String expectedUrl="httpps://demo.actitime.com/login.do";
		String expectedTitle="actiTIME-login";
		System.out.println("URL validation:"+actualUrl.equals(expectedUrl));
		System.out.println("Title validation:"+actualTitle.equals(expectedTitle));
		
		String pageSource=driver.getPageSource();
		System.out.println("pageSource Length "+pageSource.length());
		System.out.println("pageSource content:"+pageSource);
        
		//close current browser
		//driver.close();
		}
}
/**
 * open chrome browser
 * enter *application URL as 
 * https://demo .actitime.com
 * verify following component in the login page
 * -title
 * -url
 * close the browser
 */

