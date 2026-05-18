package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import threadsafedriver.SeqBrowser;
import threadsafedriver.ThreadSafety;
public class ForgotPwd extends SeqBrowser{
	 
	
	public void forgotPasswordFlow() {
		 WebDriver driver =
	                ThreadSafety.getDriver();
		LoginPage lp =
		        new LoginPage(driver);
		lp.forgotPassword();
		

	}
}
