package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.ReportPage;

public class TestReport {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ReportPage reportPage = new ReportPage();

    public TestReport(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin masuk ke menu Report Page")
    public void admin_masuk_ke_menu_remove_activity(){
        reportPage.goToMenuReport();
        reportPage.goToReport();
        extentTest.log(LogStatus.PASS, "Admin masuk ke menu Report Page");
    }
    @When("Admin input tanggal awal")
    public void input_tanggal_awal(){
        reportPage.inputTglAwal("01/01/2023");
        extentTest.log(LogStatus.PASS, "Admin input tanggal awal");
    }
    @And("Admin input tanggal awal masa depan 1")
    public void input_tanggal_awal_masa_depan_1(){
        reportPage.inputTglAwal("18/05/2023");
        extentTest.log(LogStatus.PASS, "Admin input tanggal awal masa depan 1");
    }
    @And("Admin input tanggal awal masa depan 2")
    public void input_tanggal_awal_masa_depan_2(){
        reportPage.inputTglAwal("18/10/2023");
        extentTest.log(LogStatus.PASS, "Admin input tanggal awal masa depan 2");
    }
    @And("Admin input tanggal akhir")
    public void input_tanggal_akhir(){
        reportPage.inputTglAkhir("02/04/2023");
        extentTest.log(LogStatus.PASS, "Admin input tanggal akhir");
    }
    @And("Klik tombol view")
    public void klik_tombol_view(){
        reportPage.clickBtnView();
        extentTest.log(LogStatus.PASS, "Klik tombol view");
    }
    @And("Klik tombol export")
    public void klik_tombol_export(){
        reportPage.clickBtnExport();
        extentTest.log(LogStatus.PASS, "Klik tombol export");
    }
    @Then("Menampilkan data sesuai tanggal")
    public void tampilkan_data(){
        Assert.assertEquals(reportPage.getTxtBilly(),"Billy Goestomo");
        extentTest.log(LogStatus.PASS, "Menampilkan data sesuai tanggal");
    }
    @Then("Menampilkan data kosong")
    public void tampilkan_data_kosong(){
        Assert.assertEquals(reportPage.getTxtBilly()," no entries");
        extentTest.log(LogStatus.PASS, "Menampilkan data kosong");
    }
    @Then("Menampilkan data yang di export")
    public void tampilkan_data_yang_di_export(){
        Assert.assertEquals(reportPage.getTxtDataExport(),"Showing 1 to 1 of 1 entries");
        extentTest.log(LogStatus.PASS, "Menampilkan data yang di export");
    }
}
