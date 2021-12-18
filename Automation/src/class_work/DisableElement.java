package class_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DisableElement 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium/Login.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		RemoteWebDriver r =(RemoteWebDriver) driver;
		r.executeScript("document.getElementById('d2').value='manager'");
		Thread.sleep(2000);
		//r.executeScript("document.getElementById('d2').value=' '"); //remove the value 
		
	}

}
