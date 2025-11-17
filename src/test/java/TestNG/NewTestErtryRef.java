package TestNG;
 


import org.testng.Assert;
import org.testng.annotations.Test;
 
public class NewTestErtryRef {

  @Test(retryAnalyzer = IRetryClass.class)

  public void login() {

	  System.out.println("Login Test");

	  Assert.assertTrue(false);

  }

}

 