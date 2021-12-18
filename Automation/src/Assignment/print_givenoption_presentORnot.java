package Assignment;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print_givenoption_presentORnot 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium/hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> alloption = s.getOptions();
		System.out.println("Enter the option which is you want to search");
		Scanner sc = new Scanner(System.in);
		String expectedtext = sc.nextLine();
		int count =alloption.size();
		int counter=0;
		for(int i=0;i<count;i++)
		{
			String actualtext = alloption.get(i).getText();
			if(expectedtext.equals(actualtext))
			{
				counter++;
			}
		}
		if(counter==0)
		{
			System.out.println(expectedtext+"is not present");
		}
		else if(counter==1)

		{
			System.out.println(expectedtext+"is present");
		}
		else if(counter>1)
		{
			System.out.println(expectedtext+"is  present with duplicate");
		}

		driver.close(); 	

	}

}
