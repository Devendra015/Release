import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/practice.php");
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByIndex(0);
		s.selectByValue("option2");
		s.selectByVisibleText("Option3");
		
	}

}
