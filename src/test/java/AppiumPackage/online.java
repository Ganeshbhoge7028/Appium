package AppiumPackage;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class online {
	 public static void main(String[] args) throws MalformedURLException, InterruptedException {
		 System.out.println("1");
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
	        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
	        System.out.println("2");
	        caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
	        caps.setCapability("chromeOptions",ImmutableMap.of("w3c",false));
	        System.out.println("3");
	        caps.setCapability("chromedriverExecutable", "./chromedriver.exe");
	        caps.setCapability("appium:chromedriverEnableRevert", true);
	        System.out.println("4");
;
	        // Initialize the driver
	        AppiumDriver driver = new AndroidDriver(new URL(" http://0.0.0.0:4723/wd/hub"), caps);
	        System.out.println("5");
            String url = driver.getCurrentUrl();
            System.out.println(url);
	        // Wait for a few seconds to ensure the app is launched
	       // Thread.sleep(5000);

	        // You can perform further actions or validations here

	        // Close the app
	      //  driver.quit();
	    }
	}


