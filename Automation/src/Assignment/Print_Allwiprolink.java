package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Print_Allwiprolink 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro job");
	    List<WebElement> alllink = driver.findElements(By.xpath("//span[contains(text(),'wipro job')])"));
	    int count=alllink.size();
	    for(int i=0;i<count;i++)
	    {
	    String text = alllink.get(i).getText();
	    }
	   alllink.get(1).click();
	  
	  
	    
	    
	    
		
		
	}
		
		
	

}
