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

public class TestDataUsers {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static DataUsersPage dataUsers= new DataUsersPage();

    public TestDataUsers(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Hapus search bar")
    public void hapus_search_bar(){
        dataUsers.eraseSearch();
        extentTest.log(LogStatus.PASS,"Hapus search bar");
    }

    @When("Klik menu Data Users")
    public void klik_menu_data_users(){
        dataUsers.clickMenuDataUsers();
        extentTest.log(LogStatus.PASS, "Klik menu Data Users");
    }


    @When("Pilih opsi Non Active")
    public void opsi_non_active(){
        dataUsers.chooseStatusUser("NON ACTIVE");
        extentTest.log(LogStatus.PASS, "Pilih opsi Non Active");
    }

    @And("Klik tombol search")
    public void klik_tombol_search(){
        dataUsers.clickBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik tombol search");
    }

    @And("Ketik nama user Non Active terdaftar")
    public void ketik_nama_nonactive_terdaftar(){
        dataUsers.enterSearch("Risma Edtyana");
        extentTest.log(LogStatus.PASS, "Ketik nama user Non Active terdaftar");
    }

    @And("Ketik nama user Active terdaftar")
    public void ketik_nama_active_terdaftar(){
        dataUsers.enterSearch("Jack Separoo");
        extentTest.log(LogStatus.PASS, "Ketik nama user Active terdaftar");
    }

    @And("Ketik nama user Non Active salah")
    public void ketik_nama_nonactive_salah(){
        dataUsers.enterSearch("Rismi Idtyini");
        extentTest.log(LogStatus.PASS, "Ketik nama user Non Active salah");
    }

    @And("Ketik nama user Active salah")
    public void ketik_nama_active_salah(){
        dataUsers.enterSearch("Isip Knilpit");
        extentTest.log(LogStatus.PASS, "Ketik nama user Active salah");
    }

    @And("Pilih opsi Active")
    public void pilih_opsi_active(){
        dataUsers.chooseStatusUser("ACTIVE");
        extentTest.log(LogStatus.PASS, "Pilih opsi Active");
    }

    @And("Klik tombol export")
    public void klik_tombol_export(){
        dataUsers.clickBtnExport();
        extentTest.log(LogStatus.PASS, "Klik tombol export");
    }

    @Then("Menampilkan semua user Active")
    public void semua_user_active(){
        Hooks.delay(1);
        Assert.assertEquals(dataUsers.getTxtActive(),"Billy Goestomo");
        extentTest.log(LogStatus.PASS, "Menampilkan semua user Active");
    }

    @Then("Menampilkan semua user Non Active")
    public void user_non_active(){
        Hooks.delay(1);
        Assert.assertEquals(dataUsers.getTxtNonActive(),"Asep Knalpot");
        extentTest.log(LogStatus.PASS, "Menampilkan semua user Non Active");
    }

    @Then("Menampilkan user Non Active yang dicari")
    public void semua_user_non_active(){
        Hooks.delay(1);
        Assert.assertEquals(dataUsers.getTxtNamaUserNonActive(),"Risma Edtyana");
        extentTest.log(LogStatus.PASS, "Menampilkan user Non Active yang dicari");
    }

    @Then("Menampilkan user Active yang dicari")
    public void user_active(){
        Hooks.delay(1);
        Assert.assertEquals(dataUsers.getTxtNamaUserActive(),"Jack Separoo");
        extentTest.log(LogStatus.PASS, "Menampilkan user Active yang dicari");
    }

    @Then("Tidak menampilkan nama siapapun")
    public void tidak_menampilkan_siapapun(){
        Hooks.delay(1);
        Assert.assertEquals(dataUsers.getTxtNoEntry()," no entries");
        extentTest.log(LogStatus.PASS, "Tidak menampilkan nama siapapun");
    }

    @Then("Masuk ke halaman Data Users")
    public void masuk_halaman_data_users(){
        Hooks.delay(1);
        Assert.assertEquals(dataUsers.getTxtDataUsers(),"");
        extentTest.log(LogStatus.PASS, "Masuk ke halaman Data Users");
    }

}

//    @And("")
//    public void (){
//
//        extentTest.log(LogStatus.PASS, "");
//    }
