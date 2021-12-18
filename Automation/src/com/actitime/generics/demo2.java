package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverCommonLib w =new WebDriverCommonLib();
		w.waitForPageLoad(driver);  //calling Implicit wait
		w.waitForElementVisible(driver, element);//Calling Explicitly Wait
		w.customWait(element);     //calling Custom Wait
		w.selectOption(element, i);//select the option from the listbox using index
		w.selectOption(element,"idly");//select the option from the listbox using visible text 
		



	}

}
