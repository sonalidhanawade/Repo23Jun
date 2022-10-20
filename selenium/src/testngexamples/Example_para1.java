package testngexamples;

import org.testng.annotations.Test;

public class Example_para1 {
	@Test(invocationCount=5)
	public void para1() {
		System.out.println("Hello,I am TC8 from Example_para1 class");
		
	}

}
/**
 *  if testng class contains more than one test method dn all the test method will be executed 
 *  in alphabetical order
 * */
 