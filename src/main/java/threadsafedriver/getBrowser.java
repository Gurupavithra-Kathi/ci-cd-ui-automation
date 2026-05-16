package threadsafedriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class getBrowser {
	public static String getString() throws IOException {
FileInputStream file = new FileInputStream("C:\\selenium\\ci-cd-practice-project.com\\src\\test\\resources\\config.properties");
Properties prop=new Properties();
prop.load(file);
prop.getProperty("url");
return prop.getProperty("url");
}
	public static String getBrowserVal() throws IOException {
FileInputStream file = new FileInputStream("C:\\selenium\\ci-cd-practice-project.com\\src\\test\\resources\\config.properties");
Properties prop=new Properties();
prop.load(file);
prop.getProperty("browser");
return prop.getProperty("browser");
}
}