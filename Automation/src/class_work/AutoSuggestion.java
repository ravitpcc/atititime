package class_work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(1000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allsugg.size();
		System.out.println(count);// count the suggestion
		for(int i=0;i<count;i++)
		{
			String text = allsugg.get(i).getText();
			System.out.println(text);//print all the suggestion in console 
		}
		allsugg.get(0).click(); //click the first suggestion
	}

}
