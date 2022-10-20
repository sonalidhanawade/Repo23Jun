package Assignments1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtigerCRM {

	public static void main(String[] args) {
		// set the path of chrome driver executable
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		
		// create an instance of chromedriver class
		WebDriver driver = new ChromeDriver();
		
		//enter vtiger application url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		// validation login page open or not
		//move existing text from username field
		//type username as 'admin'
		//remove existing text from password field
		// type password as 'Test@123'
		 // click on login button
		
		

	}

}
