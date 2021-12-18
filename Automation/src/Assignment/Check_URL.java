package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_URL {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)  
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		String currentUrl = driver.getCurrentUrl();

		if(currentUrl.contains("google.com"))
		{
			System.out.println("URL is sucessfully navigating and pass");
		}
		else
		{
			System.out.println("URL is not navigating and failes");	
		}
		driver.close();



	}

}
