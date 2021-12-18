package class_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_searchTest 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("(//h3[.='Libas'])[1]/../div[1]/span[1]/span[1]")).click();	}

}
