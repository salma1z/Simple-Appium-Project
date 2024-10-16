import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserAutomation {
    private static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Android");

        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "15");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("chromedriverExecutable", "C:\\Users\\Giga Byte-M\\IdeaProjects\\AppiumProject\\driver\\chromedriver.exe");
        driver = new AndroidDriver(url, caps);
       driver.get("https://www.google.com/");

    }
}
