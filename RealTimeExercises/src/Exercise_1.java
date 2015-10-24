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

		/*
		Test Case 3:
		-Count of the 'links' present in the second column of the Footer Section of the page on ebay.com
		*/		
		WebElement footer_column_2 = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println("Links present in the second column of the Footer Section of Ebay.com");
		System.out.println(footer_column_2.findElements(By.tagName("a")).size());
	
		/*
		Test Case 4:
		-get the text and print of all the 'links' present in the second column of the Footer Section of the page on ebay.com
		and click on the link 'site map' in the same column
		
		for(int i = 0; i < footer_column_2.findElements(By.tagName("a")).size(); i++)
		{
			System.out.println(footer_column_2.findElements(By.tagName("a")).get(i).getText());
		}
		*/
		
		/*
		Test Case 5:
		-click on the link 'site map' in the same column
		-get the Title of both pages (before navigating and after navigating)
		-put a check point for both titles to make sure they aren't matching/pages have been changed or not
		-verify "view our sitemap to help you find your way" text after navigating to 'site map' page
		-get all the links present in the 'site map' page
		*/
		
		System.out.println("Before Clicking the 'Site map' link");
		System.out.println(driver.getTitle());
		
		for(int i = 0; i < footer_column_2.findElements(By.tagName("a")).size(); i++)
		{

			if( footer_column_2.findElements(By.tagName("a")).get(i).getText().contains("Site map") )
			{
				footer_column_2.findElements(By.tagName("a")).get(i).click();
				break;
			}

		}
		
		System.out.println("After Clicking the 'Site map' link");
		System.out.println(driver.getTitle());
		
		
	}

}
