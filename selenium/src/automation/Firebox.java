package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firebox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.gecko.driver","E:\\workspace\\selenium\\Executable\\geckodriver.exe");
 WebDriver web = new FirefoxDriver();
	}

}
