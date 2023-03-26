package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.FormPrivilegePOPage;

public class TestFormPrivilegePO {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static FormPrivilegePOPage fpp = new FormPrivilegePOPage();
    public TestFormPrivilegePO(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Admin klik menu User Management")
    public void admin_klik_menu_user_management() {
        fpp.clickMenuUserManagement();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS,"Klik menu User Management");
    }

    @And("Admin klik tombol Admin")
    public void admin_klik_tombol_admin() {
        fpp.clickBtnAdmin();
        extentTest.log(LogStatus.PASS,"Klik tombol Admin");
    }

    @Then("Muncul tampilan menu Admin")
    public void muncul_tampilan_menu_admin() {
        Assert.assertEquals(fpp.getMenuAdminTxt(),"ADMIN");
        extentTest.log(LogStatus.PASS,"Muncul tampilan menu Admin");
    }
}
