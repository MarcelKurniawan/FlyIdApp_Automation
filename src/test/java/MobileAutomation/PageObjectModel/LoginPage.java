package MobileAutomation.PageObjectModel;
import MobileAutomation.AutomationBase.BaseTest;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class LoginPage extends BaseTest{

    By loginButton = AppiumBy.id("com.synrgyacademy.finalproject:id/login_btn");
    By formEmail = AppiumBy.id("com.synrgyacademy.finalproject:id/email_login_edit_text");
    By formPass = AppiumBy.id("com.synrgyacademy.finalproject:id/password_login_edit_text");

    public void validateOnLoginPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void inputEmail(String email) {
        driver.findElement(formEmail).sendKeys(email);
    }

    public void inputPassword(String password) {
        driver.findElement(formPass).sendKeys(password);
    }

}
