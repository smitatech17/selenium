import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_test {
@Test
public void test() {
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver object reference access all the built in function in Selenium.
	driver.get("https://www.facebook.com/");
}
}
