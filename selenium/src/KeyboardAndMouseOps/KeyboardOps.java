package KeyboardAndMouseOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps {

	public static void main(String[] args) {
		String chromeExePath =System. getProperty("user dir")+"\\Executables\\chromedrive.Exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		//creating an instance of chrome browser and up-casting  it to webdriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//to enter require applicatin URL to get() of webdriver interface
		driver.get("https://www.flipkart.com/");
		// using Escape of keybord to avoid login popup
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		
	}

	
}
