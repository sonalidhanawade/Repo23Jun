package testngexamples;

import org.testng.annotations.Test;

public class Example_para3 {
	@Test(enabled=true)
    public void para1() {
		System.out.println("Hello, I am para1 from Example_para1 class ");
    	
    }
	@Test(enabled=false)
	public void para3() {
		System.out.println("Hello, I am para3 from Example_para1 class");
		
	}
	@Test(enabled=true)
	public void para2() {
		System.out.println("Hello, I am para2 from Example_para1 class");
		
	}
}
/**
 By default for each @Test ,enabled is a set to
 enabled=true
 enabled=true--->consider for execution
 enabled=false--->don't consider for execution 
 * */
 