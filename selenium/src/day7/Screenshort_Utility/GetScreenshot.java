package day7.Screenshort_Utility;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class GetScreenshot {
	
	public static void main(String[] args) throws IOException {
		SeleniumUtility m1=new SeleniumUtility();	
		WebDriver driver=m1.setUp("chrome", "https://www.google.com");
		//type cast WebDriver instance into TakesScreenshot interface
		TakesScreenshot ts=(TakesScreenshot)driver;
		//get screenshot using getScreenshotAs() of TakesScreenshot interface
		File file=ts.getScreenshotAs(OutputType.FILE);
		//store above screenshot into required location
		FileUtils.copyFile(file,new File("E:\\Screenshot\\google.png"));
	}

}
