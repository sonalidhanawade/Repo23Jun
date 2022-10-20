package Assignments1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Actitime{
	public static void main(String[] args) {
		// set the path of chrome driver
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		
		// create an instance
		WebDriver driver= new ChromeDriver();
		
		// lunch a Chrome browser
		driver.get("https:\\demo.actitime.com/");
		
		// print page title and title length on eclips consol
		String title = driver.getTitle();
		System.out.println("title is:"+title);
		System.out.println("length of title is:"+title.length());
		
		// get pageSource and pageSource length
		String pageSource = driver.getPageSource();
		System.out.println("pageSource length is:"+pageSource.length());
		System.out.println("pageSource content is :"+pageSource);

		//close the browser
		driver.close();
	}

	}
	
	




