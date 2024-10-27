import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TextboxAndcheckbox {
    private static AndroidDriver driver;

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

            // Set up Appium driver
            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "Android");
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "15");
            caps.setCapability("app", "C:\\Users\\Giga Byte-M\\Desktop\\Appium\\ApiDemos-debug.apk");
            caps.setCapability("automationName", "UiAutomator2");
            //caps.setCapability("uiautomator2ServerLaunchTimeout", 60000);

            driver = new AndroidDriver(url, caps);
           // Thread.sleep(5000);
             System.out.println("Application is started");

/*//click on views button
             driver.findElements(By.id("android:id/text1")).get(11).click();
             //click on controller button
            driver.findElements(By.id("android:id/text1")).get(4).click();*/
        WebElement viewButton=driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
        viewButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ControlsBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")));
        ControlsBtn.click();
            //click on Dark theme
        WebElement LightTheme = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]")));
        LightTheme.click();
            // textbox
        WebElement txtBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.EditText")));
        txtBtn.sendKeys("SalmaElzeheiry");

           //Click Checkbox
        WebElement CheckBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.CheckBox[@content-desc=\"Checkbox 1\"]")));
        CheckBtn.click();
           //click Radiobutton
        WebElement RadioBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadioButton[@content-desc=\"RadioButton 2\"]")));
        RadioBtn.click();
         //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.quit();

        }

    }

