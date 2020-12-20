package android.tests;


import android.pages.HomePage;
import com.pnt.mobileautomation.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegressionTests extends TestBase {

    @Test
    public void validateUserCanClickOnAccountsButton(){

        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        homePage.clickOnAccountsButton();
    }
}