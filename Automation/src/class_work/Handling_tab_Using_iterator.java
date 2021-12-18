package class_work;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_tab_Using_iterator
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allTab = driver.getWindowHandles();
		Iterator<String> itr = allTab.iterator();
		String pwh = itr.next();
		String cwh = itr.next();
		driver.switchTo().window(cwh);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(pwh);
		driver.close();
	}

}
