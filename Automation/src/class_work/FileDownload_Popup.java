package class_work;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload_Popup
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("(//div[@class='card-body'])[2]/p[1]/a")).click();
		Thread.sleep(5000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
