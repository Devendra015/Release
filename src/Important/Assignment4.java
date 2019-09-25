package Important;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Run Test On Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");

		WebElement table = driver.findElement(By.id("product"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		List<WebElement> columns = rows.get(2).findElements(By.tagName("td"));

		System.out.println("No of Row's : " + rows.size());

		System.out.println("No of Column's : " + columns.size());

		for (int i = 0; i < columns.size(); i++) {
			System.out.println(columns.get(i).getText());
		}

		driver.close();
	}

}
