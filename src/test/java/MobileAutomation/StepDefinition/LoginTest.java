package MobileAutomation.StepDefinition;
import MobileAutomation.AutomationBase.BaseTest;
import MobileAutomation.PageObjectModel.HomePage;
import MobileAutomation.PageObjectModel.LoginPage;
import MobileAutomation.PageObjectModel.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ProfilePage profilePage = new ProfilePage();

    public LoginTest() {
    }

    @And("user go to profile page")
    public void userGoToLoginPage() {
        homePage.clickProfile();
    }
    @When("user click login button")
    public void userClickLogin() {
        profilePage.clickMasuk();
    }

    @When("user click logins button")
    public void userClickLogins() {
        profilePage.clickMasuk2();
    }
    @And("user input email with {string}")
    public void userInputUsernameWith(String email) {
        loginPage.inputEmail(email);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.inputPassword(password);
    }

    @And("user click agains on login button")
    public void userClickOnLoginButton() {
        loginPage.clickLogin();
    }

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage.validateOnPage();
    }

//    @Then("user is able to see error message")
//    public void getErrorMesaage() {
//        loginPage.isErrorDisplayed();
//    }

    @Given("user is on home page")
    public void userIsOnHomePage() {
        homePage.validateOnPage();
    }

}
