package class_work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium/Demo1.html");
		List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		int count = allLink.size();
		System.out.println(count); //2
		WebElement link = allLink.get(0);
		String text = link.getText();
		System.out.println(text);//Qspiders
		driver.close();


	}

}
