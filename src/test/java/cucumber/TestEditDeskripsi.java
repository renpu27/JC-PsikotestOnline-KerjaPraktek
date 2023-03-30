package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.EditDeskripsiPage;
import projectmagang.pages.LoginPage;

public class TestEditDeskripsi {

    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static EditDeskripsiPage editDeskripsi = new EditDeskripsiPage();
    public static LoginPage loginPage = new LoginPage();

    public TestEditDeskripsi() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin masuk menu modul")
    public void masuk_menu_modul() {
        loginPage.clickBtnOK(); //edit later
        Hooks.delay(3);
        editDeskripsi.clickMenuTask();
        editDeskripsi.clickMenuModul();
        extentTest.log(LogStatus.PASS, "Admin masuk menu modul");
    }

    @Given("Klik tombol ok")
    public void klik_tombol_ok() {
        Hooks.delay(3);
        editDeskripsi.clickBtnOK();
        extentTest.log(LogStatus.PASS, "Klik tombol ok");
    }

    @When("Klik tombol Descriptions")
    public void klik_tombol_descriptions() {
        editDeskripsi.clickBtnDescriptions();
        extentTest.log(LogStatus.PASS, "Klik tombol Descriptions");
    }

    @And("Klik tombol Edit Deskripsi")
    public void klik_tombol_editdeskripsi() {
        editDeskripsi.clickBtnEditDeskripsi();
        extentTest.log(LogStatus.PASS, "Klik tombol Edit Deskripsi");
    }

    @And("Klik update")
    public void klik_update() {
        editDeskripsi.clickBtnUpdate();
        extentTest.log(LogStatus.PASS, "Klik update");
    }

    @And("Hapus deskripsi soal")
    public void hapus_deskripsi_soal() {
        editDeskripsi.eraseDeskripsiSoal();
        extentTest.log(LogStatus.PASS, "Hapus deskripsi soal");
    }

    @And("Hapus ketentuan soal")
    public void hapus_ketentuan_soal() {
        editDeskripsi.eraseKetentuanSoal();
        extentTest.log(LogStatus.PASS, "Hapus ketentuan soal");
    }

    @And("Ubah konten deskripsi soal")
    public void ubah_konten_deskripsi_soal() {
        editDeskripsi.enterDeskripsiSoal("Pada dasarnya kemampuan kepemimpinan dapat dibentuk dan dilatih, namun demikian kekuatan dan kelemahan dalam memimpin orang lain perlu diketahui terlebih dahulu");
        extentTest.log(LogStatus.PASS, "Ubah konten deskripsi soal");
    }

    @And("Ubah konten ketentuan soal")
    public void ubah_konten_ketentuan_soal() {
        editDeskripsi.enterKetentuanSoal("Berikut ini Anda akan menjumpai 40 pernyataan yang terbagi menjadi 3 bagian penugasan. Setiap bagian, tugas anda adalah memberikan skor 0 ? 10 (lihat petunjuk). Skor 1 menunjukkan kondisi SANGAT TIDAK SESUAI sedangkan skor 10 menunjukkan kondisi SANGAT SESUAI. Silahkan Anda tuliskan skor angka yang paling sesuai dengan gambaran diri Anda pada kolom yang disediakan.");
        extentTest.log(LogStatus.PASS, "Ubah konten ketentuan soal");
    }

    @Then("Menampilkan pesan berhasil update")
    public void menampilkan_pesan_berhasil() {
        Hooks.delay(1);
        Assert.assertEquals(editDeskripsi.getTxtBerhasil(), "Deskripsi Berhasil Di Update");
        extentTest.log(LogStatus.PASS, "Menampilkan pesan berhasil update");
    }

    @Then("Mendapat alert tidak berhasil update")
    public void alert_tidak_berhasil() {
        Hooks.delay(1);
        Assert.assertEquals(editDeskripsi.getTxtBerhasil(), "Deskripsi Tidak Berhasil Di Update");
        extentTest.log(LogStatus.PASS, "Mendapat alert tidak berhasil update");
    }

}
//    @And("")
//    public void (){
//
//        extentTest.log(LogStatus.PASS, "");
//    }




