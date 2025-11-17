package Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions action =new Actions(driver);
		WebElement fullName=driver.findElement(By.id("userName"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", fullName);
		Thread.sleep(1000);
		action.contextClick(fullName).perform();
		Thread.sleep(1000);
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
//		action.keyDown(Keys.ARROW_DOWN).
//		       keyUp(Keys.ARROW_DOWN).
//		       keyDown(Keys.ARROW_DOWN).
//		       keyUp(Keys.ARROW_DOWN).
//		       keyDown(Keys.ARROW_DOWN).
//		       keyUp(Keys.ARROW_DOWN).
//		       keyDown(Keys.ARROW_DOWN).
//		       keyUp(Keys.ARROW_DOWN).
//		       keyDown(Keys.ENTER).
//		       keyUp(Keys.ENTER).build().perform();
	}

}
