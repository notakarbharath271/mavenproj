package testngproj;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGAnnotationTwo {
	
@BeforeClass
	
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
	
	@AfterClass
	
	public void closeBrowser() {
		System.out.println("inside @AfterMethod Annoted method-closeBrowser");
	}

}
