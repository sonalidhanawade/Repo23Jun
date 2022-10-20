package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLogin2 {

	public static void main(String[] args) {
		// Step1:open chrome browser
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		// Step2: enter app URL
		driver.get("https://demo.actitime.com/");
		
		// Step3: enter username as admin
		/** locate username field from UI */
		WebElement userNameInputField=driver.findElement(By.id("username"));
		
		/** after identifying the WebElement we can perform following operation in it
		 *  type input ----> sendKeys
		 *  click      ----> click()
		 *  delete existing ----> clear() */
		userNameInputField.sendKeys("admin");
		
		//Step4: enter password as manager
		/** identify  password field*/
		WebElement password=driver.findElement(By.name("pwd"));
		/** type password as manager*/
		password.sendKeys("manager");
		
		// Step5: click on login button
		/** identyfy login button and click on it*/
		driver.findElement(By.id("loginButton")).click();
		
		// validation will be failed,to void this we will use explicit
		// wait (conditional wait)
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait. until (ExpectedConditions.elementToBeClickable (By.id("logoutLink")));
		
		// wait.until(ExpectedConditions.titles("acTitime-Enter Time-Track"))
		
		// Step6: validate home page "acTitime-Enter Time-Trace";
		String expectedTitle = "acTIME-Enter Time-Track";
		String actualTitle=driver.getTitle();
		System.out.println("ActualTitle is :"+actualTitle);
		
		if (actualTitle .equals(expectedTitle)) {
		System.out.println("Login validation is passed");
		}
		else {
			System.out.println("Login validation is failed");
		}
		
		// identify logout link and click on it
		driver.findElement (By.id("logout Link")).click();
		driver.close();
		}
}
/** Open chrome browser Enter application URL
 * Enter usernames as admin enter
 * password as manager click on login button
 * validation home page click on 
 * logout button validate login page */
