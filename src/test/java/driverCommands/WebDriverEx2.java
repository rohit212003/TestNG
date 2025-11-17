package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverEx2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com");
////	    driver.findElement(By.id("APjFqb"));
//	    WebElement textBox=driver.findElement(By.id("APjFqb"));
//	    textBox.sendKeys("Selenium");
	    
	    WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/index.html#");
//	    driver.findElement(By.id("APjFqb"));
//	    WebElement registration=driver.findElement(By.id("registration2"));
//	    registration.click();
	    Thread.sleep(2000);
//	    WebElement signin=driver.findElement(By.id("unameSignin"));
//	    signin.sendKeys("Rohit2103");
//	    WebElement password=driver.findElement(By.id("pwdSignin"));
//	    password.sendKeys("rohit2120303");
	    
//	    WebElement fullName=driver.findElement(By.name("fName"));
//	    fullName.sendKeys("Rohit");form-control
	    
//	    WebElement fullName=driver.findElement(By.className("form-control"));
//	    fullName.sendKeys("Rohit");
	    
//	    WebElement fullName=driver.findElement(By.linkText("regis"));
//	    fullName.click();
	    
	    WebElement fullName=driver.findElement(By.xpath("//a[@id='registration2']"));
	    fullName.click();
	 
	    
	    
	}

}
