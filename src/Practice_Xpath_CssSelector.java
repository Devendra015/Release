import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Practice_Xpath_CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("test");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[title*=Sign]")).click();
	}

}
