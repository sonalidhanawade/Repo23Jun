package Assignments2;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
        //homepage validation
		String actualurl=driver.getCurrentUrl();
		String expectedurl="https://www.flipkart.com/";
		System.out.println("URL validation: "+actualurl.equals(expectedurl));
		
		//main menu list and count
		List<WebElement> menulist=driver.findElements(By.cssSelector("div._2tvxW>div.InyRMC >div._37M3Pb"));
		List<WebElement> menulistcount=driver.findElements(By.cssSelector("div._2tvxW>div.InyRMC >div._37M3Pb>div.eFQ30H"));
		System.out.println("menucount: "+menulistcount.size());
		for(int i=0;i<menulist.size();i++) {
			System.out.println("menulist: "+menulist.get(i).getText());
		}
		
		
		
        // driver.close();
	}

}
