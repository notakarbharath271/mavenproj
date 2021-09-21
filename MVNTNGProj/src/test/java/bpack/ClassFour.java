package bpack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassFour {
	
	@AfterSuite
	public void test() {
		System.out.println("After all the classes AfterSuite Annotation method is execute.");
	}
	
	@AfterTest
	public void test1() {
		System.out.println("After test annoted is execute after execution of the test module");
	}
	@BeforeTest
	public void sampleTest2() {
		System.out.println("Before test is executed before test module of sampleTest2.");
	}
	@Test
	public void testFour() {
		System.out.println("testFour Test of ClassFour got executed");
	}

}
