import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();//invoke the Firefox Browser
		driver.get("http://www.echoecho.com/htmlforms10.htm");//hit the URL in the browser
		driver.findElement(By.xpath("//input[@value='Milk']")).click();//click the radio button of the group 1 which has value 'Butter'

		//print in the console how many radio buttons are in the group1 radio buttons
		System.out.println( driver.findElements(By.xpath("//input[@name='group1']")).size());

		//store how many radio buttons are in the group1 radio buttons in the 'count' integer
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		//click each radio button one at a time starting from 0
		for(int i = 0; i < count; i++)
		{
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
		 
	}

}
