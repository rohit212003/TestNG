package driverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverEx1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
	    WebDriverManager.firefoxdriver().setup();
	    ChromeOptions option=new ChromeOptions();
//	    option.addArguments("--headless");
	    option.addArguments("--incognito");
//	    option.addArguments("--start-maximized");   //Helps us to maximize the browser
	    option.addArguments("--disable-popup-blocking");
	    
	    WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.google.com");
//		driver.get("https://www.capgemini.com");
//		driver.get("https://demoqa.com/browser-windows");
		System.out.println("Current title:"+driver.getTitle());
		driver.get("https://demoqa.com/");
//		driver.manage().window().maximize();  //Helps us to maximize the browser
//		driver.manage().window().minimize();  //Helps us to minimize the browser
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("argument[0].click();",driver.findElement(By.id("tabButton")));
//		Thread.sleep(2000);
//		driver.close(); //closes the current tab only
		driver.navigate().back();
		System.out.println("After clicking on back title "+driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("After clicking on back title "+driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("After clicking on back title "+driver.getTitle());
		Thread.sleep(2000);
		
		System.out.println("Title: "+driver.getTitle());
		
		
		driver.quit(); //closes all the tab 

	}

}
