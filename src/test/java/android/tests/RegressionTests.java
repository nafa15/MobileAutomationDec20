package android.tests;


import android.pages.HomePage;
import android.pages.LoginPage;
import android.pages.ManageTransfersPages;
import com.pnt.mobileautomation.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegressionTests extends TestBase {

    @Test (enabled = false)
    public void validateUserCanClickOnAccountsButton(){

        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        homePage.clickOnAccountsButton();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickBetweenButtonsFromHeader() {
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        LoginPage loginPage = PageFactory.initElements(getDriver(), LoginPage.class);


        homePage.clickOnAccountsButton();
        loginPage.clickOnBackButton();
        homePage.clickOnDepositButton();
        loginPage.clickOnBackButton();
        homePage.clickOnPayABillButton();
        loginPage.clickOnBackButton();
    }

    @Test
    public void UserBeingAbleToProvideUserNameAndPassword() {
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        ManageTransfersPages manageTransfersPage = PageFactory.initElements(getDriver(), ManageTransfersPages.class);

        homePage.clickOnManageTransfersButton();
        sleepFor(5);
        manageTransfersPage.ProvideUserName();
        sleepFor(5);
        manageTransfersPage.ProvidePassword();
        sleepFor(5);
    }
}