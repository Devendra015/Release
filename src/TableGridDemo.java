import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGridDemo {
	
	static int sum=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	// Run Test On Chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20250/ind-vs-aus-match-14-icc-cricket-world-cup-2019");
	
	WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));

	List<WebElement> run= table.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']"));	
	
	int size = run.size();
	
	for(int i=1; i< run.size(); i++)
	{
		sum = sum +  Integer.parseInt(run.get(i).getText());
	}
	
	String extraRun = table.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText();
	
	sum = sum + Integer.parseInt(extraRun);
	

	
	String totalRun = driver.findElement(By.cssSelector("div[class='cb-col cb-col-8 text-bold text-black text-right']")).getText();
	
	if(sum ==  Integer.parseInt(totalRun))
	{
		System.out.println("Execution Completed.....");
	}
	
	driver.close();
	
	}
	
}
