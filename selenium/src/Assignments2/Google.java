package Assignments2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String []argd) {
	 // path of Chromedriver executable
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		// create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//validate home page
		String actualurl=driver. getCurrentUrl();
		String expectedurl ="https://www.google.com/";
		System.out.println("URL validation:"+actualurl.equals(expectedurl));
		
		// main menu list and count
		List<WebElement> menulist = driver.findElements(By.cssSelector("ul.G43f7e>li>div>div>div>span"));
		List<WebElement> menulistcount=driver.findElements(By.cssSelector(""));
		System.out.println("main menu count is:"+menulist.size());
		
	}	
}
