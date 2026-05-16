package tests;

import org.testng.annotations.Test;

import threadsafedriver.SeqBrowser;

public class SkipTest extends SeqBrowser{
@Test(enabled=false)
public void skippedTest() {
	System.out.println("skipping this test");
}
}
