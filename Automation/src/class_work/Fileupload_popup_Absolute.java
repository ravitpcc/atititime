package class_work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload_popup_Absolute 
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/nakuri.html");
		Thread.sleep(3000);
		driver.findElement(By.id("cv")).sendKeys("C:\\Users\\Admin\\eclipse-workspace\\Automation\\data\\resume.docx");
		
		
	}

}
