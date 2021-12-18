package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiSelectedListbox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium/hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListBox);
		
		
		List<WebElement> sAlloption = s.getAllSelectedOptions();
		Thread.sleep(4000);
		
		
		

	}

}
