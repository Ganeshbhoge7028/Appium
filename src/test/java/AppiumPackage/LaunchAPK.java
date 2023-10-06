package AppiumPackage;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
public class LaunchAPK {
	 
	public static void main(String[] args) throws MalformedURLException {
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("platformName", "Android");
		 caps.setCapability("deviceName", "emulator-5554");
		 caps.setCapability("appPackage", "io.ionic.starter"); 
		 caps.setCapability("appActivity", "io.ionic.starter.MainActivity"); 
		 caps.setCapability("automationName", "uiautomator2");
	        caps.setCapability("nativeWebScreenshot", true);
	        caps.setCapability("autoWebview", false);
	        caps.setCapability("chromedriverExecutable","./Data/chromedriver.exe");
	
		 AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	 	     WebElement email = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]"));
	 	    email.click();
	 	   WebElement email1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText"));
	 	   email1.sendKeys("kush.pachghare@intelliquity.in");
	 	  WebElement pass = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"));
	 	   pass.sendKeys("123");
	 	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.Button")).click();
  //======================================================================================================================
		   //Click on To Contact
	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[4]/android.widget.Image")).click();
	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View")).click();//sendKeys("400");
	 
	 //select user from Dropedown
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.ListView/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.RadioButton")).click();
	//click amount
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement amount = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]"));
	 amount.click();
	// Wait for the element to be clickable
	
	WebElement test = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText"));
	 test.sendKeys("9008");
	 
	// Enter Reason
	 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.ListView/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText")).sendKeys("Test");
	 //click on Contineu Button
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[3]/android.view.View/android.widget.Button")).click();
	  
	  //click on Confirm Pay
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button")).click();
	// back button
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")).click();
	  
	  //cancle button
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.app.Dialog/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button")).click();
	 	
	  //Click on Request Icon
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[2]/android.view.View/android.widget.Image")).click();
	}	
	}
	
