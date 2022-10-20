package MultipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions {


	public static void main(String args[]) {
		String chromeExePath = System.getProperty("usr.dir")+"\\executables\\chromedriver.exe";
		
		// Setting the path for driver executable
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		
		// creating an instance of an browser and up-casting  it to webDriver
		// interface
		WebDriver driver=new ChromeDriver();
		
		// maximize browser window
		driver.manage().window().maximize();
		
		// to enter required application URL use get() of  webDriver interface
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		// to get suggestion from the google search page
		List<WebElement> suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>span"));
		//get suggestion count
		System.out.println("Suggestion count is: "+suggList.size());
		//to get element from the list
		WebElement firstSugg=suggList.get(0);
		System.out.println("First Suggestion name: "+firstSugg.getText());
		for(int i =0;i<suggList.size();i++) {
			System.out.println(suggList.get(i).getText());
			
		}
	}
}
		
		
		

	
	


