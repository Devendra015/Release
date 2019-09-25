import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Chrome Profile
		DesiredCapabilities dc= DesiredCapabilities.chrome();
		//dc.acceptInsecureCerts();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//for local browser
		ChromeOptions co= new ChromeOptions();
		co.merge(dc);
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("fsd");
		
		
	}

}
