import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[@href='/windows']")).click();

		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> ids = driver.getWindowHandles();

		Iterator<String> id = ids.iterator();

		String partntId = id.next();
		String childId = id.next();

		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());

		driver.switchTo().window(partntId);

		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	}

}
