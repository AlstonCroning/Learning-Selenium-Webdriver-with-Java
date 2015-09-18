import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.ca");
	
		Actions abc = new Actions(driver);
		
		WebElement element = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]"));
		abc.moveToElement(element).build().perform();//move to "Hello sign in" Tab so that the menu relevent will appear

		//move to 'Search Bar' and send keys and type in letters in capital letters and build and perform the action
		//seems to perform this action in the web address bar for some reason(shouldn't have used moveToElement method)
		WebElement element2 = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		abc.keyDown(Keys.SHIFT).moveToElement(element2).sendKeys("smallletters").build().perform();
		
		//'right click' on the 'search bar' to appear the 'context window'
		//seems to perform this action in the web address bar for some reason(shouldn't have used moveToElement method)
		abc.contextClick(element2).build().perform();
		
	}

}
