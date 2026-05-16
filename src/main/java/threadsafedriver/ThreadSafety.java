package threadsafedriver;

import org.openqa.selenium.WebDriver;

public class ThreadSafety {
	private static ThreadLocal<WebDriver> localdriver=new ThreadLocal<WebDriver>();
public static WebDriver getDriver() {
	return localdriver.get();
}
public static void setDriver(WebDriver driver) {
	localdriver.set(driver);
}
}
