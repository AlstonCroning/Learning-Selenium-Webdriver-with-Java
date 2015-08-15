import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();//invoking Firefox Browser
		driver.get("https://login.salesforce.com");//Hit the URL

		//enter the username
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("qweqweqe");

		//enter the password
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("kjsdfsf");
		
		//click the login button
		driver.findElement(By.xpath("//button[@id='Login']")).click();
	}

}
