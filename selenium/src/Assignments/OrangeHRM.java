package Assignments;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRM {

	public static void main(String[] args) {
		// set the path of Chromedriver executable
					System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
					
					// create an instance of chrome driver
					WebDriver driver = new ChromeDriver();
					
					// enter app url
					driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					
					// enter userName as admin
					WebElement UserNameInputField=driver.findElement(By.name("username"));
					UserNameInputField.sendKeys("admin");
					
					//  enter password as admin123
					WebElement PasswordNameInputField=driver.findElement(By.name("password"));
					PasswordNameInputField.sendKeys("admin123");
					
	}

}
