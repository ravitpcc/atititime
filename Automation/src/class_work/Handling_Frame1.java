package class_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frame1
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium/page1.html");
		//switch the control inside the frame using ie id
		Thread.sleep(2000);
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("a");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("b");
		WebElement frm = driver.findElement(By.xpath("//iframe"));
		//switch to frame using web element
		driver.switchTo().frame(frm);
		Thread.sleep(2000);
		driver.findElement(By.id("t2")).sendKeys("c");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("d");
	}
}
