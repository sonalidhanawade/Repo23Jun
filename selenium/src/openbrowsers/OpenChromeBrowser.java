package openbrowsers;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step1: using System.setProperty(key,value) set to path for ChromeDriver.exe
		System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		// Step2:Create an instance of Chromedriver class
		ChromeDriver cdrive=new ChromeDriver();

	}

}
