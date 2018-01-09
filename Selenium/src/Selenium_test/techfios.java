package Selenium_test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class techfios {
	@Test
	public void login_page_button() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://techfios.com/test/billing/?ng=login/");
		
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.className("nav-label")).click();
		
		//driver.findElement(xpath=//*[@id='side-menu']/li[5]/ul/li[1]/a).
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
}
			@Test
		public void New_Account() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("http://techfios.com/test/billing/?ng=login/");
			
			driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		
			driver.findElement(By.id("password")).sendKeys("abc123");
			
			driver.findElement(By.name("login")).click();
			
			driver.findElement(By.xpath(".//*[@id='side-menu']/li[5]/a/span[1]")).click();
			
			driver.findElement(By.xpath(".//*[@id='side-menu']/li[5]/ul/li[1]/a")).click();
	
			driver.findElement(By.id("account")).sendKeys("School Fund");
			
			driver.findElement(By.id("description")).sendKeys("Paying School loan");
			
			driver.findElement(By.id("balance")).sendKeys("1000");
			
			driver.findElement(By.xpath(".//*[@id='page-wrapper']/div[3]/div[1]/div/div/div[2]/form/button")).click();
			
			Thread.sleep(3000);
			
			driver.close();
			driver.quit();
	}	
}
