package apack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_Class implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Execution Started." + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution Sucessfully." + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped" + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test got Failed." + result.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Finish the Execution." + context.getName());
	}

}
