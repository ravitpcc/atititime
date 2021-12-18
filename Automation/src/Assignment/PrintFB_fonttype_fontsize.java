package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintFB_fonttype_fontsize 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.linkText("Forgotten password?"));
		String fonttype =e.getCssValue("font-family");
		System.out.println("FontType :"+fonttype);

		String fontsize =e.getCssValue("font-size");
		System.out.println("FontSize :"+fontsize);
		driver.close();




	}

}
