package automation;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
public class Example1 {

	public static void main(String args[]) {
	// TODO Auto-generated method stub
		// Step1: Set path for driver executable
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable");
		// Step2: Create an instance of Requair Browser class
		WebDriver driver = new ChromeDriver();
	//enter the application URL
		driver.get ("https:// demo.actitime.com/login.do");
		//veryfy URL and title
		String actualUrl=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		System.out.println("Actual URL is:"+actualUrl);
		System.out.println("Actual Title is:"+actualTitle); 		
		String expectedUrl="https://demo .actitime.com /login.do";
        String expectedTitle="actuatiTIME Login";
        System.out.println("URLvaidation:"+actualUrl.equals(expectedUrl));
        System.out.println("Title validation :"+actualTitle.equals(expectedTitle));
        String pageSrouce = driver. getPageSource();
        System.out.println("PageSource length:"+pageSrouce.length());
        System.out.println("PageSource content :"+pageSrouce);
        //close current browser
        driver.close();
        
        
        
        
		
		
		
		
		

	}

}
