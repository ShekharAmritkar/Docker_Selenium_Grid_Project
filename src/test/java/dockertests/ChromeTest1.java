package dockertests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest1 {

	@Test
	public void test1() throws MalformedURLException {
		
		ChromeOptions co = new ChromeOptions();
		co.setCapability("browserName", "chrome");
		
		URL url = new URL (" http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,co);
		
		driver.get("https://demo.nopcommerce.com/");
		
		System.out.println("Title of page is: "+driver.getTitle());
		
		driver.quit();
		
		
	}
	
	
	
}
