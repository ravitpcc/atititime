package class_work;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindowPOPUP_printALLaddress
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String wh1 = driver.getWindowHandle();
		System.out.println("Nakuri :"+wh1); // Because set first address is  current addres
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh)
		{
			System.out.println(wh);
		}
		driver.quit();
	}

}
