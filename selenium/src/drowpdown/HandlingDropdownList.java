package drowpdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {

	public static void main(String[] args) {
    String driverPath = System.getProperty("user dir","\\executables\\chrome.exe");
    // setting the driver executable 
    System.setProperty("webdriver.chrome.driver","E:\\workspace\\selenium\\Executable\\chromedriver.exe");
    // create an instance for chrome brower
    WebDriver driver = new ChromeDriver();
    // maximize browser
    driver.manage().window().maximize();
    //implicit wait
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.get("http://demo.automationtesting.in/Register.html");
    // identify dropdownlist
    WebElement skillDropdown = driver. findElement (By.id("Skills"));
    // create an instance of Select class and pass above element into its constructor
    Select selectSkill = new Select(skillDropdown);
    // check whether dropdown is multiselect dropdown or not 
    System.out.println("Is dropdown is allowing you to select multiple option :"+selectSkill.isMultiple());
    // get default or alredy select option
    WebElement selectedOption = selectSkill.getFirstSelectedOption();
    
    
    

	}

}
