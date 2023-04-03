package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.LoginPage;
import projectmagang.pages.RemoveActivityPage;

public class TestRemoveActivity {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static RemoveActivityPage removeActivityPage = new RemoveActivityPage();

    public TestRemoveActivity(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin masuk ke menu Remove Activity")
    public void admin_masuk_ke_menu_remove_activity(){
        removeActivityPage.goToMenuReport();
        removeActivityPage.goToRemoveActivity();
        extentTest.log(LogStatus.PASS, "Admin masuk ke menu Remove Activity");
    }

    @When("Admin menginput keyword salah kedalam Search Bar")
    public void admin_menginput_keyword_salah_kedalam_search_bar() {
        removeActivityPage.inputSearchBar("Lorem Ipsum Dolor Sit Amet");
        extentTest.log(LogStatus.PASS,"Admin input keyword kedalam Search Bar");
    }
    @When("Admin input keyword kedalam Search Bar")
    public void admin_input_keyword_kedalam_searchbar() {
        removeActivityPage.clearSearchBar();
        removeActivityPage.inputSearchBar("joko");
        extentTest.log(LogStatus.PASS,"Admin input keyword kedalam searchbar");
    }

    @And("Klik tombol search")
    public void klik_tombol_search(){
        removeActivityPage.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik tombol search");
    }

    @And("Klik tombol remove data")
    public void remove_data(){
        removeActivityPage.clickBtnRemove();
        extentTest.log(LogStatus.PASS, "Klik tombol remove data");
    }

    @And("Klik tombol iya")
    public void klik_tombol_iya(){
        removeActivityPage.clickBtnIya();
        extentTest.log(LogStatus.PASS, "Klik tombol iya");
    }

    @And("Klik tombol tidak")
    public void klik_tombol_tidak(){
        removeActivityPage.clickBtnTidak();
        extentTest.log(LogStatus.PASS, "Klik tombol tidak");
    }

    @And("Klik tombol ok")
    public void klik_tombol_ok(){
        Hooks.delay(2);
        removeActivityPage.clickBtnOk();
        extentTest.log(LogStatus.PASS, "Klik tombol ok");
    }

    @Then("Mendapat alert persetujuan data akan dihapus")
    public void alert_persetujuan_data_terhapus(){
        Hooks.delay(1);
        Assert.assertEquals(removeActivityPage.getTxtAlert(), "Yakin ingin menghapus ini ?");
        extentTest.log(LogStatus.PASS, "Mendapat alert persetujuan data akan dihapus");
    }

    @Then("Mendapat pesan berhasil dihapus")
    public void berhasil_dihapus(){
        Hooks.delay(1);
        Assert.assertEquals(removeActivityPage.getTxtBerhasilTerhapus(),"Data berhasil dihapus!");
        extentTest.log(LogStatus.PASS, "Mendapat pesan berhasil dihapus");
    }
    @Then("Menampilkan nama yang dicari")
    public void tampilkan_nama(){
        Hooks.delay(1);
        Assert.assertEquals(removeActivityPage.getTxtJoko(),"Joko Akbar Prasetyo");
        extentTest.log(LogStatus.PASS, "Menampilkan nama yang dicari");
    }
    @Then("Menampilkan data kosong")
    public void tampilkan_data_kosong(){
        Hooks.delay(1);
        Assert.assertEquals(removeActivityPage.getTxtJoko(),"no entries");
        extentTest.log(LogStatus.PASS, "Menampilkan data kosong");
    }
}
