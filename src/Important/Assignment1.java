package Important;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Run Test On Chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.qaclickacademy.com/practice.php");

    WebElement footerDriver = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]"));
	
    List<WebElement> listOfElements = footerDriver.findElements(By.tagName("a"));
    
    String newTab= Keys.chord(Keys.CONTROL, Keys.ENTER);
    
    for(int i=1; i<listOfElements.size();i++)
    {
    	
    	listOfElements.get(i).sendKeys(newTab);
    }
    
    Set<String> Ids=  driver.getWindowHandles();
    
    for (String id : Ids) {
		driver.switchTo().window(id);
		System.out.println(driver.getTitle());
	}
    
	}

}
