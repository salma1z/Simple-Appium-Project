import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DragAndDropTouchAction {

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
        WebElement DragAndDropBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")));
        DragAndDropBtn.click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Source = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@resource-id=\"io.appium.android.apis:id/drag_dot_1\"]")));

        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Target = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@resource-id=\"io.appium.android.apis:id/drag_dot_2\"]")));

        TouchAction action = new TouchAction(driver);
        action.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(Source)))
                .moveTo(ElementOption.element(Target))
                .release()
                .perform();
           Thread.sleep(2000);
           driver.quit();
            }
}
