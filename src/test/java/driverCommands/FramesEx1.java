package driverCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
         driver.get("http://automationbykrishna.com/");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.manage().window().maximize();
         driver.findElement(By.id("iframes")).click();
         driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='site1']")));
//         driver.switchTo().frame("frame1");
         driver.findElement(By.cssSelector(".navbar-toggle-icon")).click(); // point driver to frame
         driver.switchTo().defaultContent(); //point driver back to the main page
//         driver.switchTo().parentFrame();  //helps to get one level down in a nested frame
         driver.findElement(By.id("iframes")).click();
         driver.quit();

	}

}
