package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com");
////	    driver.findElement(By.id("APjFqb"));
//	    WebElement textBox=driver.findElement(By.id("APjFqb"));
//	    textBox.sendKeys("Selenium");
	    
	    WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
	   
        
	    WebElement elements=driver.findElement(By.xpath("//div[@class='card-body']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",elements);
	    
	   
	    
	    WebElement textBox=driver.findElement(By.id("item-0"));
	    textBox.click();
	    
	    
	    WebElement fullName=driver.findElement(By.xpath("//input[@id='userName']"));
	    fullName.sendKeys("Ajinkya Rahane");
	    
	   
	    WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
	    email.sendKeys("ajinkyarahane@gmail.com");
	    
	    WebElement currentaddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
	    currentaddress.sendKeys("Street no 25, bandra, mumbai ");
	    
	    WebElement permtaddress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
	    permtaddress.sendKeys("Ashwi khurd , maharashtra");
	    
	    
	    
	    WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
	    JavascriptExecutor js1=(JavascriptExecutor)driver;
	    js1.executeScript("arguments.click();",submit);
	    
	    String userName="Ajinkya Rahane";
	    
	    WebElement name=driver.findElement(By.id("name"));
	    if(userName.equals(name.getText()))
	    {
	    	System.out.println("Name matched test case passed");
	    }
	    else
	    {
	    	System.out.println("Name not matched test case failed");
	    }
	 

	}

}
