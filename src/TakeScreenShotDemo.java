import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotDemo {

	public static void main(String[] args) throws IOException {
	
	// Run Test On Chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https:\\www.google.com");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	FileUtils.copyFile(src, new File("C:\\Users\\devendra.swarnkar\\Desktop\\Selenium WebDriver with Java\\ScreenShots\\test.jpeg"));
		
	}

}
