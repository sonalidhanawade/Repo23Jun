package Assignments1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePage {
public static void main(String[] args) {
	// set the path of Chromedriver executable
			System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
			
			// create an instance of chrome driver
			WebDriver driver = new ChromeDriver();
			
			// open the URL
			driver.get("https://www.google.com/");
			
			// wait for the web page to be load
			
			// fetch the current URL of current web page and print on the consol
			System.out.println("URL of webpage is:"+driver.getCurrentUrl());
			
			// fetch pageSource of current web page and print the length in the consol
			String pageSource = driver.getPageSource();
			System.out.println("pageSource length is:"+pageSource.length());
			//System.out.println("pageSource content is:"+pageSource);
			
			// close the browser
			driver.close();

}
}
