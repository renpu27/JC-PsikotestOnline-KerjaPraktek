package projectmagang.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import projectmagang.drivers.DriverSingleton;
import projectmagang.utils.Constants;

public class FormAddAdminPage {
    private WebDriver driver;
    public FormAddAdminPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Add']")
    WebElement btnAddAdmin;
    @FindBy(xpath = "//input[@id='tl_agent_editable-14-53699_text']")
    WebElement fullName;
    @FindBy(xpath = "//select[@id='tl_agent_editable-14-53700_text']")
    WebElement listPrivileges;
    @FindBy(xpath = "//select[@id='tl_agent_editable-14-53702_text']")
    WebElement listSupervisor;
    @FindBy(xpath = "//input[@id='tl_agent_editable-14-53705_text']")
    WebElement telephone;
    @FindBy(xpath = "//input[@id='tl_agent_editable-14-53709_text']")
    WebElement username;
    @FindBy(xpath = "//input[@id='tl_agent_editable-14-53710_text']")
    WebElement password;
    @FindBy(xpath = "//span[normalize-space()='Save']")
    WebElement saveData;
    @FindBy(xpath = "//p[normalize-space()='Mohon Lengkapi Data']")
    WebElement dataNotCompleteTxt;
    @FindBy(xpath = "//span[normalize-space()='Yes']")
    WebElement confirmSave;
    @FindBy(xpath = "//input[@id='tl_user_management--53685_text']")
    WebElement searchBar;
    @FindBy(xpath = "//span[contains(@class,'ui-button-icon-primary ui-icon ui-icon-closethick')]")
    WebElement closeWarning;
    @FindBy(xpath = "//span[normalize-space()='OK']")
    WebElement btnDismissLoginMsg;
    @FindBy(xpath = "//h3[normalize-space()='User Management']//span")
    WebElement menuUserManagement;
    @FindBy(xpath = "//span[normalize-space()='Admin']")
    WebElement menuAdmin;
    @FindBy(xpath = "//span[normalize-space()='Pemberitahuan!']")
    WebElement passwdErrorNotification;

    public void refreshPage() {
        driver.get(Constants.URL);
    }
    public void dismissLoginMsg() {
        btnDismissLoginMsg.click();
    }
    public void confirmSave() {
        confirmSave.click();
    }
    public void accessMenuUserMgMt() {
        menuUserManagement.click();
    }
    public void accessMenuAdmin() {
        menuAdmin.click();
    }
    public void clickBtnAddAdmin() {
        btnAddAdmin.click();
    }
    public void dismissWarningLengkapiData() {
        closeWarning.click();
    }
    public String getPasswordErrorTxt() {
        return passwdErrorNotification.getText();
    }
    public void choosePrivilege(String priv) {
        Select drpPrivileges = new Select(listPrivileges);
        drpPrivileges.selectByValue(priv);
    }
    public void resetPrivilege() {
        listPrivileges.sendKeys(Keys.ARROW_UP,Keys.ENTER);
    }
    public void chooseSupervisor(String spv) {
        Select drpSupervisor = new Select(listSupervisor);
        drpSupervisor.selectByValue(spv);
    }
    public void resetSupervisor() {
        Select purgeSPV = new Select(listSupervisor);
        purgeSPV.selectByVisibleText("");
    }
    public void inputFullName (String fullname) {
        this.fullName.sendKeys(fullname);
    }
    public void inputTelephone (String telephone) {
        this.telephone.sendKeys(telephone);
    }
    public void resetTelephone() {
        telephone.clear();
    }
    public void inputUsername (String username) {
        this.username.sendKeys(username);
    }
    public void resetUsername() {
        username.clear();
    }
    public void inputPassword (String password) {
        this.password.sendKeys(password);
    }
    public void resetPassword() {
        password.clear();
    }
    public void saveAdmin() {
        saveData.click();
    }
    public String getWarningLengkapiData() {
        return dataNotCompleteTxt.getText();
    }
}
