package Assignment;



import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWiproJob 
{
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

		}


	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("wipro jobs");
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[starts-with(text(),'wipro jobs')]"));
		int count = allsugg.size();
		//System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = allsugg.get(i).getText();
				
		}
		allsugg.get(0).click();
	
		List<WebElement>alllink = driver.findElements(By.xpath("//a"));
		 //List<WebElement> alllink = driver.findElements(By.className("srp"));
		for(WebElement link:alllink)
		{
			String text = link.getAttribute("href");
			System.out.println(text);	
		}
			
	
		
		driver.close();
		
	    
		
		
	}

}
