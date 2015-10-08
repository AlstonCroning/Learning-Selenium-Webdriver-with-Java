import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com/");		
		
		/*
		Test Case 1:
		-Count of the 'links' present in the Entire page on ebay.com
		-is it less than 50 links or more..(less is prefered for performance issues)
		-this is only an example of a requirement 
		-pages like ebay usually have over 400 links...
		*/
		System.out.println("Links present in Ebay.com");
		System.out.println( driver.findElements(By.tagName("a")).size() );//get the number of links present in the page and print it in the console
		
		/*
		Test Case 2:
		-Count of the 'links' present in the Footer Section of the page on ebay.com
		-spy on the footer section and get its xpath or etc..
		-Limit the Webdriver Scope 
			By Creating a WebElement element and assign it to the spyed footer section
			So now u can use it instead of Webdriver element, so that Selenium can focus only on footer section only
		*/
		WebElement element =  driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		System.out.println("Links present in Footer Section of Ebay.com");
		System.out.println( element.findElements(By.tagName("a")).size() );

		
	}

}
