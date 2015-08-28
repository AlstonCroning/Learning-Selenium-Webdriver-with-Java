import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Formmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*test case
		 * how do u handle a hidden web element (hidden mode) which is only visible if u click a one radio button
		 * how do u handle an element which may not exist in the page
		 * check whether webpage's UI control(ex: radio button, check boxes, etc..) is enabled or disabled
		 * you want to know what textcase is present in the web page and if u want to validate it how would u do it
		 * calender automation
		*/

		WebDriver driver = new FirefoxDriver();//invoke the Firefox Browser
		driver.get("http://www.makemytrip.com/");//hit the URL in the browser
		
		//Print status Before clicking on Multicity radio button
		//System.out.println("Before clicking on Multicity radio button");
		//Return Date element
		//System.out.println( driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed() );//checks whether the element is visible or not (if visible it will returns true)

		//click on Multicity Radio Button element
		//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();//click on the Multicity Radio Button
		//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).isEnabled();//check whether the Multicity Radio Button is enabled or not
		
		//Print status After clicking on Multicity radio button
		//System.out.println("After clicking on Multicity radio button");
		//Return Date element
		//System.out.println( driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed() );//checks whether the element is visible or not (if visible it will returns true)
	
		/*
			//verify whether an element present in the web page or not by using 'size()' method
			int count = driver.findElements(By.xpath(".//*[@id='mui_city_button']/span")).size();
			if(count == 0)
			{
				System.out.println("Verified that no such element present");
			}
		 */
		
		//you want to know what textcase is present in the web page and if u want to validate it this is how you can
		//get the text of HOT DEALS text in the HOME page
		//System.out.println( driver.findElement(By.xpath(".//*[@id='responsive_bottom']/div[2]/div/h3")).getText() );

		
		//calender automation
		driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[3]")).click();	//click on the calender element in the home page
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[5]/td[6]/a")).click();//click on the 28th in the calender


		
		
		
		
		
	}

}
