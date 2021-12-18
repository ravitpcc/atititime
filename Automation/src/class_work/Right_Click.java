package class_work;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}
	

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		Thread.sleep(4000);
		Actions a = new Actions(driver);
		Thread.sleep(4000);
		a.contextClick(link).perform();
		Robot r = new Robot();
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_W);
		driver.quit();
		
		
		
	}

}
