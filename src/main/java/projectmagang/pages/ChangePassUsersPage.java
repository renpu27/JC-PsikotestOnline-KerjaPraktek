package projectmagang.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectmagang.drivers.DriverSingleton;

public class ChangePassUsersPage {
    private WebDriver driver;
    public ChangePassUsersPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[6]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/img[1]")
    WebElement btnEdit;
    @FindBy(xpath = "//*[@id='tl_editpss_user--53424_text']")
    WebElement passNew;
    @FindBy(xpath = "//*[@id='53416_query']/span")
    WebElement btnSave;
    @FindBy(xpath = "//p[normalize-space()='Data Berhasil Di Update']")
    WebElement txtSuccess;
    @FindBy(xpath = "//span[normalize-space()='OK']")
    WebElement btnOk;
    @FindBy(xpath = "//*[@id='nikita-form-dialog']/p/text()")
    WebElement txtPeringatan;
    @FindBy(xpath = "//*[@id='nikita-form-dialog']/p/text()")
    WebElement txtPemberitahuan;

    public String getTxtSuccess(){ return txtSuccess.getText(); }
    public String getTxtPeringatan(){ return txtPeringatan.getText(); }
    public String getTxtPemberitahuan(){ return txtPemberitahuan.getText(); }

    public void clickBtnEditPass(){ btnEdit.click(); }
    public void clickBtnSavePass(){ btnSave.click(); }
    public void clickBtnOk(){ btnOk.click(); }
    public void inputPassNew (String passNew){
        this.passNew.sendKeys(passNew);
    }
}
