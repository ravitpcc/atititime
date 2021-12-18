package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BBC_LatestNews 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> alllist = driver.findElements(By.xpath("//h2[text()='Latest Business News']/../ul/li/a"));
		int count = alllist.size();
		System.out.println(count);
		for(WebElement list:alllist)
		{
			String text =list.getText();
			System.out.println(text);
		}
		driver.close();		
	}	
}


