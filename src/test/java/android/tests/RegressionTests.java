package android.tests;


import android.pages.HomePage;
import android.pages.LoginPage;
import android.pages.ManageTransfersPages;
import android.pages.ProductPage;
import com.pnt.mobileautomation.ExtentTestManager;
import com.pnt.mobileautomation.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegressionTests extends TestBase {

    @Test (enabled = false)
    public void validateUserCanClickOnAccountsButton(){

        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        homePage.clickOnAccountsButton();
    }

    @Test
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

    @Test(enabled = false)
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

    @Test
    public void validateUserBeingAbleToScrollOnProductPage() {
        HomePage homePage = PageFactory.initElements(getDriver(), HomePage.class);
        ProductPage productPage = PageFactory.initElements(getDriver(), ProductPage.class);

        homePage.clickOnProducts();
        productPage.userOnProductPage();
        functionSwipe("up", 200, 500);
        ExtentTestManager.log("swiped down");
        sleepFor(2);
        functionSwipe("up", 200, 500);
        sleepFor(2);
        ExtentTestManager.captureScreenshot(getDriver(), "validateUserBeingAbleToScrollOnProductPage.png");
    }
}