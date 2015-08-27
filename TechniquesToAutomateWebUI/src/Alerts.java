import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Automation with Alert Boxes
		 * 
		 * 4 common methods used in this example are:
		 * accept()
		 * dismiss()
		 * getText()
		 * sendKeys() 
		 */
		
		WebDriver driver = new FirefoxDriver();//invoke Firefox Browser
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");//hit the URL in the browser
		
		//xpath of the button which u need to click in order to get to the alert popup
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']"));

		System.out.println( driver.switchTo().alert().getText());//returns the text in the alert box and print it
		driver.switchTo().alert().accept(); //switch from web view to popup view
											//accept = ok, done, yes etc.. (positive senerio)
		
		//driver.switchTo().alert().sendKeys("aksdfkahsdka");//if there is a text field in the alert box then this method can be used
		//driver.switchTo().alert().dismiss();//dismiss = cancel, no etc.. (negative senerio)
	
	}

}
