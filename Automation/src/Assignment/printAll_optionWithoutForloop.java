package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printAll_optionWithoutForloop 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium/hotel.html");
		WebElement mtrlListbox = driver.findElement(By.id("mtr"));
		Select s = new Select( mtrlListbox);
		WebElement option = s.getWrappedElement();
		String text = option.getText();
		System.out.println(text);
		driver.close();

	}

}
