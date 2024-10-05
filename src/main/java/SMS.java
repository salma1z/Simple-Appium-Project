import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class SMS {

    private static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Android");

        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "15");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage","com.google.android.apps.messaging");
        caps.setCapability("appActivity","com.google.android.apps.messaging.ui.ConversationListActivity");
        caps.setCapability("noReset","true");
        caps.setCapability("adbExecTimeout", 60000); // 60 seconds
        driver = new AndroidDriver(url, caps);
        System.out.println("Application is started");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.apps.messaging:id/start_chat_fab"))).click();
       wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.google.android.apps.messaging:id/recipient_text_view"))).sendKeys("4335322532");

      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.google.android.apps.messaging:id/ContactSuggestionList"))).click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.apps.messaging:id/send_button_sms"))).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.quit();


    }

}

