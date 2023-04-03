package projectmagang.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectmagang.drivers.DriverSingleton;
import java.io.IOException;

public class DataUsersPage {
    private WebDriver driver;
    public DataUsersPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Data Users']")
    WebElement menuDataUsers;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[1]/div[1]/table/tbody/tr/td/div/input")
    WebElement txtDataUsers; //DATA USERS

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[6]/table/tbody/tr/td[3]")
    WebElement txtNamaUserNonActive; //Risma Edtyana

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[6]/table/tbody/tr[1]/td[3]")
    WebElement txtNonActive; //tes

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[6]/table/tbody/tr[2]/td[3]")
    WebElement txtActive; //Asep Knalpot

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[6]/table/tbody/tr/td[3]")
    WebElement txtNamaUserActive; //Jack Separoo

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[8]")
    WebElement txtNoEntries; //no entries

    @FindBy(xpath = "//input[@id='tl_data_users--53569_text']")
    WebElement search;

    @FindBy(xpath = "//select[@id='tl_data_users--53578_text']")
    WebElement statusUser;

    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement btnSearch;

    @FindBy(xpath = "//span[normalize-space()='Export']")
    WebElement btnExport;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[6]/table/tbody/tr[1]/td[7]/div/table/tbody/tr[1]/td[1]/div/img")
    WebElement btnViewUser;

    public void clickMenuDataUsers(){menuDataUsers.click();}
    public String getTxtDataUsers(){return txtDataUsers.getText();}
    public String getTxtNamaUserNonActive(){return txtNamaUserNonActive.getText();}
    public String getTxtNonActive(){return txtNonActive.getText();}
    public String getTxtNoEntry(){return txtNoEntries.getText();}
    public String getTxtNamaUserActive(){return  txtNamaUserActive.getText();}
    public String getTxtActive(){return txtActive.getText();}
    public void eraseSearch(){search.sendKeys(Keys.CONTROL,"a",Keys.DELETE);}
    public void enterSearch(String search){this.search.sendKeys(search);}
    public void chooseStatusUser(String statususer){statusUser.sendKeys(statususer);}
    public void clickBtnSearch(){btnSearch.click();}
    public void clickBtnExport(){btnExport.click();}
    public void clickBtnViewUser(){btnViewUser.click();}

}
