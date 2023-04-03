package projectmagang.pages;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectmagang.drivers.DriverSingleton;

public class ViewUserPage {
    private WebDriver driver;
    public ViewUserPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[6]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/img[1]")
    WebElement btnViewUser;

    @FindBy(xpath = "/html/body/div[9]/div[1]/span")
    WebElement txtViewUser;

    @FindBy(xpath = "/html/body/div[9]/div[1]/div/button/span[1]")
    WebElement btnCloseViewUser;

    public void clickCloseViewUser(){btnCloseViewUser.click();}
    public String getTxtViewUser(){return txtViewUser.getText();}
    public void clickBtnViewUser(){btnViewUser.click();}
}
