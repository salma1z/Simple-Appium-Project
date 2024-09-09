import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidCalculator {

    private static AndroidDriver driver; // Use generic type for WebElement

    public static void main(String[] args) throws MalformedURLException {

        URL serverURL = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "f153ca51");

        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "6.0.1");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage","com.android.calculator2");
        caps.setCapability("appActivity","com.android.calculator2.Calculator");

        // Initialize driver after setting capabilities
        driver = new AndroidDriver(serverURL, caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // locate the Text on the calculator by using By.name()
        WebElement seven = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
        seven.click();
        WebElement plus = driver.findElement(By.id("com.android.calculator2:id/op_add"));
        plus.click();
        WebElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        three.click();
        WebElement equalTo = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equalTo.click();
        WebElement results = driver.findElement(By.id("com.android.calculator2:id/formula"));

        if(results.getText().equals("10"))
        {
            System.out.println("Test Passed...");
        }
        else
        {
            System.out.println("Test Failed...");
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

}

