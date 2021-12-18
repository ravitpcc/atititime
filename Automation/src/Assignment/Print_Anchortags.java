package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Anchortags {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String tagname = driver.findElement(By.linkText("actiTIME Inc.")).getTagName();
		System.out.println(tagname);

	}

}
