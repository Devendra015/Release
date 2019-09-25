package Important;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calendar Class
		
		// Run Test On Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		
		List<WebElement> listOfelement= driver.findElements(By.className("day"));
		
		for(int i=0;i<listOfelement.size();i++)
		{
			if(listOfelement.get(i).getText().contains("16"))
			{
				listOfelement.get(i).click();
			}
		}
	}
	
}