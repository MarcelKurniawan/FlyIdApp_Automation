package MobileAutomation.PageObjectModel;
import MobileAutomation.AutomationBase.BaseTest;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfilePage extends BaseTest{

    By masukButton = AppiumBy.id("com.synrgyacademy.finalproject:id/btn_masuk");
    By masukButton2 = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");

    By logoutButton = AppiumBy.id("com.synrgyacademy.finalproject:id/btn_keluar");
    By logoutValidation = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");

    public void validateOnProfilePage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(masukButton));
    }
    public void clickMasuk() {
        driver.findElement(masukButton).click();
    }
    public void clickMasuk2() {
        driver.findElement(masukButton2).click();
    }

//    public void logoutButton() {
//        driver.findElement(logoutButton).click();
//    }

    public void logoutValidationButton() {
        driver.findElement(logoutValidation).click();
    }

    public void logoutButton(){
        driver.findElement(
                new AppiumBy.ByAndroidUIAutomator(
                        String.format(
                                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Keluar\"))")));
        driver.findElement(logoutButton).click();
    }
}
