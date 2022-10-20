package testngexamples;

import org.testng.annotations.Test;

public class Example_para6 {
	@Test(dependsOnMethods="signIn",enabled=true)
	public void login() {
		 System.out.println("Hello, I am login from Example_para6 calss");
	}
	@Test(dependsOnMethods="login",enabled=true,timeOut=2000)
	public void checkNotification() {
		System.out.println("Hello, I am checkNotificatin from example_para6 class");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
		e.printStackTrace();
	}
	}
	@Test(enabled=true,expectedExceptions=ArithmeticException.class)
   public void signIn() {
		System.out.println("Hello, I am signIn from Example_para6 class");
		int i=10/0;
	}
}
