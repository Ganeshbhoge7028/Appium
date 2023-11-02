package testCases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;

public class Test {
	public static void main(String[] args)
			throws MalformedURLException, IllegalMonitorStateException, InterruptedException, IOException {
		
		//Signup.main(args);
		System.out.println("    */ln    **  /ln   ***");
		
		Verify_Check_Login_User_with_Invalid_Credentials.main(args);
		
		AndroidDriver driver = Verify_Check_LoginUser_with_Valid_Credentials.login();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Verify_Check_Send_Money_with_Valid_data.Sendmoneywithvaliddata(driver);

		Verify_Check_Send_Money_with_Invalid_data.sendMoneyWithInvalidData(driver);

		Verify_Check_Send_Money_Without_Choosing_another_user.sendMoneyWithInvalidData(driver);
		
		Verify_Check_Send_Money_Without_Providing_Amount.sendMoneyWithInvalidData(driver);
		
		Verify_Check_Send_Money_Without_Reason.sendMoneyWithInvalidData(driver);
		
		Verify_Check_Send_RTP_with_Valid_data.sendRTPWithInvalidData(driver);
		
		Verify_Check_Send_RTP_with_Invalid_Amount.sendRTPWithInvalidData(driver);
		
		Verify_Check_Send_RTP_Without_Choosing_another_user.sendRTPWithInvalidData(driver);
		
		Verify_Check_Send_RTP_Without_Choosing_another_user2.sendRTPWithInvalidData(driver);
		
		Verify_Check_Send_RTP_Without_Providing_Amount.sendRTPWithInvalidData(driver);
		
		Verify_Check_Send_RTP_Without_Reason.sendRTPWithInvalidData(driver);
		
		
		
		
		
		
	}
}
