package projectmagang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectmagang.drivers.DriverSingleton;


public class FormPrivilegePOPage {
    private WebDriver driver;
    public FormPrivilegePOPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


//    @FindBy(xpath = "//div[@role='tablist']")
//    List <WebElement> listMenu;
    @FindBy(xpath = "//h3[normalize-space()='User Management']//span")
    WebElement menuUserManagement;
    @FindBy(xpath = "//button[@id='53529_query']")
    WebElement btnAdmin;
    @FindBy(xpath = "//span[normalize-space()='Modul']")
    WebElement btnModul;
    @FindBy(xpath = "//span[normalize-space()='Data Users']")
    WebElement btnDataUsers;
    @FindBy(xpath = "//span[normalize-space()='Data QC']")
    WebElement btnDataQC;
    @FindBy(xpath = "//span[normalize-space()='Report']")
    WebElement btnReport;
    @FindBy(xpath = "//span[normalize-space()='Remove Activity']")
    WebElement btnRemoveActivity;

    @FindBy(xpath = "//input[contains(@value,'USER MANAGEMENT')]")
    WebElement txtAdmin;

    public void clickMenuUserManagement() {
        menuUserManagement.click();
    }

    public void clickBtnAdmin() {
        btnAdmin.click();
    }

    public void clickBtnModul() {
        btnModul.click();
    }
    public void clickBtnDataUsers() {
        btnDataUsers.click();
    }
    public void clickBtnDataQC() {
        btnDataQC.click();
    }

    public void clickBtnReport() {
        btnReport.click();
    }
    public void clickBtnRemoveActivity() {
        btnRemoveActivity.click();
    }

    public String getMenuAdminTxt() {
        return txtAdmin.getAttribute("value");
    }
}
