package testCases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Verify_Check_LoginUser_with_Valid_Credentials {
	public AndroidDriver driver;

	public static void main(String[] args)
			throws MalformedURLException, IllegalMonitorStateException, InterruptedException, IOException {
		login();
	}

	public static AndroidDriver login()
			throws MalformedURLException, IllegalMonitorStateException, InterruptedException, IOException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "emulator-5556");
		caps.setCapability("appPackage", "io.ionic.starter");
		caps.setCapability("appActivity", "io.ionic.starter.MainActivity");
		caps.setCapability("automationName", "uiautomator2");
		caps.setCapability("nativeWebScreenshot", true);
		caps.setCapability("autoWebview", false);
		caps.setCapability("autoAcceptAlerts", true);
		caps.setCapability("unicodeKeyboard", true);
		caps.setCapability("chromedriverExecutable", "./Data/chromedriver.exe");

		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement email = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ListView/android.view.View[1]/android.view.View"));
		email.click();
		WebElement Email = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"));
		Email.sendKeys("Ranjit@gmail.com");

		WebElement pass = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText"));
		pass.sendKeys("123");
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.Button"))
				.click();
		System.out.println("user login succes");
		// Email.clear();
		return driver;
	}
}
