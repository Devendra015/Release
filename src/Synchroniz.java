import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchroniz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   --- Implicit Wait
		
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		
		driver.findElement(By.xpath("//a[@class='change-lob']")).click();
		
		driver.findElement(By.xpath("//input[@name='LocationName']")).sendKeys("usa");
		
		driver.findElement(By.xpath("//input[@name='LocationName']")).sendKeys(Keys.ALT);
		
		driver.findElement(By.xpath("//input[@name='LocationName']")).sendKeys(Keys.ENTER);
		
		//Explicit Wait 
		WebDriverWait d = new WebDriverWait(driver,5);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'operation-city-quest')]")));
		
		driver.findElement(By.xpath("//a[contains(@href,'operation-city-quest')]")).click();
		
	}

}
