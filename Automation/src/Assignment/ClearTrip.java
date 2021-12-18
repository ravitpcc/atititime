package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ClearTrip
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).click();
		driver.findElement(By.xpath("//li/p[contains(text(),'Bangalore')]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).click();
		driver.findElement(By.xpath("//li/p[contains(text(),'Goa')]")).click();
		driver.findElement(By.xpath("//div/button[text()='Search flights']")).click();

////div/div[1]/div/div/div/img/../../../../../../..//div[2]/div[2]/div/div[1]/p

	}

}
