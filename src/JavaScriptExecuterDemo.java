import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Run Test On Chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://ksrtc.in/oprs-web/");
	
	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
//	driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
	
	//System.out.println("Test : "+ driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	String script = "return document.getElementById(\"fromPlaceName\").value;";
	
	System.out.println(js.executeScript(script));
	
	while(js.executeScript(script) != "BENGALURU DARSHINI")
	{
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
	}
	
	}

}
