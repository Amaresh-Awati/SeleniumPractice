package sample_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SecondTest {
	
	@Test
	public void test() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	String appTitle = driver.getTitle();
	System.out.println(appTitle);
	Assert.assertTrue(appTitle.contains("Online Shopping Site for Mobiles"), "Title is not matching");
	
	driver.quit();

	}

}
