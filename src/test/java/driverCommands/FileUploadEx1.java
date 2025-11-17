package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
         driver.get("http://automationbykrishna.com/");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.manage().window().maximize();
         WebElement fullName=driver.findElement(By.cssSelector("[id='basicelements']"));
 	    fullName.click();
 	    
         WebElement uploadfile= driver.findElement(By.cssSelector("[id='exampleInputFile']"));
         uploadfile.sendKeys("C:\\Users\\ropramod\\Downloads\\sample.txt");

	}

}
