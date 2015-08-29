import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Formmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*test cases(its not in order, everything is mixed up)
		 * how do u handle a hidden web element (hidden mode) which is only visible if u click a one radio button
		 * how do u handle an element which may not exist in the page
		 * check whether webpage's UI control(ex: radio button, check boxes, etc..) is enabled or disabled
		 * you want to know what textcase is present in the web page and if u want to validate it how would u do it
		 * calender automation
		 * increase the number of adults for the flight search in the page
		 * using Assertion statements (used in real time automation or actual automation)
		*/

		WebDriver driver = new FirefoxDriver();//invoke the Firefox Browser
		driver.get("http://www.makemytrip.com/");//hit the URL in the browser

		//********Automation Test case1**********//
		//Print status Before clicking on Multicity radio button
		System.out.println("Before clicking on Multicity radio button");
		//Return Date element
		Assert.assertTrue( driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed() );	//using Assertion statement for validating an element (which returns true)
		System.out.println( driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed() );//checks whether the element is visible or not (if visible it will returns true)
		
		//click on Multicity Radio Button element
		driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();//click on the Multicity Radio Button
		//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).isEnabled();//check whether the Multicity Radio Button is enabled or not
		
		//Print status After clicking on Multicity radio button
		System.out.println("After clicking on Multicity radio button");
		//Return Date element
		Assert.assertFalse( driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed() );//using Assertion statement for validating an element (which returns false)	
		System.out.println( driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed() );//checks whether the element is visible or not (if visible it will returns true)


		/*
			********Automation Test case2**********
			//verify whether an element present in the web page or not by using 'size()' method
			int count = driver.findElements(By.xpath(".//*[@id='mui_city_button']/span")).size();
			if(count == 0)
			{
				System.out.println("Verified that no such element present");
			}
		 */
		
		
		//********Automation Test case3**********//
		//you want to know what textcase is present in the web page and if u want to validate it this is how you can
		//get the text of HOT DEALS text in the HOME page
		//System.out.println( driver.findElement(By.xpath(".//*[@id='responsive_bottom']/div[2]/div/h3")).getText() );
		
		
		//********Automation Test case4**********//
		//calender automation
		//driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[3]")).click();	//click on the calender element in the home page
		//driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[6]/td[1]/a")).click();//click on the 30th in the calender

		
		//********Automation Test case5**********//
		//Increasing Number of Adults using the UI's '+' increment sign
		/*
		int i = 0;
		while(i < 5)
		{
			//click on the increment '+' element on each time gets loops through
			driver.findElement(By.xpath(".//*[@id='adult_count']/a[2]")).click();
			i++;
		}
		*/

		
	}

}
