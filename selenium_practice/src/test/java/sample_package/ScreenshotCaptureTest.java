package sample_package;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenshotCaptureTest {

	@Test
	public void testGuru99TakeScreenShot() throws Exception{

		WebDriver driver ;
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		driver = new FirefoxDriver();

		//goto url

		driver.get("http://demo.guru99.com/V4/");

		//Call take screenshot function

		this.takeSnapShot(driver, "D:/Amaresh/screenshots/screenshot.jpg") ;     

	}

	/**

	 * This function will take screenshot

	 * @param webdriver

	 * @param fileWithPath

	 * @throws Exception

	 */

	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

		//Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot =((TakesScreenshot)webdriver);

		//Call getScreenshotAs method to create image file

		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		//Move image file to new destination

		File DestFile=new File(fileWithPath);

		//Copy file at destination*/

		//   FileHandler.copyFile(SrcFile, DestFile);
		FileHandler.copy(SrcFile, DestFile);

	}


}
