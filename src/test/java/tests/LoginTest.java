package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.DriverManager;
import pages.LoginPage;
import threadsafedriver.SeqBrowser;

public class LoginTest extends SeqBrowser {
	WebDriver driver;
@Test
public void loginUser() {
	driver=DriverManager.getDriver();
	LoginPage login=new LoginPage(driver);
	login.login("Admin","admin123");
}
}
