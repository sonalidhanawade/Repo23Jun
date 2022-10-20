package KeyboardAndMouseOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps2 {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath = System.getProperty("user.dir")+"\\Executable\\chromedriver.Exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		// create an instance of chrome browser and up-casting it to webdriver interface
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		// to enter required applicatin URL usig get()of webdriver interface
		driver.get("https://demo.actitime.com/login.do");
		// login in actitime application using enter key
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}

}
