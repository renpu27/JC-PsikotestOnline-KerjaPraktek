package projectmagang.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectmagang.drivers.DriverSingleton;

public class EditModulPage {
    private WebDriver driver;
    public EditModulPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='ui-button-icon-primary ui-icon ui-icon-close']")
    WebElement btnClose;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[6]/table/tbody/tr[1]/td[10]/div/table/tbody/tr[1]/td[3]/div/img")
    WebElement btnEdit;

    @FindBy(xpath = "//*[@id=\"tl_edit_modul--53471_text\"]")
    WebElement namaModul;

    @FindBy(xpath = "//*[@id=\"tl_edit_modul--53495_text\"]")
    WebElement tipeModul;

    @FindBy(xpath = "//input[@id='tl_edit_modul--53472_text']")
    WebElement waktuPengerjaan;

    @FindBy(xpath = "//input[@id='tl_edit_modul--53473_text']")
    WebElement jumlahSoal;

    @FindBy(xpath = "//select[@id='tl_edit_modul--53474_text']")
    WebElement kategoriModul;

    @FindBy(xpath = "//textarea[@id='tl_edit_modul--53496_text']")
    WebElement deskripsiSingkat;

    @FindBy(xpath = "//select[@id='tl_edit_modul--53475_text']")
    WebElement statusModul;

    @FindBy(xpath = "//span[normalize-space()='UPDATE']")
    WebElement btnUpdateModul;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button")
    WebElement btnOK;

    @FindBy(xpath = "//*[@id=\"nikita-form-dialog\"]/p")
    WebElement txtDitambahkan; //Modul Berhasil Ditambahkan

    public void clickBtnClose(){btnClose.click();}
    public void clickBtnEditModul(){btnEdit.click();}
    public void clickBtnUpdateModul(){btnUpdateModul.click();}
    public void clickBtnOK(){btnOK.click();}
    public void eraseNamaModul(){namaModul.sendKeys(Keys.CONTROL,"a",Keys.DELETE);}
    public void enterNamaModul(String namamodul){this.namaModul.sendKeys(namamodul);}
    public void eraseWaktuPengerjaan(){waktuPengerjaan.sendKeys(Keys.CONTROL,"a",Keys.DELETE);}
    public void enterWaktuPengerjaan(String waktupengerjaan){this.waktuPengerjaan.sendKeys(waktupengerjaan);}
    public void eraseJumlahSoal(){jumlahSoal.sendKeys(Keys.CONTROL,"a",Keys.DELETE);}
    public void enterJumlahSoal(String jumlahsoal){this.jumlahSoal.sendKeys(jumlahsoal);}
    public void eraseDeskripsiSingkat(){deskripsiSingkat.sendKeys(Keys.CONTROL,"a",Keys.DELETE);}
    public void enterDeskripsiSingkat(String deskripsisingkat){this.deskripsiSingkat.sendKeys(deskripsisingkat);}
    public void chooseTipeModul(String tipemodul){this.tipeModul.sendKeys(tipemodul);}
    public void chooseKategoriModul(String kategorimodul){this.kategoriModul.sendKeys(kategorimodul);}
    public void chooseStatusModul(String statusmodul){this.statusModul.sendKeys(statusmodul);}
    public String getTxtDitambahkan(){return txtDitambahkan.getText();}
}
