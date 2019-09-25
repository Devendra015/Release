import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Run Test On chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();

		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");

		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
