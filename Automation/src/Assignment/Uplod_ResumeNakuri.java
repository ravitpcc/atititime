package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Uplod_ResumeNakuri
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notification");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			if(!(pwh.equals(wh)))
			{
				driver.close();
			}
		}
		//driver.findElement(By.id("allow")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();

		//driver.findElement(By.)
	}

}
