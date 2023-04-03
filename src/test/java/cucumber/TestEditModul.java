package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.EditModulPage;

public class TestEditModul {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static EditModulPage editModul= new EditModulPage();

    public TestEditModul(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Klik tombol close")
    public void klik_tombol_close(){
        editModul.clickBtnClose();
        extentTest.log(LogStatus.PASS,"Klik tombol close");
    }

    @When("Klik tombol Edit Modul")
    public void klik_tombol_edit_modul(){
        editModul.clickBtnEditModul();
        extentTest.log(LogStatus.PASS, "Klik tombol Edit Modul");
    }

    @And("Hapus nama modul")
    public void hapus_nama_modul(){
        editModul.eraseNamaModul();
        extentTest.log(LogStatus.PASS, "Hapus nama modul");
    }

    @And("Ubah nama modul")
    public void ubah_nama_modul(){
        editModul.enterNamaModul("Leadership Style Inventory");
        extentTest.log(LogStatus.PASS, "Ubah nama modul");
    }

    @And("Ubah tipe modul menjadi pilih")
    public void hapus_tipe_modul(){
        editModul.chooseTipeModul("(pilih)");
        extentTest.log(LogStatus.PASS, "Ubah tipe modul menjadi pilih");
    }


    @And("Ubah tipe modul")
    public void ubah_tipe_modul(){
        editModul.chooseTipeModul("ESAI LENGTH");
        extentTest.log(LogStatus.PASS, "Ubah tipe modul");
    }

    @And("Klik update modul")
    public void klik_update_modul(){
        editModul.clickBtnUpdateModul();
        extentTest.log(LogStatus.PASS,"Klik update modul");
    }

    @And("Hapus waktu pengerjaan")
    public void hapus_waktu_pengerjaan(){
        editModul.eraseWaktuPengerjaan();
        extentTest.log(LogStatus.PASS, "Hapus waktu pengerjaan");
    }

    @And("Ubah waktu pengerjaan")
    public void ubah_waktu_pengerjaan(){
        editModul.enterWaktuPengerjaan("30");
        extentTest.log(LogStatus.PASS, "Ubah waktu pengerjaan");
    }

    @And("Hapus jumlah soal")
    public void hapus_jumlah_soal(){
        editModul.eraseJumlahSoal();
        extentTest.log(LogStatus.PASS, "Hapus jumlah soal");
    }

    @And("Ubah jumlah soal")
    public void ubah_jumlah_soal(){
        editModul.enterJumlahSoal("40");
        extentTest.log(LogStatus.PASS, "Ubah jumlah soal");
    }

    @And("Ubah kategori modul menjadi pilih")
    public void hapus_kategori_modul(){
        editModul.chooseKategoriModul("(pilih)");
        extentTest.log(LogStatus.PASS, "Ubah kategori modul menjadi pilih");
    }

    @And("Ubah kategori modul")
    public void ubah_kategori_modul(){
        editModul.chooseKategoriModul("LEADER");
        extentTest.log(LogStatus.PASS, "Ubah kategori modul");
    }

    @And("Hapus deskripsi singkat")
    public void hapus_deskripsi_singkat(){
        editModul.eraseDeskripsiSingkat();
        extentTest.log(LogStatus.PASS, "Hapus deskripsi singkat");
    }

    @And("Ubah deskripsi singkat")
    public void ubah_deskripsi_singkat(){
        editModul.enterDeskripsiSingkat("Pada dasarnya kemampuan kepemimpinan dapat dibentuk dan dilatih, namun demikian \n" +
                "kekuatan dan kelemahan dalam memimpin orang lain perlu diketahui terlebih dahulu");
        extentTest.log(LogStatus.PASS, "Ubah deskripsi singkat");
    }

    @And("Ubah status modul menjadi pilih")
    public void hapus_status_modul(){
        editModul.chooseStatusModul("(pilih)");
        extentTest.log(LogStatus.PASS, "Ubah status modul menjadi pilih");
    }

    @And("Ubah status modul")
    public void ubah_status_modul(){
        editModul.chooseStatusModul("ACTIVE");
        extentTest.log(LogStatus.PASS, "Ubah status modul");
    }

    @Then("Mendapat alert tidak berhasil ditambahkan")
    public void alert_tidak_berhasil_ditambahkan(){
    Hooks.delay(1);
        Assert.assertEquals(editModul.getTxtDitambahkan(), "Modul Tidak Berhasil Ditambahkan");
        extentTest.log(LogStatus.PASS, "Mendapat alert tidak berhasil ditambahkan");
    }

    @Then("Mendapat pesan berhasil ditambahkan")
    public void berhasil_ditambahkan(){
        Hooks.delay(1);
        Assert.assertEquals(editModul.getTxtDitambahkan(),"Modul Berhasil Ditambahkan");
        extentTest.log(LogStatus.PASS, "Mendapat pesan berhasil ditambahkan");
    }

}

//    @And("")
//    public void (){
//
//        extentTest.log(LogStatus.PASS, "");
//    }
