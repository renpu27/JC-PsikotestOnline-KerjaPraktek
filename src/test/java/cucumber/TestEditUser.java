package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.DataUsersPage;
import projectmagang.pages.EditUsersPage;
import projectmagang.pages.RemoveActivityPage;

public class TestEditUser {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static RemoveActivityPage removeActivityPage = new RemoveActivityPage();
    public static DataUsersPage dataUsersPage = new DataUsersPage();
    public static EditUsersPage editUsersPage = new EditUsersPage();

    public TestEditUser(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @Given("Klik tombol ok")
    public void klik_tombol_ok(){
        Hooks.delay(2);
        removeActivityPage.clickBtnOk();
        extentTest.log(LogStatus.PASS, "Klik tombol ok");
    }

    @When("Klik tombol edit")
    public void klik_tombol_edit() {
        editUsersPage.clickBtnEditUsers();
        extentTest.log(LogStatus.PASS,"Klik tombol edit");
    }

    @And("Pilih kategori active di menu edit users")
    public void admin_pilih_kategori_active() {
        editUsersPage.clickBtnOk();
        editUsersPage.chooseKategoriUser("ACTIVE");
        extentTest.log(LogStatus.PASS,"Pilih kategori active di menu edit users");
    }

    @And("Pilih kategori non active di menu edit users")
    public void admin_pilih_kategori_non_active() {
        editUsersPage.clickBtnOk();
        editUsersPage.chooseKategoriUser("NON ACTIVE");
        extentTest.log(LogStatus.PASS,"Pilih kategori non active di menu edit users");
    }

    @And("Pilih kategori pilih di menu edit users")
    public void admin_pilih_kategori_pilih() {
        editUsersPage.clickBtnOk();
        editUsersPage.chooseKategoriUser("(pilih)");
        extentTest.log(LogStatus.PASS,"Pilih kategori pilih di menu edit users");
    }

    @And("Pilih status user staff di menu edit users")
    public void admin_pilih_status_user_staff() {
        Hooks.delay(2);
        editUsersPage.clickBtnOk();
        editUsersPage.chooseStatusUser("Staff");
        extentTest.log(LogStatus.PASS,"Pilih status user staff di menu edit users");
    }

    @And("Pilih status user leader di menu edit users")
    public void admin_pilih_status_user_leader() {
        Hooks.delay(2);
        editUsersPage.clickBtnOk();
        editUsersPage.chooseStatusUser("Leader");
        extentTest.log(LogStatus.PASS,"Pilih status user leader di menu edit users");
    }

    @And("Pilih kategori data active")
    public void pilih_kategori_data_active(){
        dataUsersPage.chooseKategori("ACTIVE");
        extentTest.log(LogStatus.PASS, "Pilih kategori data active");
    }

    @And("Klik tombol save")
    public void klik_tombol_save() {
        editUsersPage.clickBtnSaveUsers();
        extentTest.log(LogStatus.PASS,"Klik tombol save");
    }

    @Then("Mendapat pesan berhasil disimpan")
    public void berhasil_disimpan(){
        Hooks.delay(1);
        Assert.assertEquals(editUsersPage.getTxtSuccess(),"Data Berhasil Di Update");
        extentTest.log(LogStatus.PASS, "Mendapat pesan berhasil disimpan");
    }
}
