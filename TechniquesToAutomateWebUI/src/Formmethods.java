import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Formmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*test case
		 * how do u handle a hidden web element (hidden mode) which is only visible if u click a one radio button 
		*/

		WebDriver driver = new FirefoxDriver();//invoke the Firefox Browser
		driver.get("http://www.makemytrip.com/");//hit the URL in the browser
		
		//Print status Before clicking on Multicity radio button
		System.out.println("Before clicking on Multicity radio button");
		//Return Date element
		System.out.println( driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed() );//checks whether the element is visible or not (if visible it will returns true)

		//click on Multicity Radio Button element
		driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();//click on the Multicity Radio Button
		
		//Print status After clicking on Multicity radio button
		System.out.println("After clicking on Multicity radio button");
		//Return Date element
		System.out.println( driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed() );//checks whether the element is visible or not (if visible it will returns true)

		//verify whether an element present in the web page or not by using 'size()' method
		int count = driver.findElements(By.xpath(".//*[@id='mui_city_button']/span")).size();
		if(count == 0)
		{
			System.out.println("Verified");
		}
		
		
	}

}
