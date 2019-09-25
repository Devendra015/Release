package Important;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Run Test On Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");

		WebElement element = driver.findElement(By.xpath("//label[@for='benz']"));

		driver.findElement(By.id("checkBoxOption1")).click();

		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));

		s.selectByVisibleText(element.getText());

		driver.findElement(By.id("name")).sendKeys(element.getText());

		driver.findElement(By.id("alertbtn")).click();

		String text = driver.switchTo().alert().getText();

		driver.switchTo().alert().accept();

		if (text.contains(element.getText())) {
			System.out.println("It's Available");
		} else {
			System.out.println("Not Available");
		}
	}
}