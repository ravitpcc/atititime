package Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Radiobutton_Check
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		int y1 = driver.findElement(By.xpath("//label[text()='Female']")).getLocation().getY();
		int y2 = driver.findElement(By.xpath("//label[text()='Male']")).getLocation().getY();
		int y3 = driver.findElement(By.xpath("//label[text()='Custom']")).getLocation().getY();
		System.out.println("Y axis of following");
		System.out.println("Female Radio Button :"+y1);
		System.out.println("Male Radio Button :"+y2);
		System.out.println("Custom Radio Button :"+y3);
		
		if(y1==y2 && y1==y3)
		{
			System.out.println("Radio button is aligned properly");
		}
		else
		{
			System.out.println("Radio button is not aligned properly");
		}
		driver.close();

	}


}
