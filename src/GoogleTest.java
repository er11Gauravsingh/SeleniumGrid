import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
public class GoogleTest {
	
	@Test
	public void HomePageCheck() throws MalformedURLException, URISyntaxException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
		// caps.setPlatform(null); We cam also set the platform
	   //caps.setCapability(null, false); We can also set the advance capabilities 
		// URL class is depreceted so use URI
		WebDriver driver = new RemoteWebDriver(new URI("http://172.26.176.1:4444").toURL(), caps);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("rahul shetty");
		driver.close();
		
	}

}
