import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class RelativeLocatorex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("registration2")).click();
		WebElement ele=driver.findElement(By.id("fullName"));
		WebElement aboveElement=driver.findElement(with(By.tagName("p")).above(ele));
		WebElement belowElement=driver.findElement(with(By.tagName("input")).below(ele));
		WebElement leftElement=driver.findElement(with(By.tagName("input")).toLeftOf(belowElement));
		WebElement rightElement=driver.findElement(with(By.tagName("input")).toRightOf(ele));
		WebElement nearElement=driver.findElement(with(By.tagName("input")).near(ele));
		System.out.println("Above element: "+aboveElement.getText());
		System.out.println("Below element: "+belowElement.getAttribute("placeHolder"));
		System.out.println("Left element: "+leftElement.getAttribute("placeHolder"));
		System.out.println("Right element: "+rightElement.getAttribute("placeHolder"));
		System.out.println("Near element: "+nearElement.getAttribute("placeHolder"));
		
		

	}

}
