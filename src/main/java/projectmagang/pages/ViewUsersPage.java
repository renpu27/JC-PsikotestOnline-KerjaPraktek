package projectmagang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectmagang.drivers.DriverSingleton;

public class ViewUsersPage {
    private WebDriver driver;
    public ViewUsersPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[6]/table/tbody/tr[1]/td[7]/div/table/tbody/tr[1]/td[1]/div/img")
    WebElement btnView;
    @FindBy(xpath = "//*[@id='tl_viewedit_user--53434_text']")
    WebElement txtView;
    @FindBy(xpath = "/html/body/div[9]/div[1]/div/button/span[1]")
    WebElement btnClose;

    public String getTxtView(){ return txtView.getText(); }
    public void clickBtnView(){ btnView.click(); }
    public void clickBtnClose(){ btnClose.click(); }
}
