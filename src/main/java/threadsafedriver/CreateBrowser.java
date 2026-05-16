package threadsafedriver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateBrowser {
	
public static WebDriver createBrowserConfig() throws IOException {
	 WebDriver driver=null;
	String browser=getBrowser.getBrowserVal();
	switch(browser.toLowerCase()){
	case "chrome":
		driver=new ChromeDriver();
		return driver;
	case "edge":
		driver=new EdgeDriver();
	case "firefox"	:
		driver=new FirefoxDriver();
	
	}
	return driver;
}
}
