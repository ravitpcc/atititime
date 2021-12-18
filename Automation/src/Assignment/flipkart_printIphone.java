package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generics.WebDriverCommonLib;

public class flipkart_printIphone
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		WebDriverCommonLib w = new WebDriverCommonLib();
		w.waitForPageLoad(driver);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();   
		driver.findElement(By.name("q")).sendKeys("iphone 13 pro max");
		//Thread.sleep(5000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		int count = allsugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = allsugg.get(i).getText();

		}
		allsugg.get(1).click();
		List<WebElement> product = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]"));
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone')]/../../div/div[1]/div[1]/div[1]"));// ////div[contains(@class,'_30jeq3 _1_WHN1')]

		int count1 = price.size();
		for(int i=0;i<count;i++)
		{
			String text1 = product.get(i).getText();
			String text2 = price.get(i).getText();
			System.out.println(text1+"------->"+text2); 
		}

		driver.close();

	}

}
