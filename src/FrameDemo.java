import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Run Test On Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'droppable')]")));
		//driver.findElement(By.id("draggable")).click();
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
		driver.switchTo().defaultContent();
	}

}
