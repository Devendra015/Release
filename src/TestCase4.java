import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Run Test On Chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
	
	driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test");
	driver.findElement(By.cssSelector("#password")).sendKeys("test");
	
	}
}
