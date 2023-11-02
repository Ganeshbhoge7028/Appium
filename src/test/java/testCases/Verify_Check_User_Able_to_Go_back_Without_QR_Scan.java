package testCases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.appium.java_client.android.AndroidDriver;

public class Verify_Check_User_Able_to_Go_back_Without_QR_Scan {
	public static void main(String[] args)
			throws MalformedURLException, IllegalMonitorStateException, InterruptedException, IOException {
		AndroidDriver driver = Verify_Check_LoginUser_with_Valid_Credentials.login();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		QRScan(driver);
	}

	public static void QRScan(AndroidDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.widget.Image"))
				.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(4000);
		try {
			TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
			byte[] screenshotBytes = screenshotDriver.getScreenshotAs(OutputType.BYTES);
			String screenshotPath = "./Data/Screenshote/" + "QRSCAn" + ".png";
			FileUtils.writeByteArrayToFile(new File(screenshotPath), screenshotBytes);
			System.out.println("Screenshot captured and saved to: " + screenshotPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.Button"))
				.click();
		Thread.sleep(2000);

	}
}
