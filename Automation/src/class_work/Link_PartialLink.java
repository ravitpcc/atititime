package class_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_PartialLink
{
	static
	{
		System.setProperty("weddriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium/Demo1.html");
		driver.findElement(By.linkText("google")).click();
	}

}
