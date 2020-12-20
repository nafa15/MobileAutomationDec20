package android.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    private WebElement accountsBtn;

    public void clickOnAccountsButton() {
        accountsBtn.click();
    }
}
