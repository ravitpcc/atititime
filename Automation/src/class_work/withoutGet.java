package class_work;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class withoutGet {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver =new FirefoxDriver();
		driver.navigate().to("https://www.google.com");
		driver.navigate().to("https://www.gmail.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(1000);
		WebDriver driver1 =new ChromeDriver();
		driver1.navigate().to("https://www.google.com");
		driver1.navigate().to("https://www.gmail.com");
		Thread.sleep(2000);
		driver1.navigate().back();
		Thread.sleep(2000);
		driver1.navigate().forward();
		Thread.sleep(2000);
		driver1.navigate().refresh();
		Thread.sleep(2000);
		driver1.close();



	}

}
