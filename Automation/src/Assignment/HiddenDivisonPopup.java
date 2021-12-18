package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisonPopup
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement mnthlistbox = driver.findElement(By.className("ui-datepicker-month"));
		Select s1 =new Select(mnthlistbox);
		s1.selectByValue("0");
		WebElement yearlistbox = driver.findElement(By.className("ui-datepicker-year"));
		Select s2 = new Select(yearlistbox);
		s2.selectByValue("1977");
		driver.findElement(By.xpath("//a[text()='14']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("7234567877");
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean msg = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(msg==true)
		{
			System.out.println("Please enter valid Policy No msg is display and pass");
		}
		else
		{
			System.out.println("Please enter valid Policy No msg is not printed and fail");	
		}
		
	}

}
