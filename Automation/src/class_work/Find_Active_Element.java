package class_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Active_Element 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement er = driver.switchTo().activeElement();
		er.sendKeys("java");
		er.click();

	}

}
