package MobileAutomation.PageObjectModel;
import MobileAutomation.AutomationBase.BaseTest;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class HomePage extends BaseTest{

    By searchButton = AppiumBy.id("com.synrgyacademy.finalproject:id/btn_search");
    By profileButton = AppiumBy.accessibilityId("Profil");
    By depButton = AppiumBy.id("com.synrgyacademy.finalproject:id/tv_departure");
    By citySearch = AppiumBy.id("com.synrgyacademy.finalproject:id/et_search");
    By searchResult = AppiumBy.id("com.synrgyacademy.finalproject:id/tv_city");
    By arrButton = AppiumBy.id("com.synrgyacademy.finalproject:id/tv_arrival");
    By calenderButton = AppiumBy.id("com.synrgyacademy.finalproject:id/iv_calendar");
    By calenderSelect = AppiumBy.xpath("//android.view.View[@content-desc=\"11 February 2024\"]");
    By calenderConfirm = AppiumBy.id("android:id/button1");
    By passengerValue = AppiumBy.id("com.synrgyacademy.finalproject:id/ll_passenger");
    By addAdult = AppiumBy.id("com.synrgyacademy.finalproject:id/ib_add_adult_count");
    By addChild = AppiumBy.id("com.synrgyacademy.finalproject:id/ib_add_child_count");
    By addBaby = AppiumBy.id("com.synrgyacademy.finalproject:id/ib_add_baby_count");
    By savePassenger = AppiumBy.id("com.synrgyacademy.finalproject:id/btn_simpan");
    By classButton = AppiumBy.id("com.synrgyacademy.finalproject:id/ll_class");
    By businessSelect = AppiumBy.id("com.synrgyacademy.finalproject:id/rb_business");



    public void validateOnPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(searchButton));
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }

    public void clickProfile() {
        driver.findElement(profileButton).click();
    }

    public void searchDep(String Dep) {
        driver.findElement(depButton).click();
        driver.findElement(citySearch).sendKeys(Dep);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(searchResult, "Jakarta (CGK)"));
        driver.findElement(searchResult).click();
    }

    public void searchArr(String Arr) {
        driver.findElement(arrButton).click();
        driver.findElement(citySearch).sendKeys(Arr);
        wait.until(ExpectedConditions.presenceOfElementLocated(searchResult));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(searchResult, "Bandung (BDO)"));
        driver.findElement(searchResult).click();
    }

    public void selectCalendar() {
        driver.findElement(calenderButton).click();
        driver.findElement(calenderConfirm).click();
    }

    public void selectPassenger() {
        driver.findElement(passengerValue).click();
        driver.findElement(addChild).click();
        driver.findElement(addBaby).click();
        driver.findElement(savePassenger).click();
    }

    public void selectClass() {
        driver.findElement(classButton).click();
        driver.findElement(businessSelect).click();
    }

}
