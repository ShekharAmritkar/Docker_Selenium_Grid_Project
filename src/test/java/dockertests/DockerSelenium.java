package dockertests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerSelenium {

	public static void main(String[] args) throws MalformedURLException  {

//		usingChrome();
		usingFirefox();
		
		
	}

	
	public static void usingChrome() throws MalformedURLException {

		// Depricated from Selenium 4
		//DesiredCapabilities dc = new DesiredCapabilities();
		//dc.setCapability("browserName", "chrome");			
		
		ChromeOptions co = new ChromeOptions();
		co.setCapability("browserName", "chrome");
		
		URL url = new URL (" http://localhost:4444/wd/hub");
		
		//RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		RemoteWebDriver driver = new RemoteWebDriver(url,co);
		
		driver.get("https://demo.nopcommerce.com/");
		
		System.out.println("Title of page is: "+driver.getTitle());
		
		driver.quit();
		
	}

	public static void usingFirefox() throws MalformedURLException {
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.setCapability("browserName", "firefox");
		
		URL url = new URL (" http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,fo);
		
		driver.get("https://demo.nopcommerce.com/");
		
		System.out.println("Title of page is: "+driver.getTitle());
		
		driver.quit();
		
	}
	
}
