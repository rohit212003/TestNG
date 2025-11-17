package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListenerEx implements ITestListener {
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Skipped");
	}
	
	public void onStart(ITestContext result)
	{
		System.out.println("Test Started");
	}
	
	public void onFinish(ITestContext result)
	{
		System.out.println("Test Finished");
	}
}
