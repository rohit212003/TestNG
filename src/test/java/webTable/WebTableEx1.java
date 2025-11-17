package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement fullName=driver.findElement(By.id("countries"));
		List<WebElement> totalRows=driver.findElements(By.cssSelector("#countries tbody tr"));
//		List<WebElement> totalCols=driver.findElements(By.cssSelector("#countries tbody tr td"));
		System.out.println("Total rows:"+totalRows.size());
		for(int i=0;i<totalRows.size();i++)
		{
			List<WebElement> totalCols=driver.findElements(By.xpath("//table[@id='countries']/tbody/tr["+i+"]/td"));
			for(int j=1;j<totalCols.size();j++)
			{
				WebElement data=driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+(i+1)+"]/td["+j+"]"));
				System.out.println("Table data in row "+i+" "+data.getText());
			}
			System.out.println();
		}
		
		driver.quit();
		

	}

}
