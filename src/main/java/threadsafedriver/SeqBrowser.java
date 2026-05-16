package threadsafedriver;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class SeqBrowser {
	@BeforeMethod
	public void Setup() throws IOException {
		
	WebDriver driver=CreateBrowser.createBrowserConfig();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	ThreadSafety.setDriver(driver);
	driver=ThreadSafety.getDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
}
}