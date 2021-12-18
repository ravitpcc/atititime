package class_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListbox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ravi/Desktop/Selenium/hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListbox);
		Thread.sleep(1000);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("v");
		Thread.sleep(1000);
		s.selectByVisibleText("dosa");

		if(s.isMultiple()==true)
		{
			s.deselectByIndex(2);
			Thread.sleep(1000);
			s.deselectByValue("i");
			Thread.sleep(1000);
			s.deselectByVisibleText("dosa");
		}


	}

}
