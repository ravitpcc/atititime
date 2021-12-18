package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.actitime.generics.WebDriverCommonLib;

public class Listbox_Facebook 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		WebDriverCommonLib w =new WebDriverCommonLib();
	     w.waitForPageLoad(driver);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();

		WebElement dateListbox = driver.findElement(By.id("day"));
		Select s = new Select(dateListbox);
		s.selectByIndex(13);

		WebElement monthListbox = driver.findElement(By.id("month"));
		Select s1 =new Select(monthListbox);
		s1.selectByVisibleText("Jan");

		WebElement	 yearListbox=driver.findElement(By.id("year"));
		Select s2 =new Select(yearListbox);
		s2.selectByValue("1997");
	}
}


