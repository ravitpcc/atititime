package class_work;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_ScrollBar1
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.bbc.com/");
		int y = driver.findElement(By.xpath("//span[.='Future Planet']")).getLocation().getY();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,"+y+")");
	}

}
