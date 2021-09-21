package apack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassTwo {
	
	@BeforeSuite
	public void test() {
		System.out.println("Before all the classes BeforeSuite Annotation is executed.");
	}
	@Test(groups = {"Smoke"})
	public void testTwo() {
		System.out.println("testtwo Test of ClassTwo got executed");
	}
}
