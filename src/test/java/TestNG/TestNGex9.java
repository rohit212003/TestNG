package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGex9 {
	
	@Test(dataProvider="RetrieveData")
	public void login(String userName, String password)
	{
		System.out.println("UserName: "+userName+"Password :"+password);
		
	}
	
	@DataProvider(name="RetrieveData")
	public Object[][] getData()
	{
		Object[][] obj=new Object[3][2];
		obj[0][0]="Atul";
		obj[0][1]="234";
		obj[1][0]="Atul";
		obj[1][1]="567";
		obj[2][0]="Atul";
		obj[2][1]="678";
		
		return obj;
		
	}

}
