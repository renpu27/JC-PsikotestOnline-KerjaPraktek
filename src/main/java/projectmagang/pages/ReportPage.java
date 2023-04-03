package projectmagang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectmagang.drivers.DriverSingleton;

public class ReportPage {
    private WebDriver driver;
    public ReportPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[normalize-space()='Report']//span")
    WebElement menuReport;
    @FindBy(xpath = "//span[normalize-space()='Report']")
    WebElement btnReport;
    @FindBy(xpath = "//input[@id='tl_report_setuju--53665_text']")
    WebElement tglAwal;
    @FindBy(xpath = "//input[@id='tl_report_setuju--53672_text']")
    WebElement tglAkhir;
    @FindBy(xpath = "//span[normalize-space()='View']")
    WebElement btnView;
    @FindBy(xpath = "//span[normalize-space()='Export']")
    WebElement btnExport;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[6]/table/tbody/tr/td[5]")
    WebElement txtBilly;
    @FindBy(xpath = "//*[@id=\"tl_report_setuju--53669\"]/div[8]")
    WebElement txtDataExport;

    public void goToMenuReport(){
        menuReport.click();
    }
    public void goToReport(){
        btnReport.click();
    }
    public void clickBtnView(){ btnView.click(); }
    public String getTxtBilly(){ return txtBilly.getText(); }
    public String getTxtDataExport(){ return txtDataExport.getText(); }

    public void inputTglAwal(String tglAwal) {
        this.tglAwal.sendKeys(tglAwal);
    }
    public void inputTglAkhir(String tglAkhir) {
        this.tglAkhir.sendKeys(tglAkhir);
    }
    public void clickBtnExport(){ btnExport.click(); }
}
