package MobileAutomation.StepDefinition;
import MobileAutomation.AutomationBase.BaseTest;
import MobileAutomation.PageObjectModel.HomePage;
import MobileAutomation.PageObjectModel.LoginPage;
import MobileAutomation.PageObjectModel.ProfilePage;
import MobileAutomation.PageObjectModel.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchTest extends BaseTest{
    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();
    @When("user fill the deparatue location with {string}")
    public void userInputDep(String dep) {
        homePage.searchDep(dep);
    }

    @And("user fill the arrival location with {string}")
    public void userInputArr(String arr) {
        homePage.searchArr(arr);
    }
    @And("user select calendar")
    public void userSelectCalendar() {
        homePage.selectCalendar();
    }

    @And("use select passenger")
    public void userSelectPass() {
        homePage.selectPassenger();
    }

    @And("user select class type")
    public void userSelectClass() {
        homePage.selectClass();
    }

    @And("user click search button")
    public void UserClickSearchButton() {
        homePage.clickSearch();
    }

    @Then("user should be able to see ticket list")
    public void validateUserCanSeeTicketResult() {
        searchPage.validateSearchAppear();
    }

}

