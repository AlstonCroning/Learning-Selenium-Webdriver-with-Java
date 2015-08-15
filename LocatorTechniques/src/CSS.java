import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("[class='identity first']")).sendKeys("qweqweqe");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("kjsdfsf");
		driver.findElement(By.xpath("//button[@id='Login']")).click();
		
		
		
		
	}

}
