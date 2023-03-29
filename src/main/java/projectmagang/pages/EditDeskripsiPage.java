package projectmagang.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectmagang.drivers.DriverSingleton;

public class EditDeskripsiPage {
    private WebDriver driver;
    public EditDeskripsiPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"ui-id-9\"]")
    WebElement menuTask;

    @FindBy(xpath = "//*[@id=\"53547_query\"]/span")
    WebElement menuModul;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[6]/table/tbody/tr[1]/td[10]/div/table/tbody/tr[1]/td[2]/div/img")
    WebElement btnDescriptions;

    @FindBy(xpath = "//*[@id=\"tl_edit_desk--53635_text\"]")
    WebElement deskripsiSoal;

    @FindBy(xpath = "//*[@id=\"tl_edit_desk--53634_text\"]")
    WebElement ketentuanSoal;

    @FindBy(xpath = "/html/body/div[9]/div[2]/div/div[5]/div[3]/table/tbody/tr[1]/td[8]/div/table/tbody/tr[1]/td[1]/div/img")
    WebElement btnEditDeskripsi;

    @FindBy(xpath = "//*[@id=\"53628_query\"]/span")
    WebElement btnUpdate;

    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button")
    WebElement btnOK;

    @FindBy(xpath = "//p[normalize-space()='Deskripsi Berhasil Di Update']")
    WebElement txtBerhasil; //Deskripsi Berhasil Di Update

    public void clickMenuTask(){menuTask.click();}
    public void clickMenuModul(){menuModul.click();}
    public void clickBtnUpdate(){btnUpdate.click();}
    public void clickBtnOK(){btnOK.click();}
    public String getTxtBerhasil(){return txtBerhasil.getText();}
    public void clickBtnDescriptions(){btnDescriptions.click();}
    public void clickBtnEditDeskripsi(){btnEditDeskripsi.click();}
    public void eraseDeskripsiSoal(){deskripsiSoal.sendKeys(Keys.CONTROL,"a",Keys.DELETE);}
    public void eraseKetentuanSoal(){ketentuanSoal.sendKeys(Keys.CONTROL,"a",Keys.DELETE);}
    public void enterDeskripsiSoal(String deskripsisoal){this.deskripsiSoal.sendKeys(deskripsisoal);}
    public void enterKetentuanSoal(String ketentuansoal){this.ketentuanSoal.sendKeys(ketentuansoal);}

}
