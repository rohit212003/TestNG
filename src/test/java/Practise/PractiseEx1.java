package Practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseEx1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("http://automationbykrishna.com/index.html#");
		WebElement regis=driver.findElement(By.id("registration2"));
		regis.click();
		 Thread.sleep(2000);
		driver.findElement(By.id("unameSignin")).sendKeys("Rohit");
		driver.findElement(By.id("pwdSignin")).sendKeys("Rohit@12132425");
		driver.findElement(By.id("btnsubmitdetails")).click();
		Alert alert=driver.switchTo().alert();
		if(alert.getText().equals("Success!"))
		{
			System.out.println("Registration success");
		}
		alert.accept();

	}

}
