import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestCase3_IEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\IEDriverServer.exe");
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		dc.setCapability("ignoreProtectedModeSettings", true);
		WebDriver driver = new InternetExplorerDriver(dc);
		driver.get("https://www.google.com");
	}

}
