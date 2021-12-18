package class_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL_Navigation 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("selenium.dev"))
		{
			System.out.println("URL is succesfully navigation and pass");
		}
		else
		{
			System.out.println("URL is not navigation so failed");
		}

		driver.close();
	}

}
