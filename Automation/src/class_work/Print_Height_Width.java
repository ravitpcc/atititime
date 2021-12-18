package class_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Height_Width {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement emailTbx = driver.findElement(By.id("email"));
		int height = emailTbx .getSize().getHeight();
		int witdh = emailTbx .getSize().getWidth();
		System.out.println("Height Username:"+height);
		System.out.println("Withd Username: "+witdh );

		WebElement passwordTbx1 = driver.findElement(By.id("pass"));
		int height1 =passwordTbx1  .getSize().getHeight();
		int witdh1 = passwordTbx1 .getSize().getWidth();
		System.out.println("Height Password:"+height1);
		System.out.println("Withd Password: "+witdh1 );
	}

}
