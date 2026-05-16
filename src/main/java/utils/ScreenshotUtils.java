package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.DriverManager;
import threadsafedriver.ThreadSafety;

public class ScreenshotUtils {
	public static void getScreenShot(String methodname) throws IOException {
        WebDriver driver =ThreadSafety.getDriver(); // ← Gets driver from ThreadLocal
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/" + methodname + ".png");
		FileUtils.copyFile(src, dest);
	}
}
