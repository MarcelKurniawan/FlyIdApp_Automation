package MobileAutomation.PageObjectModel;
import MobileAutomation.AutomationBase.BaseTest;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BaseTest{
    By searchResult = AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup");
    public void validateSearchAppear() {
        wait.until(ExpectedConditions.presenceOfElementLocated(searchResult));
    }
}
