import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Runs the '.exe' file required for Chrome Browser (provides key="chrome driver" and value="path of the .exe")
		//this gives permission for Chrome to run the tests in this application
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dishan Croning\\Desktop\\Selenium Webdriver\\selenium-java-2.46.0\\selenium-2.46.0\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();//Invoking the  Chrome Browser
		driver.get("https://www.google.ca");//hit the URL in the browser
	}

}
