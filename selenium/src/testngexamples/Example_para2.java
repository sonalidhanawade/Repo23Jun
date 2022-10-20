package testngexamples;

import org.testng.annotations.Test;

public class Example_para2 {
	@Test(priority=1)
	public void ligin() {
		System.out.println("Hello, I am login from Example_para1 class");
		
	}
	@Test(priority=2)
	public void sendEmail() {
		System.out.println("Hello, I am sendEmail from Example_para1");
	}
	@Test(priority=3)
     public void logout() {
		System.out.println("Hello, I am logout from Example_para1");
    	 
     }
}
/**
 *By default each @Test has priority as 0 lowest priority will get executed first
 * 
 */