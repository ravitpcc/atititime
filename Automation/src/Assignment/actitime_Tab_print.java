package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actitime_Tab_print
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	    driver.findElement(By.xpath("(//div[contains(@class,'menu_icon')])[7]")).click();
		driver.findElement(By.partialLinkText("About your actiTIME")).click();
		 driver.findElement(By.partialLinkText("www.actitime.com")).click();
		 driver.findElement(By.partialLinkText("www.actitime.com")).click();
//		Actions a = new Actions(driver);
//		a.doubleClick(redAg).perform();

	}

}
