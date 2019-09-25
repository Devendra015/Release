import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.xpath("//input[@name='radioButton']")).size());
		
	}

}
