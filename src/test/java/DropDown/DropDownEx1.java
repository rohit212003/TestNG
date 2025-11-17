package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("basicelements")).click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;

	//	js.executeScript("window.scrollTo(0, 500)");
		WebElement dropDown=driver.findElement(By.xpath("//select[@class='form-control m-bot15']"));
		Select sel=new Select(dropDown);
		sel.selectByIndex(2);
		sel.selectByVisibleText("5");
		

	}

}
