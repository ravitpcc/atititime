package class_work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_allSelectoption 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium/hotel.html");
		WebElement checkpostListbox = driver.findElement(By.id("cp"));
		Select s = new Select(checkpostListbox);
		List<WebElement> Salloption = s.getAllSelectedOptions();
		int count = Salloption.size();
		for(int i=0;i<count;i++)
		{
			String text = Salloption.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
