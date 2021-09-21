package testngproj;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationOne {
	
	@BeforeMethod
	
	public void openApplication() {
		System.out.println("Inside @BeforeMethod annoted method -OpenApplication");
	}
	
	@Test(priority=2)
	public void testLogin() {
		System.out.println("Inside @Test annoted method - Login");
	}
	
	@Test(priority=1)
	
	public void testRegistration() {
		System.out.println("Testing the registration functionality");
	}
	
	@Test(priority=3)
	public void testHomepage() {
		System.out.println("Testing the Homepage functionality");
	}
	
	@AfterMethod
	
	public void closeBrowser() {
		System.out.println("inside @AfterMethod Annoted method-closeBrowser");
	}
}
