package class_work;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chlidWindowPOPUP
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		System.out.println("Enter the title to be close");
		Scanner sc = new Scanner(System.in);
		String exceptedtitle = sc.nextLine();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allwb = driver.getWindowHandles();
		for(String wh:allwb)
		{
			driver.switchTo().window(wh);
			String actualtitle = driver.getTitle();
			if(actualtitle.equals(exceptedtitle))
			{
				
			}
			else
			{
				driver.close();	
			}
		}
		
		
		
	}

}
