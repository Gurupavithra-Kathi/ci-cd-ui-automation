//package base;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
//
//public class BaseTest {
////protected WebDriver driver;
//
//
//    @BeforeMethod
//    public void setup() {
//
//        WebDriver driver = new ChromeDriver();
//
//        DriverManager.setDriver(driver);
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        DriverManager.getDriver()
//                .get("https://opensource-demo.orangehrmlive.com/");
//    }
//}
//
