import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();//invoke the Firefox browser
		driver.get("https://www.google.ca");//hit the URL in the browser

		//find element in the page which is having this provided xpath
		driver.findElement(By.xpath(".//*[@id='hplogo']/a/img")).click();
		
	}

}
