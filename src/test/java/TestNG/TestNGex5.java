package TestNG;

import org.testng.annotations.Test;

public class TestNGex5 {
	
	@Test(invocationCount=5)
	public void paymentTest()
	{
		System.out.println("Payment test");
	}
	
	@Test(timeOut=2000)
	public void BillingTest() throws InterruptedException
	{
		System.out.println("Billing Test");
		Thread.sleep(3000);
	}

}
