package Assignments1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// set the path of Chromedriver executable
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		
		// create an instance of chrome driver
		WebDriver driver = new ChromeDriver();
		
		// open the URL
		driver.get("https://www.facebook.com/");
		
		// fetch home page title
		System.out.println("Title of  webpage is:"+driver.getTitle());
		
		// fetch url of webpage 
		System.out.println("URL of webpage is:"+driver.getCurrentUrl());
		
		// verify actual title of the home page with expected title
		String actualTitle=driver.getTitle();
         System.out.println("Actual Title is:"+actualTitle);
         System.out.println("Title validation:"+actualTitle.equals("expectedTitle"));
         
         // print home page tile on the consol
         String title = driver.getTitle();
         System.out.println("title is:"+ title);
         
         // close the browser
         driver.close();
         
         
        

		
	

	}

}
