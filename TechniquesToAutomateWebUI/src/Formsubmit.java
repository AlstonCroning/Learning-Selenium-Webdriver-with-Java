import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formsubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//get permission for Chrome Browser to run tests in this application
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dishan Croning\\Desktop\\Selenium Webdriver\\selenium-java-2.46.0\\selenium-2.46.0\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//invloke the Chrome Browser
		driver.manage().window().maximize();//maximize the Chrome Browser Window
		driver.get("http://www.spicejet.com/");//hit URL in browser
		
		//creating an object of 'Select' class provided by Selenium and using it for Static Dropdown
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));

		//using three different methods of select class to select any dropdown
		dropdown.selectByIndex(4); //index value starts with '0'
		dropdown.selectByVisibleText("9 Adults");
		dropdown.selectByValue("8");
		
		/*Used for Dynamic Dropdown
			//click on the dynamic dropbox field
			//driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	
			//click on the 'GOI' element inside the dynamic dropbox field
			//driver.findElement(By.xpath("//a[@value='GOI']")).click();
		*/
	}

}