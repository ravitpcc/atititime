package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Selected {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) 
	{
		WebDriver  driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		boolean check = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(check==true)
		{
			System.out.println("Checkbox is selected and pass");
		}
		else
		{
			System.out.println("Checkbox is unselected so fail");
		}




	}

}
