

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandlingMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Web Automation for Handling Multiple windows
		//Webpage used is Google's Signup for an Account page
		//using the "Learn more" hyperlink for the automation
		
		WebDriver driver = new FirefoxDriver();//Call the Firefox Browser
		driver.get("https://accounts.google.com/signup");//Enter the WebSit's URL
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();//click on the "Learn more" hyperlink
		System.out.println( driver.getTitle() ); //print the Title of Parent window
		Set<String>ids = driver.getWindowHandles();//creating a Set data type instance to store window ids using getWindowHandles() method
		Iterator<String> itr = ids.iterator();//creating a Iterator data type instance to iterate through the Set which we stored the window ids

		String parentid = itr.next();//store the parent id in a String
		String childid = itr.next();//store the child id in a String

		driver.switchTo().window(childid);//switch to child window using the child id
		System.out.println( driver.getTitle() );//print the Title of the Child window
		
		driver.switchTo().window(parentid);//switch back to parent window using the parent id
		System.out.println( driver.getTitle() );//print the Title of the parent window		
	}

}
