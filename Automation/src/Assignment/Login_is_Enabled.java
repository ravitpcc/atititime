package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_is_Enabled {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean login = driver.findElement(By.name("login")).isEnabled();

		if(login==true)
		{
			System.out.println("Login button is enabled and pass");
		}
		else
		{
			System.out.println("Login button is desable so failed");
		}
		driver.close();




	}

}
