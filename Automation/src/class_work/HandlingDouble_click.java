package class_work;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDouble_click
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement resourceTab = driver.findElement(By.partialLinkText("Resources"));
		Actions a = new Actions(driver);
		a.moveToElement(resourceTab).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement readFUllstories = driver.findElement(By.partialLinkText("READ FULL STORY"));
		a.doubleClick(readFUllstories).perform();
		//WebElement actualtext = driver.findElement(By.xpath("HackerEarth + Vtiger CRM"));
		 String tittle = driver.getTitle();
		 
		 
	
	if(tittle.equals(actualtext))		
	{
		System.out.println(" HackerEarth Case Study is display");
		
	}
		else
		{
		System.out.println(" HackerEarth Case Study is not display");
		}
	
	driver.close();
		
		
		
		
		

	}

}
