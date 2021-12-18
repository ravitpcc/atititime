package class_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_firstSelectOption 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium/hotel.html");
		WebElement checkpostListbox = driver.findElement(By.id("cp"));
		Select s =new Select(checkpostListbox);
		WebElement fsoption = s.getFirstSelectedOption();
		String text = fsoption.getText();
		System.out.println(text);
		driver.close();


	}

}
