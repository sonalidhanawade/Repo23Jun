package MultipleElementHandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	private static final int i = 0;

	public static void main(String[] args) {
		String ChromeExePath = System.getProperty("user.dir")+"\\ executable.chromedriver.exde";
		
		//setting the path for driver executable
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		
		// creating an instance of chrome browser and up-casting to WeDriver
        // interface
		WebDriver driver = new ChromeDriver();
		
		// maximize browser window
		driver.manage().window().maximize();
		
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.Demoblaze.com/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		List<WebElement> mobileNameList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		List<WebElement> mobilePriceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		
		for(int i=0;i<mobileNameList.size();i++) {
			System.out.println(mobileNameList.get(i).getText()+ " ---> "+mobilePriceList.get(i).getText());
		}
	}
}
		
		
		
	


