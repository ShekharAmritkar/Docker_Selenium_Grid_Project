package dockertests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class EdgeTest {

	@Test
	public void test2() throws MalformedURLException {
		
		EdgeOptions eo = new EdgeOptions();
		eo.setCapability("browserName", "edge");
		
		URL url = new URL (" http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,eo);
		
		driver.get("https://www.flipkart.com/");
		
		System.out.println("Title of page is: "+driver.getTitle());
		
		driver.quit();
		
		
	}
	
	
	
}
