package BrowserOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOp1 {
	public static void main (String args[]) throws InterruptedException  {
	
	String chromeExePath = System.getProperty("user.dir")+"Executable\\chromedriver.ex";
	
	// Setting the path for driver executable
	System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
	
	// creating an instance of chrome browser and up-casting it to WebDriver
	//interface
	WebDriver driver = new ChromeDriver();
	
	// explicit wait(static wait)
	Thread.sleep(3000);
	// maximize browser window
	driver.manage().window().maximize();
	
	// explicit wait(static wait)
	Thread.sleep(3000);
	//set browser size window
	driver.manage().window().setSize(new Dimension(500,800));
	
	// explicit waitL(static wait)
	Thread.sleep(3000);
	
	// to enter required application URL to use get() of webdriver interface
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	// identify and perform required operation
	driver.findElement(By.id("username")).sendKeys("admin");
	
	// type password as manager
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	driver.findElement(By.id("loginButton")).click();
	
	
	

	}
}
