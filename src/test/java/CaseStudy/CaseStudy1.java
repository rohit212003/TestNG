package CaseStudy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CaseStudy1 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		
//		WebElement button=driver.findElement(By.cssSelector("span[id=\"edit-record-2\"]"));
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//	button.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement edit = wait.until(ExpectedConditions.refreshed(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Compliance']//following-sibling::div//span[@class='mr-2']//*[local-name()='path']"))));
		ex.executeScript("arguments[0].scrollIntoView();", edit);
		edit.click();
		
		WebElement salary=driver.findElement(By.id("salary"));
		salary.clear();
		salary.sendKeys("250000");
		WebElement submit=driver.findElement(By.id("submit"));
		submit.click();
		
		
		WebElement add=driver.findElement(By.id("addNewRecordButton"));
		add.click();
		driver.findElement(By.id("firstName")).sendKeys("Rohit");
		
		driver.findElement(By.id("lastName")).sendKeys("Patil");
		
		driver.findElement(By.id("userEmail")).sendKeys("rohit@gmail.com");
	    driver.findElement(By.id("age")).sendKeys("34");
		
		driver.findElement(By.id("salary")).sendKeys("29000");
		driver.findElement(By.id("department")).sendKeys("Entc");
		driver.findElement(By.id("submit")).click();
		
		List<WebElement> table=driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div/div[1]"));
		int count=0;
		for(WebElement wb:table)
		{
			if(wb.getText().equals(" "))
			{
				break;
			}
			count++;
		}
		
		if(count==4)
		{System.out.println("Yes there are 4 elements");
			
		}
		
		
		
	
		
		
	
	}

}
