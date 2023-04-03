package projectmagang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectmagang.drivers.DriverSingleton;

public class RemoveActivityPage {
    private WebDriver driver;
    public RemoveActivityPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[normalize-space()='Report']//span")
    WebElement menuReport;
    @FindBy(xpath = "//span[normalize-space()='Remove Activity']")
    WebElement btnRemoveActivity;
    @FindBy(xpath = "//input[@id='tl_remove_activity--53591_text']")
    WebElement searchBar;
    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement btnSearch;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[6]/table/tbody/tr[1]/td[11]/div/table/tbody/tr[1]/td/div/img")
    WebElement btnRemove;
    @FindBy(xpath = "//*[@id='nikita-form-dialog']/p/text()")
    WebElement txtAlert;
    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button[1]/span")
    WebElement btnIya;
    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button[2]/span")
    WebElement btnTidak;
    @FindBy(xpath = "//*[@id='nikita-form-dialog']/p/text()")
    WebElement txtBerhasilTerhapus;
    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button/span")
    WebElement btnOk;
    @FindBy(xpath = "//td[@id='tl_remove_activity--53585-cell-0-2']")
    WebElement txtJoko;
    @FindBy(xpath = "//div[@id='tele_menu--53518']//div[8]")
    WebElement txtNoEntries;
    @FindBy(xpath = "//*[@id='nikita-form-dialog']/p/text()")
    WebElement txtPeringatan;
    @FindBy(xpath = "//*[@id='nikita-form-dialog']/p/text()")
    WebElement txtPemberitahuan;


    public void goToMenuReport(){
        menuReport.click();
    }
    public void goToRemoveActivity(){
        btnRemoveActivity.click();
    }
    public String getTxtAlert(){ return txtAlert.getText(); }
    public String getTxtBerhasilTerhapus(){ return txtBerhasilTerhapus.getText(); }
    public String getTxtJoko(){ return txtJoko.getText(); }
    public String getTxtNoEntries(){ return txtNoEntries.getText(); }
    public String getTxtPeringatan(){ return txtPeringatan.getText(); }
    public String getTxtPemberitahuan(){ return txtPemberitahuan.getText(); }
    public void clickBtnSearch(){ btnSearch.click(); }
    public void clickBtnRemove(){ btnRemove.click(); }
    public void clickBtnIya(){ btnIya.click(); }
    public void clickBtnTidak(){ btnTidak.click(); }
    public void clickBtnOk(){ btnOk.click(); }
    public void clearSearchBar() { searchBar.clear(); }
    public void inputSearchBar(String searchBar){
        this.searchBar.sendKeys(searchBar);
    }
}
