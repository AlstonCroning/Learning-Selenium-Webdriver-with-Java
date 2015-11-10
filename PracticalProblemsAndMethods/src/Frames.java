import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Test Case: Handling Multiple Frames using Selenium ( 'I'm not a robot' Feature has been taken off the site)
		 * 1: click on the I'm not a Robot checkbox/element
		 * 2: then click on the verify button
		*/
		
		WebDriver driver = new FirefoxDriver();//invoke the Firefox browser
		driver.get("https://fantasycricket.dream11.com");//hit the URL

		//get the count of iframes present in page
		int FramesCount = driver.findElements(By.tagName("iframe")).size();//number if iframes present are 5
		int count = 0;
		
		for(int i = 0; i < FramesCount; i++)
		{
			
			//switch to each frame one at a time
			driver.switchTo().frame(i);

			//find the i'm not a robot element
			count = driver.findElements(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).size();

			if(count > 0)
			{			
				//1: click on the 'I'm not a Robot' element
				driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
				break;
			}
			
			//switch back to default web content from the switched frame
			driver.switchTo().defaultContent();
		}
		
		//switch to default web content from the switched frame in case it didn't occur within the loop
		driver.switchTo().defaultContent();
		
	}//end of main

}//end of Frames class

