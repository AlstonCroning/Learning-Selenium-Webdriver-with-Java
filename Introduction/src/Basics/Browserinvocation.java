package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvocation 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		//using Firefox Driver class to execute and implement the methods present in Webdriver interface
		WebDriver driver = new FirefoxDriver(); //invoking the Firefox Browser
		driver.get("http://www.qaclickacademy.com/");//'get' is used to hit the URL in browser
		System.out.println( driver.getTitle());//Page Title will be printed in the IDE output 
		System.out.println( driver.getPageSource());//get the page source of the Home page
		System.out.println(driver.getCurrentUrl()); //get the actual navigated URL
		//driver.close(); //closes the browser (doesn't work for some reason)
		driver.quit();//forced to quit the browser (works, but gives an error message since failed to close cleanly)
	}
}
