package listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {
	int count=0;
	int maxcount=2;
	@Override
	public boolean retry(ITestResult result) {
		
		if(maxcount>count) {
			count++;
			return true;
		}
		return false;
	}

}
