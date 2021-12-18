package class_work;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demolocator2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)  {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ravi");
		driver.navigate().back();
		driver.findElement(By.name("paswd")).sendKeys("ravi12");


	}
}
