package class_work;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElenentUserTypeURL
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		System.out.println("Enter the URL");
		Scanner sc = new Scanner(System.in);
		String url = sc.nextLine();
		driver.get(url);
		List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		 int count = allLink.size();
		 System.out.println(count);
		 for(int i=0;i<count;i++)
		 {
			 String text = allLink.get(i).getText();
			 System.out.println(text);
		 }
		 driver.close();
		
	}

}
