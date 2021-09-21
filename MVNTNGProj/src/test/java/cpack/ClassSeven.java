package cpack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassSeven {
	
	@AfterTest
	public void test() {
		System.out.println("After test annoted is execute after execution of the test module");
	}
	@Test
	public void testSeven() {
		System.out.println("testSeven Test of ClassSeven got executed");
	}

}
