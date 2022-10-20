package openbrowsers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GenericWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step1: Set path for driver executable
		System.setProperty ("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
		// Step2: Create an instance of Required Browser class
		WebDriver driver=new ChromeDriver();

	}

}
