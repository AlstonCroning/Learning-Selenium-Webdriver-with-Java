import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customized_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();//invoke the Firefox browser
		
		//Facebook Login Automation Test
		driver.get("https://www.facebook.com");//hit the URL in the browser
		
		//using my own customized xpath
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("qaclickacademy");
		
	}

}
