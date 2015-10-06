import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		System.out.println(driver.getPageSource());
		
		driver.switchTo().frame(1);
		driver.findElement(By.cssSelector("input[class='input_password']")).sendKeys("15113161");
	}

}
