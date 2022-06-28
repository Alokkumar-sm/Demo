package demo1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotdemo {
	
	
	  static WebDriver driver;
public static void main(String[] args) throws IOException {
	 
	driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		Screenshotdemo sc = new Screenshotdemo();
		sc.takesscreenshot("fblogin213");
		
		
		driver.get("https://www.orangehrm.com/");
		sc.takesscreenshot("orangehrm1");
}
		public void takesscreenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File("C:\\Users\\Alok\\eclipse-workspace\\Selenium_demo\\Screenshots\\"+filename+".png");
		FileHandler.copy(screenshotAs, target);
	
	}

}
