package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.FormAddAdminPage;


public class TestFormAddAdmin {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static FormAddAdminPage addAdmin = new FormAddAdminPage();

    public TestFormAddAdmin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("Admin berada di form Add Admin")
    public void admin_berada_di_form_add_admin() {
        Hooks.delay(1);
        addAdmin.clickBtnAddAdmin();
    }
    @Given("Admin ready to input data Admin")
    public void admin_ready_to_input_data_admin() {
        addAdmin.refreshPage();
        Hooks.delay(1);
        addAdmin.dismissLoginMsg();
        Hooks.delay(1);
        addAdmin.accessMenuUserMgMt();
        Hooks.delay(1);
        addAdmin.accessMenuAdmin();
        Hooks.delay(1);
        addAdmin.clickBtnAddAdmin();
    }


    @When("Admin input field Privilege")
    public void admin_input_field_privilege() {
        Hooks.delay(1);
        addAdmin.choosePrivilege("Admin");
        extentTest.log(LogStatus.PASS,"Admin input field privileges");
    }
    @When("Admin input field Full Name")
    public void admin_input_field_full_name() {
        Hooks.delay(1);
        addAdmin.inputFullName("Joss Gandoss");
        extentTest.log(LogStatus.PASS,"Admin input field Full Name");
    }
    @When("Admin input field Privileges")
    public void admin_input_field_privileges() {
        Hooks.delay(1);
        addAdmin.choosePrivilege("Admin");
        extentTest.log(LogStatus.PASS,"Admin input field Privileges");
    }


    @And("Admin input field Supervisor")
    public void admin_input_field_supervisor() {
        Hooks.delay(1);
        addAdmin.chooseSupervisor("ARIE");
        extentTest.log(LogStatus.PASS,"Admin input field Supervisor");
    }
    @And("Admin input field Telephone")
    public void admin_input_field_telephone() {
        Hooks.delay(1);
        addAdmin.inputTelephone("085876784565");
        extentTest.log(LogStatus.PASS,"Admin input field Telephone");
    }
    @And("Admin input field Username")
    public void admin_input_field_username() {
        Hooks.delay(1);
        addAdmin.inputUsername("joss");
        extentTest.log(LogStatus.PASS,"Admin input field Username");
    }
    @And("Admin input field Password")
    public void admin_input_field_password() {
        Hooks.delay(1);
        addAdmin.inputPassword("gandoss123");
        extentTest.log(LogStatus.PASS,"Admin input field Password");
    }
    @And("Admin klik tombol Save")
    public void admin_klik_tombol_save() {
        Hooks.delay(1);
        addAdmin.saveAdmin();
        extentTest.log(LogStatus.PASS,"Admin klik tombol Save");
    }
    @And("Admin kosongkan field Privileges")
    public void admin_kosongkan_field_privileges() {
        Hooks.delay(1);
        addAdmin.resetPrivilege();
        extentTest.log(LogStatus.PASS,"Admin kosongkan field Privileges");
    }
    @And("Admin kosongkan field Supervisor")
    public void admin_kosongkan_field_supervisor() {
        addAdmin.resetSupervisor();
        extentTest.log(LogStatus.PASS,"Admin kosongkan field Supervisor");
    }
    @And("Admin kosongkan field Telephone")
    public void admin_kosongkan_field_telephone() {
        addAdmin.resetTelephone();
        extentTest.log(LogStatus.PASS,"Admin kosongkan field Telephone");
    }
    @And("Admin kosongkan field Username")
    public void admin_kosongkan_field_username() {
        addAdmin.resetUsername();
        extentTest.log(LogStatus.PASS,"Admin kosongkan field Username");
    }
    @And("Admin kosongkan field Password")
    public void admin_kosongkan_field_password() {
        addAdmin.resetPassword();
        extentTest.log(LogStatus.PASS,"Admin kosongkan field Password");
    }


    @Then("Muncul tampilan warning Mohon Lengkapi Data")
    public void muncul_tampilan_warning_mohon_lengkapi_data() {
        Hooks.delay(1);
        Assert.assertEquals(addAdmin.getWarningLengkapiData(),"Mohon Lengkapi Data");
        extentTest.log(LogStatus.PASS,"Muncul tampilan warning Mohon Lengkapi Data");
        Hooks.delay(1);
        addAdmin.dismissWarningLengkapiData();
    }


    //Test for TCC.PO.024 - TCC.PO.028
    @When("Admin input field Full Name {string}")
    public void admin_input_field_full_name_something(String name) {
        Hooks.delay(1);
        addAdmin.inputFullName(name);
        extentTest.log(LogStatus.PASS,"Admin input Full Name "+name);
    }
    @And("Admin input field Privileges {string}")
    public void admin_input_field_privileges_something(String privilege) {
        Hooks.delay(1);
        addAdmin.choosePrivilege(privilege);
        extentTest.log(LogStatus.PASS,"Admin input Privilege "+privilege);
    }
    @And("Admin input field Supervisor {string}")
    public void admin_input_field_supervisor_something(String supervisor) {
        Hooks.delay(1);
        addAdmin.chooseSupervisor(supervisor);
        extentTest.log(LogStatus.PASS,"Admin input Supervisor "+supervisor);
    }
    @And("Admin input field Telephone {string}")
    public void admin_input_field_telephone_something(String telfon) {
        Hooks.delay(1);
        addAdmin.inputTelephone(telfon);
        extentTest.log(LogStatus.PASS,"Admin input Telephone "+telfon);
    }
    @And("Admin input field Username {string}")
    public void admin_input_field_username_something(String uname) {
        Hooks.delay(1);
        addAdmin.inputUsername(uname);
        extentTest.log(LogStatus.PASS,"Admin input username "+uname);
    }
    @And("Admin input field Password {string}")
    public void admin_input_field_password_something(String pass) {
        Hooks.delay(1);
        addAdmin.inputPassword(pass);
        extentTest.log(LogStatus.PASS,"Admin input Password "+pass);
    }
    @And("Admin konfirmasi simpan data")
    public void admin_konfirmasi_simpan_data() {
        Hooks.delay(1);
        addAdmin.saveAdmin();
        Hooks.delay(1);
        addAdmin.confirmSave();
        extentTest.log(LogStatus.PASS,"Admin konfirmasi simpan data");
    }
    @Then("Muncul notifikasi Pemberitahuan Password error")
    public void muncul_notifikasi_pemberitahuan_password_error() {
        Assert.assertTrue(addAdmin.getPasswordErrorTxt().contains("Pemberitahuan!"));
        extentTest.log(LogStatus.PASS,"Muncul notifikasi Pemberitahuan Password error");
    }
}
