import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice3_CssSelector_Advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://login.salesforce.com/?locale=in");
	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("test");
	driver.findElement(By.cssSelector("[id='password']")).sendKeys("test");
	driver.findElement(By.cssSelector("#Login")).click();
	}

}
