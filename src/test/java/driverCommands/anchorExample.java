package driverCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class anchorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com");
		List<WebElement> allElement=driver.findElements(By.xpath("//div[@class='card-body']/h5"));
		for(WebElement ele:allElement)
		{
			System.out.println(ele.getText());
		}
		driver.close();

	}

}
