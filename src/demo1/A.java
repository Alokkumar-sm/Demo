package demo1;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class A {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	//	WebDriver driver = new FirefoxDriver();
		// driver.get("https://www.google.com/"); 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com//");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle()); // returns the title of the page
		System.out.println(driver.getCurrentUrl()); // returns the url of the page
		
	
		driver.findElement(By.xpath("/html/body/header/section/div/div/div/div/div/div[1]/form/div/div[1]/a/div/div/div[2]/div/input[1]")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("/html/body/header/section/div/div/div/div/div/div[1]/form/div/div[3]/a/div/div/div[2]/div/input[2]")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("/html/body/header/section/div/div/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
		
		driver.close(); // closes the current window
		//	driver.quit(); // closes the multiple window
		
		
	// driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("hello");
	//	Thread.sleep(3000);
	// WebDriverWait firstResult = new WebDriverWait(driver, Duration.ofSeconds(10));
	// firstResult.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[9]/ul/li")));
		
	// driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	//	String actualUrl="https://www.googliiiie.com/";
	//	String expectedUrl= driver.getCurrentUrl();
		//	Assert.assertEquals(expectedUrl,actualUrl);
		//System.out.println(expectedUrl);

	}

}
