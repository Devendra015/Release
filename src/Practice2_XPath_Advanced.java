import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2_XPath_Advanced {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//*[text()=' Appium ']")).click();
		//driver.quit();
		
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		//
	}
}
