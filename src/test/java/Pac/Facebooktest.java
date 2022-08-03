package Pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooktest {
	
	@Test
	public void faceBook() throws Throwable {
		WebDriverManager.chromedriver().setup();
		Thread.sleep(2000);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
	}

}
