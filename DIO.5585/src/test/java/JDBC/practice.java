package JDBC;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {
public static void main(String[] args) throws Throwable {
WebDriverManager.chromedriver().setup();
URL url=new URL(" http://192.168.61.1:4444/wd/hub");
DesiredCapabilities cap=new DesiredCapabilities();
cap.setBrowserName("chrome");
cap.setPlatform(Platform.WINDOWS);
RemoteWebDriver driver=new RemoteWebDriver(url, cap);
driver.get("https://www.amazon.in");
}
}
