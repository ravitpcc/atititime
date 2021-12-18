package class_work;

import org.openqa.selenium.chrome.ChromeDriver; // fully qulifed class name

public class Demo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		ChromeDriver c = new ChromeDriver();
		c.get("https://www.google.com"); // open browser
		String title = c.getTitle();
		System.out.println(title); // print consoles window 
		//System.out.println(c.getTitle());
		//c.close(); // close browser automatically

	}

}
