package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver() ;
		
		
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.partialLinkText("Mobil")).click();
		
		
	}
}
