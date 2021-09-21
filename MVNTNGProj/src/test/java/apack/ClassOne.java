package apack;

import org.testng.annotations.Test;

public class ClassOne {
	
	@Test(groups = {"Smoke"})
	public void testOne() {
		System.out.println("testOne Test of ClassOne got executed");
	}

}
