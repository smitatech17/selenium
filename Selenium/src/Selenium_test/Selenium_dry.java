package Selenium_test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_dry {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver object reference access all the built in function in Selenium.

		driver.manage().window().maximize();// maximizes window

		driver.get("https://www.qtptutorial.net/automation-practice/");

		driver.findElement(By.id("idExample")).click();

		driver.findElement(By.className("main_title")).isDisplayed();

		driver.close();
		driver.quit();

	}
	
	@Test
	public void class_button() {
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver object reference access all the built in function in Selenium.

		driver.manage().window().maximize();// maximizes window

		driver.get("https://www.qtptutorial.net/automation-practice/");
		
		driver.findElement(By.className("buttonClassExample")).click();
		
		driver.findElement(By.className("main_title")).isDisplayed();
		
		driver.close();
		driver.quit();
	
	}
	
	@Test
	public void Name_button() {
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver object reference access all the built in function in Selenium.

		driver.manage().window().maximize();// maximizes window

		driver.get("https://www.qtptutorial.net/automation-practice/");
		
		driver.findElement(By.name("NameExample")).click();
		
		driver.findElement(By.className("main_title")).isDisplayed();
		
		driver.close();
		driver.quit();
		
		}
	
	@Test
	public void Name_clickme() {
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver object reference access all the built in function in Selenium.

		driver.manage().window().maximize();// maximizes window

		driver.get("https://www.qtptutorial.net/automation-practice/");
		
		driver.findElement(By.className("et_pb_promo_button")).click();
		
		driver.findElement(By.className("main_title")).isDisplayed();
		
		driver.close();
		driver.quit();
		
		}
	@Test
	public void Email() {
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver object reference access all the built in function in Selenium.

		driver.manage().window().maximize();// maximizes window

		driver.get("https://www.qtptutorial.net/automation-practice/");
		
		driver.findElement(By.id("et_pb_signup_firstname")).sendKeys("John");
		
		driver.findElement(By.id("et_pb_signup_email")).sendKeys("John@gmail.com");
		
		driver.findElement(By.className("et_pb_newsletter_button_text")).click();
		
		driver.close();
		driver.quit();
		
		}
	@Test
	public void login_page_button() {
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver object reference access all the built in function in Selenium.

		driver.manage().window().maximize();// maximizes window

		driver.get("https://www.qtptutorial.net/automation-practice/");
		
		driver.findElement(By.className("et_pb_promo_button")).click();
		
		driver.findElement(By.id("user_login")).sendKeys("John");
		
		driver.findElement(By.id("user_pass")).sendKeys("Mary123");
		
		driver.findElement(By.id("wp-submit")).click();
		
		driver.close();
		driver.quit();
	}
	
	
}
