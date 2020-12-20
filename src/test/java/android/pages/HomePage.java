package android.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    private WebElement accountsBtn;

    @FindBy(xpath = "//android.widget.Button[@text='TRANSFER']")
    private WebElement transferBtn;

    @FindBy(xpath = "//android.widget.Button[@text='DEPOSIT']")
    private WebElement depositBtn;

    @FindBy(xpath = "//android.widget.Button[@text='SEND MONEY']")
    private WebElement sendMoneyBtn;

    @FindBy(xpath = "//android.widget.Button[@text='PAY A BILL']")
    private WebElement payAbillBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Manage Transfers']")
    private WebElement manageTransfersBt;


    public void clickOnAccountsButton() {
        accountsBtn.click();
    }

    public void clickOnPayABillButton() {
        payAbillBtn.click();
    }

    public void clickOnDepositButton() {
        depositBtn.click();
    }

    public void clickOnTransferButton() {
        transferBtn.click();
    }

    public void clickOnSendMoneyButton() {
        sendMoneyBtn.click();
    }

    public void clickOnManageTransfersButton() {
        manageTransfersBt.click();

    }

}
