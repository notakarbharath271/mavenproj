package testngproj;

import org.testng.annotations.Test;

public class TestNGSample {
	
	@Test(priority=1)
	public void testRegistrationMethod() {
		
	System.out.println("Registration method got executed");
	
	}
	@Test(priority=2)
	public void testLoginMethod() {
		
		System.out.println("LoginMethod method got executed");
		
		}
	@Test(priority=3)
	public void testHomePageMethod() {
		
		System.out.println("HomePageMethod method got executed");
		
		}

}
