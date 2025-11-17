package TestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNGex4 {
	
	@Test(dependsOnMethods= {"loginTest"})  //if one test depends on another case then we can depends methode it will first execute the other methode
		public void paymentTest() {
			System.out.println("PaymentTest");
		}
		@Test
		public void loginTest() {
			System.out.println("LoginTest");
			Assert.assertTrue(false);
		}
}
