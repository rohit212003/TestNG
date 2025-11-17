package driverCommands;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String mainWindow=driver.getWindowHandle();
		WebElement newTab=driver.findElement(By.cssSelector("#tabButton"));
		js.executeScript("argumants[0].scrollIntoView();",newTab);
		newTab.click();
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println("Windows-Url: "+driver.getCurrentUrl());
		for(String window:allWindows)
		{
			if(!(mainWindow.equals(window)))
			{
				driver.switchTo().window(window);
				System.out.println("Windows Url:"+driver.getCurrentUrl());
			}
		}

	}

}
