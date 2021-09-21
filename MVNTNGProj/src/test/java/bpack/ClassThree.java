package bpack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassThree {
	
	@BeforeTest
	public void sampleTest() {
		System.out.println("Before test is executed before test module.");
	}
	@Test
	public void testThree() {
		System.out.println("testThree Test of ClassThree got executed");
	}

}
