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
import projectmagang.pages.LoginPage;
import projectmagang.pages.RemoveActivityPage;

public class TestDataUsers {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static LoginPage loginPage = new LoginPage();
    public static RemoveActivityPage removeActivityPage = new RemoveActivityPage();
    public static DataUsersPage dataUsersPage = new DataUsersPage();

    public TestDataUsers(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("Admin masuk ke menu Data Users")
    public void admin_masuk_ke_menu_data_users(){
        loginPage.clickBtnOK();
        dataUsersPage.goToMenuTask();
        dataUsersPage.goToDataUsers();
        extentTest.log(LogStatus.PASS, "Admin masuk ke menu Data Users");
    }
    @When("Admin menginput keyword salah kedalam Search Bar")
    public void admin_menginput_keyword_salah_kedalam_search_bar_di_page_data_users() {
        removeActivityPage.inputSearchBar("Lorem Ipsum Dolor Sit Amet");
        extentTest.log(LogStatus.PASS,"Admin input keyword kedalam Search Bar");
    }
    @When("Admin input keyword kedalam Search Bar")
    public void admin_input_keyword_kedalam_searchbar_di_page_data_users() {
        removeActivityPage.clearSearchBar();
        removeActivityPage.inputSearchBar("joko");
        extentTest.log(LogStatus.PASS,"Admin input keyword kedalam Search Bar");
    }
    @And("Klik tombol search")
    public void klik_tombol_search_di_page_data_users(){
        removeActivityPage.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik tombol search");
    }
    @And("Klik tombol export")
    public void klik_tombol_export(){
        dataUsersPage.clickExportData();
        extentTest.log(LogStatus.PASS, "Klik tombol export");
    }
    @And("Pilih kategori data active")
    public void pilih_kategori_data_active(){
        dataUsersPage.chooseKategori("ACTIVE");
        extentTest.log(LogStatus.PASS, "Pilih kategori data active");
    }
    @And("Pilih kategori data non active")
    public void pilih_kategori_data_non_active(){
        dataUsersPage.chooseKategori("NON ACTIVE");
        extentTest.log(LogStatus.PASS, "Pilih kategori data non active");
    }
    @Then("Menampilkan nama yang dicari di kategori active")
    public void tampilkan_nama_di_kategori_active(){
        Hooks.delay(1);
        Assert.assertEquals(removeActivityPage.getTxtJoko(),"Joko Akbar Prasetyo");
        extentTest.log(LogStatus.PASS, "Menampilkan nama yang dicari");
    }
    @Then("Menampilkan nama yang dicari di kategori non active")
    public void tampilkan_nama_di_kategori_non_active(){
        Hooks.delay(1);
        Assert.assertEquals(removeActivityPage.getTxtJoko(),"JOKO SETIONO");
        extentTest.log(LogStatus.PASS, "Menampilkan nama yang dicari");
    }
    @Then("Menampilkan data kosong")
    public void tampilkan_data_kosong_di_page_data_users(){
        Hooks.delay(1);
        Assert.assertEquals(removeActivityPage.getTxtJoko(),"no entries");
        extentTest.log(LogStatus.PASS, "Menampilkan data kosong");
    }
}
