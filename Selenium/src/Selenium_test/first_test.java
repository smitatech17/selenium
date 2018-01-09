package Selenium_test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_test {
	@Test
	public void test() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hotmail.com");
		
			
	
	}

}
