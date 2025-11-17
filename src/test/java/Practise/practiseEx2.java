package Practise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiseEx2 {
	
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationbykrishna.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.findElement(By.id("basicelements")).click();
	driver.findElement(By.name("ufname")).sendKeys("Rohit");
	driver.findElement(By.name("ulname")).sendKeys("Baviskar");
	driver.findElement(By.name("cmpname")).sendKeys("Google");
	
	driver.findElement(By.xpath("//input[@placeholder=\"Enter User Companyname\"]/../..//button")).click();
	Alert alert=driver.switchTo().alert();
	Thread.sleep(3000);
	System.out.println(alert.getText());
	alert.accept();
	
	}
}
