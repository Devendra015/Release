import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2_FirefoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\geckodriver.exe");;
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}

}
