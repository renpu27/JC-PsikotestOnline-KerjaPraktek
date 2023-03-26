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
        extentTest.log(LogStatus.PASS,"Admin klik menu User Management");
    }

    @When("Admin klik menu Task")
    public void admin_klik_menu_task() {
        Hooks.delay(1);
        fpp.clickMenuTask();
        extentTest.log(LogStatus.PASS,"Admin klik menu Task");
    }

    @When("Admin klik tombol Data Users")
    public void admin_klik_tombol_data_users() {
        Hooks.delay(1);
        fpp.clickBtnDataUsers();
        extentTest.log(LogStatus.PASS,"Admin klik tombol Data Users");
    }

    @When("Admin klik tombol Data QC")
    public void admin_klik_tombol_data_qc() {
        Hooks.delay(1);
        fpp.clickBtnDataQC();
        extentTest.log(LogStatus.PASS,"Admin klik tombol data QC");
    }

    @When("Admin klik menu Report")
    public void admin_klik_menu_report() {
        Hooks.delay(1);
        fpp.clickMenuReport();
        extentTest.log(LogStatus.PASS,"Admin klik Menu Report");
    }

    @When("Admin klik tombol Remove Activity")
    public void admin_klik_tombol_remove_activity() {
        Hooks.delay(1);
        fpp.clickBtnRemoveActivity();
        extentTest.log(LogStatus.PASS,"Admin klik tombol Remove Activity");
    }

    @And("Admin klik tombol Admin")
    public void admin_klik_tombol_admin() {
        fpp.clickBtnAdmin();
        extentTest.log(LogStatus.PASS,"Admin klik tombol Admin");
    }

    @And("Admin klik tombol Modul")
    public void admin_klik_tombol_modul() {
        Hooks.delay(1);
        fpp.clickBtnModul();
        extentTest.log(LogStatus.PASS,"Admin klik tombol Modul");
    }

    @And("Admin klik tombol Report")
    public void admin_klik_tombol_report() {
        Hooks.delay(1);
        fpp.clickBtnReport();
        extentTest.log(LogStatus.PASS,"Admin klik tombol Report");
    }

    @Then("Muncul tampilan menu Admin")
    public void muncul_tampilan_menu_admin() {
        Assert.assertEquals(fpp.getMenuAdminTxt(),"ADMIN");
        extentTest.log(LogStatus.PASS,"Muncul tampilan menu Admin");
    }

    @Then("Muncul tampilan menu Modul")
    public void muncul_tampilan_menu_modul() {
        Assert.assertEquals(fpp.getMenuModulTxt(),"Modul Psikotest");
        extentTest.log(LogStatus.PASS,"Muncul tampilan menu Modul");
    }

    @Then("Muncul tampilan menu Data Users")
    public void muncul_tampilan_menu_data_users() {
        Assert.assertEquals(fpp.getMenuDataUsersTxt(),"DATA USERS");
        extentTest.log(LogStatus.PASS,"Muncul tampilan menu Data Users");
    }

    @Then("Muncul tampilan menu Data QC")
    public void muncul_tampilan_menu_data_qc() {
        Assert.assertEquals(fpp.getMenuDataQCTxt(),"DATA QC");
        extentTest.log(LogStatus.PASS,"Muncul tampilan menu Data QC");
    }

    @Then("Muncul tampilan menu Report")
    public void muncul_tampilan_menu_report() {
        Assert.assertEquals(fpp.getMenuReportTxt(),"REPORT PSIKOTEST");
        extentTest.log(LogStatus.PASS,"Muncul tampilan menu Report");
    }

    @Then("Muncul tampilan menu Remove Activity")
    public void muncul_tampilan_menu_remove_activity() {
        Assert.assertEquals(fpp.getMenuRemoveActivityTxt(),"REMOVE ACTIVITY");
        extentTest.log(LogStatus.PASS,"Muncul tampilan menu Remove Activity");
    }
}
