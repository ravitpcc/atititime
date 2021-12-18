package Assignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class print_AlloptionAlphabeticalOrder 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium/hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> alloption = s.getOptions();
		int count=alloption.size();
		ArrayList<String> al = new ArrayList<>();
		for(WebElement opt:alloption )
		{
			String text = opt.getText();
			al.add(text);
		}
		Collections.sort(al);
		for(String txt: al)
		{
			System.out.println(txt);
		}
		driver.close();
	}

}
