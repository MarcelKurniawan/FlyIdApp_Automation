package MobileAutomation.AutomationBase;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BaseTest {
    protected static AndroidDriver driver;
    protected static WebDriverWait wait;

    public static void setup(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11.0");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", "C:/Users/Marcel/Downloads/app-debug.apk");

        driver = new AndroidDriver(capabilities);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }
    public static void stopDriver() {
        driver.quit();
    }

    public static void resetApp() {
        driver.terminateApp("com.synrgyacademy.finalproject");
        driver.activateApp("com.synrgyacademy.finalproject");
    }


}