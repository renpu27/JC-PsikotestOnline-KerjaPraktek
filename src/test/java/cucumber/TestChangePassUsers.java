package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.ChangePassUsersPage;

public class TestChangePassUsers {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ChangePassUsersPage changePassUsersPage = new ChangePassUsersPage();

    public TestChangePassUsers(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Klik tombol ok")
    public void klik_tombol_ok() {
        changePassUsersPage.clickBtnOk();
        extentTest.log(LogStatus.PASS, "Klik tombol ok");
    }
    @When("Klik tombol edit users")
    public void klik_tombol_edit_users(){
        changePassUsersPage.clickBtnEditPass();
        extentTest.log(LogStatus.PASS, "Klik tombol edit users");
    }
    @And("Admin input password baru kurang dari 9 char")
    public void admin_input_password_kurang_dari_9_char() {
        Hooks.delay(1);
        changePassUsersPage.inputPassNew("unyu");
        extentTest.log(LogStatus.PASS, "Admin input password baru kurang dari 9 char");
    }
    @And("Admin input password baru lebih dari 9 char")
    public void admin_input_password_lebih_dari_9_char() {
        Hooks.delay(1);
        changePassUsersPage.inputPassNew("supermanisdead");
        extentTest.log(LogStatus.PASS, "Admin input password baru lebih dari 9 char");
    }
    @And("Admin input password baru lebih dari 9 char angka semua")
    public void admin_input_password_lebih_dari_9_char_angka_semua() {
        Hooks.delay(1);
        changePassUsersPage.inputPassNew("123456789098");
        extentTest.log(LogStatus.PASS, "Admin input password baru lebih dari 9 char angka semua");
    }
    @And("Admin input password baru lebih dari 9 char simbol semua")
    public void admin_input_password_lebih_dari_9_char_simbol_semua() {
        Hooks.delay(1);
        changePassUsersPage.inputPassNew("!@#$%^&*../");
        extentTest.log(LogStatus.PASS, "Admin input password baru lebih dari 9 char simbol semua");
    }
    @And("Admin input password baru lebih dari 9 char campuran")
    public void admin_input_password_lebih_dari_9_char_campuran() {
        Hooks.delay(1);
        changePassUsersPage.inputPassNew("Syarifah_12");
        extentTest.log(LogStatus.PASS, "Admin input password baru lebih dari 9 char campuran");
    }
    @And("Admin input password baru kosong")
    public void admin_input_password_kosong() {
        Hooks.delay(1);
        changePassUsersPage.inputPassNew("");
        extentTest.log(LogStatus.PASS, "Admin input password baru lebih dari 9 char campuran");
    }
    @And("Klik tombol save")
    public void klik_tombol_save() {
        changePassUsersPage.clickBtnSavePass();
        extentTest.log(LogStatus.PASS, "Klik tombol save");
    }
    @Then("Menampilkan alert pemberitahuan")
    public void menampilkan_alert_pemberitahuan() {
        Hooks.delay(1);
        Assert.assertEquals(changePassUsersPage.getTxtPemberitahuan(),"Password minimal harus 9 karakter");
        extentTest.log(LogStatus.PASS, "Menampilkan alert pemberitahuan");
    }
    @Then("Menampilkan alert success")
    public void menampilkan_alert_success() {
        Hooks.delay(1);
        Assert.assertEquals(changePassUsersPage.getTxtSuccess(),"Data Berhasil Di Update");
        extentTest.log(LogStatus.PASS, "Menampilkan alert success");
    }
    @Then("Menampilkan alert peringatan")
    public void menampilkan_alert_peringatan() {
        Hooks.delay(1);
        Assert.assertEquals(changePassUsersPage.getTxtPeringatan(),"Isi terlebih dahulu");
        extentTest.log(LogStatus.PASS, "Menampilkan alert peringatan");
    }
}
