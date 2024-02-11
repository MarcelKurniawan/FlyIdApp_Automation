package MobileAutomation.StepDefinition;
import MobileAutomation.AutomationBase.BaseTest;
import MobileAutomation.PageObjectModel.HomePage;
import MobileAutomation.PageObjectModel.LoginPage;
import MobileAutomation.PageObjectModel.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ProfilePage profilePage = new ProfilePage();

    public LogoutTest() {
    }

    @And("user click logout button")
    public void userClickLogout() {
        profilePage.logoutButton();
    }

    @And("user click validate logout button")
    public void userClickValidateLogout() {
        profilePage.logoutValidationButton();
    }

    @Then("user is on successfuly logout")
    public void userSuccessLogout() {
        profilePage.validateOnProfilePage();
    }

}
