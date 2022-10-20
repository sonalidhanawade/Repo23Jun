package Assignments2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crininfo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricinfo.com/");
		
		// validate haome page
		String actualurl = driver.getCurrentUrl();
		String expectedUrl=("https://www.cricinfo.com/");
		System.out.println("URL validation"+actualurl.equals(expectedUrl));
		
		
	}

}
