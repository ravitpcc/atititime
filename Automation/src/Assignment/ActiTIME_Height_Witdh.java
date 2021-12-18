package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTIME_Height_Witdh {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement username = driver.findElement(By.id("username"));
		int height1 = username.getSize().getHeight();
		int witdth1 = username.getSize().getWidth();
		WebElement password = driver.findElement(By.name("pwd"));
		int height2 = password.getSize().getHeight();
		int witdth2 = password.getSize().getHeight();
		if(height1==height2 && witdth1==witdth2 )
		{
			System.out.println("Username and Password is Equal");
		}
		else
		{
			System.out.println("Username and Password is not Equal");	
		}

	}

}
