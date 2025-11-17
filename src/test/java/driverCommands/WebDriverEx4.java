package driverCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		List<WebElement> allElement=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are "+allElement.size());
		for(WebElement ele:allElement)
		{
			System.out.println(ele.getText() + "    url:" + ele.getAttribute("href"));
		}
		//driver.close();
		
	List<WebElement> allElement1=driver.findElements(By.xpath("//a"));
	for(WebElement ele:allElement1)
	{
		System.out.println(ele.getAttribute("innerText") + "    url:" + ele.getAttribute("href"));
	}
	

	}

}
