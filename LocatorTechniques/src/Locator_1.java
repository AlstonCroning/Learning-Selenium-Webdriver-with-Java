import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();//invoke the Firefox browser
		
		//Facebook Login Automation Test
		driver.get("https://www.facebook.com");//hit the URL in the browser
		
		//identify the email input object using 'id' attribute and submit value as 'academy' for testing
		driver.findElement(By.id("email")).sendKeys("academy");
		
		//identify the password input object using 'name' attribute and submit value as '12345' for testing
		driver.findElement(By.name("pass")).sendKeys("12345");
				
		//identify the loggin button using 'xpath' of the button object and click using the 'click()' method
		driver.findElement(By.xpath(".//*[@id='u_0_x']")).click();
		
		/*
			//other Locator Techniques: 'linkText' and 'partialLinkText'
			//identify link 'Forgot your password?' object using linktext technique and click on the link
			//driver.findElement(By.linkText("Forgot your password?")).click();
	
			//identify link 'Forgot your' partially using partiallinktext technique and click on the link
			//driver.findElement(By.partialLinkText("Forgot your")).click();
			
			//find how many 'anchor tag' elements are there in the page
	 		//driver.findElement(By.tagName("a"));
		*/
		
		/*
			//Locator Technique 1: using xpath
			//driver.get("https://www.google.ca");//hit the URL in the browser
	
			//find element in the page which is having this provided xpath (identifing an element using xpath)
			driver.findElement(By.xpath(".//*[@id='hplogo']/a/img")).click();
		*/	
	}
}
