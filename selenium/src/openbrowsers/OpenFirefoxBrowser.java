package openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step1: using System.setProperty (key,value) set to path for GeckoDriver.exe
		System.setProperty("webdriver.gecko.driver","E:\\workspace\\selenium\\Executable\\geckodriver.exe");
		// Step2: Create an instance of FirefoxDriver class
		FirefoxDriver fdrive=new FirefoxDriver();

	}

}
