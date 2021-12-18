package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_allOptionMTR
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium/hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListbox );
		List<WebElement> alloption = s.getOptions();
		int count = alloption.size();
		System.out.println(count);
		for(WebElement e:alloption)
		{
			String text = e.getText();
			System.out.println(text);

		}

		driver.close();
	}

}
