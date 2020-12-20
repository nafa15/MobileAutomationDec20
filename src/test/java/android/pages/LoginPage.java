package android.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Go Back']")
    private WebElement backBtn;

    public void clickOnBackButton() {
        backBtn.click();
    }
}
