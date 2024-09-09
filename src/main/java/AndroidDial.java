import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDial {

    private static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Android");

        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "15");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage","com.google.android.dialer");
        caps.setCapability("appActivity","com.google.android.dialer.extensions.GoogleDialtactsActivity");
        caps.setCapability("noReset","true");
        driver = new AndroidDriver(url, caps);
        System.out.println("Application is started");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("com.google.android.dialer:id/dialpad_fab")).click();
       driver.findElement(By.id("com.google.android.dialer:id/one")).click();
       driver.findElement(By.id("com.google.android.dialer:id/eight")).click();
       driver.findElement(By.id("com.google.android.dialer:id/three")).click();
        driver.findElement(By.id("com.google.android.dialer:id/four")).click();
        driver.findElement(By.id("com.google.android.dialer:id/two")).click();
        driver.findElement(By.id("com.google.android.dialer:id/nine")).click();
        driver.findElement(By.id("com.google.android.dialer:id/dialpad_voice_call_button")).click();
        System.out.println("Number is entered");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);








    }

}

