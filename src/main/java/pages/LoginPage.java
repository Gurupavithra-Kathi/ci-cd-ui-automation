package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;
By username= By.name("username");
By pwd=By.name("password");
By loginBtn = By.xpath("//button[normalize-space()='Login']");
public LoginPage(WebDriver driver) {
	this.driver=driver;
}
public void login(String user,String passwd) {
	driver.findElement(username).sendKeys(user);
	driver.findElement(pwd).sendKeys(passwd);
	driver.findElement(loginBtn).click();
	
}
}
