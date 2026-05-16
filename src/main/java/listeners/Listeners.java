package listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utils.ScreenshotUtils;

public class Listeners implements ITestListener{
	@Override
public void onTestStart(ITestResult result) {
		System.out.println("started: "+result.getName());
	
}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success: "+result.getName());

	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed: "+result.getName());
		try {
			System.out.println(result.getName()+" failed capturing screesnhot");
			ScreenshotUtils.getScreenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped: "+result.getName());

	}
}
