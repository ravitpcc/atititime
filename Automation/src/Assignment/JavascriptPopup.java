package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptPopup
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@class='analystic']"));
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a =driver.switchTo().alert();
	     String text = a.getText();
	     a.dismiss();
	     System.out.println(text);
	     driver.close();
		
		
		

	}

}
