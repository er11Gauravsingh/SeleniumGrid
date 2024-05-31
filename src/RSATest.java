import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
public class RSATest {
	
	@Test
	public void HomePageCheck() throws MalformedURLException, URISyntaxException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setBrowserName("firefox");
		// caps.setPlatform(null); We cam also set the platform
	   caps.setCapability(CapabilityType.BROWSER_NAME, "firefox"); // We can also set the advance capabilities 
		// URL class is depreceted so use URI
		WebDriver driver = new RemoteWebDriver(new URI("http://172.28.128.1:4444").toURL(), caps);
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
