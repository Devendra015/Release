import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Run Test On Chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https:\\www.google.com");
	
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	
	driver.navigate().to("https:\\\\www.yahoo.com\"");
	driver.navigate().back();
	driver.navigate().forward();
	driver.close();
	
	}

}
