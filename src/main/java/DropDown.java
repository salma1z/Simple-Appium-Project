import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DropDown {

    private static AndroidDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Android");

        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "15");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", "C:\\Users\\Giga Byte-M\\Desktop\\Appium\\ApiDemos-debug.apk");
        //caps.setCapability("adbExecTimeout", 60000); // 60 seconds
        driver = new AndroidDriver(url, caps);
        System.out.println("Application is launched");

        WebElement viewButton=driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
        viewButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ControlBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")));
        ControlBtn.click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement theme = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]")));
        theme.click();

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement DropBtn = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Spinner[@resource-id=\"io.appium.android.apis:id/spinner1\"]")));
        DropBtn.click();

        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement SelectBtn = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath(" //android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Mars\"]")));
        SelectBtn.click();

        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement SaveBtn = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath(" //android.widget.Button[@resource-id=\"io.appium.android.apis:id/button\"]")));
        SaveBtn.click();

        Thread.sleep(2000);
        driver.quit();
    }
}
