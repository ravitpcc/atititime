package class_work;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload_popup_Relative 
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/nakuri.html");
		File f = new File("./data/resume.docx");
		String Absoulutepath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(Absoulutepath );
	}
}
