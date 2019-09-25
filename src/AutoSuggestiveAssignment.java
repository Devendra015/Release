import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		System.out.println(js.executeScript(script));	
		
	}

}
