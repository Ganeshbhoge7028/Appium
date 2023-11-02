package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Verify_Check_Login_User_with_Invalid_Credentials {
	public static void main(String[] args)
			throws MalformedURLException, IllegalMonitorStateException, InterruptedException, IOException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "emulator-5556");
		caps.setCapability("appPackage", "io.ionic.starter");
		caps.setCapability("appActivity", "io.ionic.starter.MainActivity");
		caps.setCapability("automationName", "uiautomator2");
		caps.setCapability("nativeWebScreenshot", true);
		caps.setCapability("autoWebview", false);
		caps.setCapability("chromedriverExecutable", "./Data/chromedriver.exe");
		Properties properties = new Properties();
		FileInputStream fileInputStream = null;
		fileInputStream = new FileInputStream("Email.config");
		properties.load(fileInputStream);

		// Retrieve values using keys

		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement email = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ListView/android.view.View[1]/android.view.View"));
		email.click();
		WebElement Email = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"));

		WebElement pass = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText"));
		pass.sendKeys("123");
		WebElement LoginButton = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.Button"));
          int i=1;
		for (String propertyName : properties.stringPropertyNames()) {
			String emailvalue = properties.getProperty(propertyName);

			// Clear email field and enter the current email
			Email.clear();
			Email.sendKeys(emailvalue);

			// Enter a password (you can change this as needed)
			pass.sendKeys("123");
			System.out.println(emailvalue);
			// Click the login button
			LoginButton.click();

			// Add a delay or use WebDriverWait to wait for a result or error message
			Thread.sleep(5000);

			// Clear the email field for the next iteration
			
			try {
				TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
				byte[] screenshotBytes = screenshotDriver.getScreenshotAs(OutputType.BYTES);
				String screenshotPath = "./Data/Screenshote/" + "Invalidloginn"+i + ".png";
				FileUtils.writeByteArrayToFile(new File(screenshotPath), screenshotBytes);
				System.out.println("Screenshot captured and saved to: " + screenshotPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
			i++;
			Thread.sleep(2000);
			Email.clear();
			pass.clear();
		}
		
		System.out.println("==============================================================");
		System.out.println("done with testing");
	}
}
