package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) {		
		// Step1: Open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Step2: enter app URL
		driver.get("https://demo.actitime.com/login.do");
		
		// Step3: locate username field from UI
		WebElement UserNameInputField=driver.findElement(By.id("username"));
		
		/** after identifying the webElement we can perform following operation it on
		 *  type input ----> sendKeys("")
		 *  click     -----> click()
		 *  delete existing ----> clear()
		 *  **/
		UserNameInputField.sendKeys("admin");
		// Step4: Enter password as manager
		//** Identify password field*/
		WebElement password=driver.findElement(By.name("pwd")); 
		
		/** type password as manager */
		password.sendKeys("manager");
		
		// Step5: click on login button
		/** Identyfy login button and click on it */
		driver.findElement(By.id("loginButton")).click();
		
		// Step6: validate home page
		String expectedTitle= "actiTIME - Enter Time-Track";
		String actualTitle=driver.getTitle();
		System.out.println("Expected Title is :"+expectedTitle);
		System.out.println("Actual Title is "+actualTitle);
		
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login validation is passed");
		}else {
			System.out.println("Login validation is failed");
		}
		
		// Step7: Identify logout link and click on it
		driver.findElement(By.id("loginButton")).click();
		//driver.close();
		}
}

/**
 * Open chrome browser
 * Enter application URL
 * Enter username as admin
 * enter password as manager
 * click on login button
 * validation home page
 * click on logout button
 * validate login page
 * */


