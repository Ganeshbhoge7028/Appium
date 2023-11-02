package testCases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;

public class Verify_Check_User_Able_to_Search_By_Amount {
	public static void main(String[] args)
			throws MalformedURLException, IllegalMonitorStateException, InterruptedException, IOException {
		AndroidDriver driver = Verify_Check_LoginUser_with_Valid_Credentials.login();
		Transacton(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public static void Transacton(AndroidDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[4]/android.view.View/android.widget.Image"))
				.click();

		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.EditText"))
				.sendKeys("100");
		Thread.sleep(5000);
		try {
			TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
			byte[] screenshotBytes = screenshotDriver.getScreenshotAs(OutputType.BYTES);
			String screenshotPath = "./Data/Screenshote/" + "TransactionSearchbyamt" + ".png";
			FileUtils.writeByteArrayToFile(new File(screenshotPath), screenshotBytes);
			System.out.println("Screenshot captured and saved to: " + screenshotPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Click on "X" Button
	/*	driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Button"))
				.click();
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[1]/android.view.View/android.view.View"))
				.click();*/
		
	}
}
