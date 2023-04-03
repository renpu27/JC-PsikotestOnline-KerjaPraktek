package projectmagang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectmagang.drivers.DriverSingleton;

public class EditUsersPage {
    private WebDriver driver;
    public EditUsersPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[6]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/img[1]")
    WebElement btnEdit;
    @FindBy(xpath = "//*[@id='tl_view_user--53513_text']")
    WebElement statusUser;
    @FindBy(xpath = "//*[@id='ddcl-tl_view_user--53514_select']")
    WebElement kategoriUser;
    @FindBy(xpath = "//*[@id='53506_query']/span")
    WebElement btnSave;
    @FindBy(xpath = "//p[normalize-space()='Data Berhasil Di Update']")
    WebElement txtSuccess;
    @FindBy(xpath = "//span[normalize-space()='OK']")
    WebElement btnOk;

    public String getTxtSuccess(){ return txtSuccess.getText(); }


    public void clickBtnEditUsers(){ btnEdit.click(); }
    public void clickBtnSaveUsers(){ btnSave.click(); }
    public void clickBtnOk(){ btnOk.click(); }
    public void chooseKategoriUser(String kategoriUser){
        this.kategoriUser.sendKeys(kategoriUser);
    }
    public void chooseStatusUser(String statusUser){
        this.statusUser.sendKeys(statusUser);
    }
}
