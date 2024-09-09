import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class EmulatorAPK {

    private static AndroidDriver driver;

    public static void main(String[] args) throws MalformedURLException {

            URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");

            // Specify path to the APK file
            File apkFile = new File("D:/ITI/Appium/APK/testproject-demo-app.apk");  // Change this to your APK path

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "Android");

        caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "15");
            caps.setCapability("app", apkFile.getAbsolutePath());
           caps.setCapability("automationName", "UiAutomator2");
           // caps.setCapability("automationName", "Appium");

          //  caps.setCapability("browserName","Chrome");
            AndroidDriver driver = new AndroidDriver(serverURL, caps);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            System.out.println("APK installed and running!");


        }
    }

