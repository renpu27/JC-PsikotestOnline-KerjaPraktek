package projectmagang.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectmagang.drivers.DriverSingleton;

public class DataUsersPage {
    private WebDriver driver;
    public DataUsersPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[normalize-space()='Task']//span")
    WebElement menuTask;
    @FindBy(xpath = "//span[normalize-space()='Data Users']")
    WebElement btnDataUsers;
    @FindBy(xpath = "//input[@id='tl_data_users--53569_text']")
    WebElement searchBar;
    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement btnSearch;
    @FindBy(xpath = "//select[@id='tl_data_users--53578_text']")
    WebElement kategori;
    @FindBy(xpath = "//span[normalize-space()='Export']")
    WebElement btnExport;
    @FindBy(xpath = "//td[@id='tl_remove_activity--53585-cell-0-2']")
    WebElement txtJoko;

    public void goToMenuTask(){
        menuTask.click();
    }
    public void goToDataUsers(){
        btnDataUsers.click();
    }
    public String getTxtJoko(){ return txtJoko.getText(); }

    public void clearSearchBar() { searchBar.clear(); }
    public void clickBtnSearch(){ btnSearch.click(); }
    public void clickExportData(){ btnExport.click(); }
    public void inputSearchBar(String searchBar){
        this.searchBar.sendKeys(searchBar);
    }
    public void chooseKategori(String kategori){
        this.kategori.sendKeys(kategori);
    }
}
