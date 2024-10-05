import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

public class Swap {

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
        Dimension size=driver.manage().window().getSize();
        int startX= size.getWidth()/2;
        int startY=size.getHeight()/2;

        int endX= startX;
        int endY= (int) (size.getHeight() * 0.25);
        PointerInput finger1=new PointerInput(PointerInput.Kind.TOUCH,"finger1");

        Sequence sequence=new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(200)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(100),PointerInput.Origin.viewport(),endX,endY))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(sequence));
        Thread.sleep(2000);
        driver.quit();

       }
}
