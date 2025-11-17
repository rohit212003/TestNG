package Dimension;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DimensionEx1 {
	
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		Dimension dim=driver.manage().window().getSize();
//		System.out.println("Height :"+dim.getHeight());
//		System.out.println("Height :"+dim.getWidth());
//		driver.manage().window().setSize(new Dimension(1024,768));
//		driver.quit();
		
		//to shift the window
//		Point point=driver.manage().window().getPosition();
//		System.out.println("X:"+point.getX());
//		System.out.println("Y:"+point.getY());
//		driver.manage().window().setPosition(new Point(100,100));

		 
		Actions action =new Actions(driver);
		WebElement fullName=driver.findElement(By.id("userName"));
		action.sendKeys(fullName,"ROhit").keyDown(fullName,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].scrollIntoView();", fullName);
		action.sendKeys(fullName,"Mahendra").keyDown(fullName,Keys.CONTROL)
		.sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		
		
		
	}

}
