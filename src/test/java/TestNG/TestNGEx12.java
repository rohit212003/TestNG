package TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGEx12 {
	
	@Test(retryAnalyzer=IRetryClass.class)
	public void login()
	{
		System.out.println("LoginTest");
		Assert.assertTrue(false);
	}

}
