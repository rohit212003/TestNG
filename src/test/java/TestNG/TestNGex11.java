package TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGex11 {

	
	@Test
	public void PaymentTest() {
		System.out.println("payment done");
	}
	
	@Test
	public void LoginTest()
	{
		System.out.println("Login Methode");
	}
	
	@Test
	public void BillingTest()
	{
		System.out.println("Billing Methode");
		Assert.assertTrue(false);
	}
	
	@Test
	public void RegistrationTest()
	{
		System.out.println("Registration Methode");
	}
}
