package projectmagang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectmagang.drivers.DriverSingleton;


public class MenuAdminPage {
    private WebDriver driver;
    public MenuAdminPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//h3[normalize-space()='User Management']//span")
    WebElement menuUserManagement;
    @FindBy(xpath = "//button[@id='53529_query']")
    WebElement btnAdmin;
    @FindBy(xpath = "//input[@id='tl_user_management--53685_text']")
    WebElement searchBar;


    public void clickMenuUserManagement() {
        menuUserManagement.click();
    }
    public void clickBtnAdmin() {
        btnAdmin.click();
    }
    public void sendKeyword(String searchBar) {
        this.searchBar.sendKeys(searchBar);
    }
    public String getKeyword() {
        return searchBar.getAttribute("value");
    }
    public void clearSearchBar() {
        searchBar.clear();
    }
}
