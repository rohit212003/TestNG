package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverEx3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://automationbykrishna.com/");
		 WebElement registrationLink=driver.findElement(By.id("registration2"));
		 registrationLink.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //wil be applicable for all the findElements statements hereafter
		 WebElement userName=driver.findElement(By.id("unameSignin"));
		 if(userName.isDisplayed() && userName.isEnabled()) {

				userName.sendKeys("asfafaf");

			}

		

			userName.clear();

			driver.close();
	 
		 

	}

}
