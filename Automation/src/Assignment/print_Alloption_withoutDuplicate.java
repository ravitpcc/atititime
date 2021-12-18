package Assignment;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_Alloption_withoutDuplicate
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
		Select s = new Select(mtrListbox);
		List<WebElement> alloption = s.getOptions();
		int count = alloption.size();
		HashSet<String> hs=new HashSet<>();
		for(int i=0;i<count;i++)
		{
		String text = alloption.get(i).getText();
		if(hs.add(text)==true)
		{
			System.out.println(text);
		}
		
		}
		driver.close();
	}

}
