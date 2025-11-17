package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertion {
	
//	@Test
//	public void login()
//	{
//		System.out.println("Login Test");
//		Assert.assertTrue(false);  //when we wanted to use hard assertion we will use with objectAssert 
//		//There are two type of assertion hard and soft assertion
////		assertEquals(" "," ");
//		
//		
//	}
	
	@Test
	
	public void login()
	{
		 WebDriver driver = new ChromeDriver();
		  driver.get("http://automationbykrishna.com/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.manage().window().maximize();
		  WebElement ele = driver.findElement(By.id("basicelements"));
		  Assert.assertTrue(ele.isDisplayed());
		  Assert.assertEquals(driver.getTitle(), "Login Signup Demo");
		  driver.quit();
		
	}

}
