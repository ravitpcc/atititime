package class_work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_allOptionCheckpost 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	

	public static void main(String[] args)
	{
	 WebDriver driver = new ChromeDriver();
	 driver.get("file:///C:/Users/Admin/Desktop/selenium/hotel.html");
	 WebElement checpostListbox = driver.findElement(By.id("cp"));
	 Select s=new Select(checpostListbox );
	 List<WebElement> alloption = s.getOptions();
	 int count = alloption.size();
	 System.out.println(count);
	 for(int i=0;i<count;i++)
	 {
		 String text = alloption.get(i).getText();
		 System.out.println(text);
	 }
	 driver.close();
		
	}

}
