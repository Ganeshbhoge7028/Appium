package testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class Verify_Check_Send_Money_with_Invalid_data {
	

	public static void main(String[] args)
			throws IllegalMonitorStateException, InterruptedException, IOException {
		AndroidDriver driver =Verify_Check_LoginUser_with_Valid_Credentials.login();


		sendMoneyWithInvalidData(driver);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// ======================================================================================================================
		// Click on To Contact
	}
		public static void sendMoneyWithInvalidData(AndroidDriver driver) {
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[4]/android.widget.Image"))
				.click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View"))
				.click();// sendKeys("400");

		// select user from Dropedown
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.RadioButton"))
				.click();
		// click amount

		WebElement amount = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]"));
		amount.click();
		// Wait for the element to be clickable

		WebElement test = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText"));
		test.sendKeys("67@y");

		// Enter Reason
		WebElement reson = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View[2]"));
				reson.click();
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"))
		.sendKeys("Test");
		// click on Contineu Button
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[3]/android.view.View/android.widget.Button"))
				.click();
		try {
            // Convert the driver to TakesScreenshot
            TakesScreenshot screenshotDriver = (TakesScreenshot) driver;

            // Capture the screenshot as a byte array
            byte[] screenshotBytes = screenshotDriver.getScreenshotAs(OutputType.BYTES);

            // Specify the location to save the screenshot (e.g., path with a unique name)
            String screenshotPath = "./Data/Screenshote/" + "invalidAmount" + ".png";

            // Save the screenshot to the specified location
            FileUtils.writeByteArrayToFile(new File(screenshotPath), screenshotBytes);
            
            System.out.println("Screenshot captured and saved to: " + screenshotPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
System.out.println("Done with Test of send Money with invalid Credentials");
	}
}
