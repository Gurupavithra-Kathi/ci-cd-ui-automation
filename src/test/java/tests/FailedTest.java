package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import listeners.RetryTest;
import threadsafedriver.SeqBrowser;

public class FailedTest extends SeqBrowser {

	@Test(retryAnalyzer = RetryTest.class)
	public void FailTest() {
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(false);
		soft.assertAll();
	}
	
}
