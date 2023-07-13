package dockertests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxTest {

	@Test
	public void test2() throws MalformedURLException {
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.setCapability("browserName", "firefox");
		
		URL url = new URL (" http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,fo);
		
		driver.get("https://www.myntra.com/");
		
		System.out.println("Title of page is: "+driver.getTitle());
		
		driver.quit();
		
		
	}
	
	
	
}
