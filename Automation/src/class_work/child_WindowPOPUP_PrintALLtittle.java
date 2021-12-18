package class_work;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_WindowPOPUP_PrintALLtittle
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			String tittle = driver.getTitle();
			
			System.out.println(tittle);
		}
		driver.quit();
	}

}
