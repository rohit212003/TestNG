package TestNG;

import org.testng.annotations.Test;

public class TestNGex3 {
	
	@Test(priority=-1)
	public void PaymentTest() {
		System.out.println("payment done");
	}
	
	@Test(priority=0)
	public void LoginTest()
	{
		System.out.println("Login Methode");
	}
	
	@Test(priority=2)
	public void BillingTest()
	{
		System.out.println("Billing Methode");
	}
	
	@Test(priority=1)
	public void RegistrationTest()
	{
		System.out.println("Registration Methode");
	}
	
	//if no priority is defined then it will execute alphabatically
	//if some priority is assinged and some have no priority them it will automatically assign it to 0

}
