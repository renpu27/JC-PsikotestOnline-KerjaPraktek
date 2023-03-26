package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.LoginPage;
import projectmagang.utils.Constants;

public class TestLogin {

    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static LoginPage loginPage = new LoginPage();

    public TestLogin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Input URL invalid di browser")
    public void input_url_invalid() {
        driver.get(Constants.wrongURL);
        extentTest.log(LogStatus.PASS,"Input URL invalid di browser");
    }

    @When("Input URL valid di browser")
    public void input_url_valid() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"Input URL valid di browser");
    }

    @When("Input username terdaftar")
    public void input_username_terdaftar() {
        loginPage.enterUsername("super");
        extentTest.log(LogStatus.PASS,"Input username terdaftar");
    }

    @When("Input username yang tidak terdaftar")
    public void input_username_yang_tidak_terdaftar() {
        loginPage.enterUsername("tidakterdaftar");
        extentTest.log(LogStatus.PASS,"Input username yang tidak terdaftar");
    }

    @And("Input password terdaftar")
    public void input_password_terdaftar() {
        loginPage.enterPassword("1");
        extentTest.log(LogStatus.PASS,"Input password terdaftar");
    }

    @And("Input password yang tidak terdaftar")
    public void input_password_yang_tidak_terdaftar() {
        loginPage.enterPassword("tidakada010");
        extentTest.log(LogStatus.PASS,"Input password yang tidak terdaftar");
    }

    @And("Klik tombol sign in")
    public void klik_tombol_signin(){
        Hooks.delay(3);
        loginPage.clickBtnSignin();
        extentTest.log(LogStatus.PASS,"Klik tombol sign in");
    }

    @Then("Admin tidak dapat mengakses website")
    public void admin_tidak_dapat_mengakses_website() {
        String currURL = driver.getCurrentUrl();
        Assert.assertNotEquals(currURL, "https://sqa.peluangkerjaku.com/psy/");
        extentTest.log(LogStatus.PASS,"Admin tidak dapat mengakses website");
    }

    @Then("Menampilkan halaman login")
    public void admin_go_to_login_page() {
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getLoginTitle(), "[d] LOGIN");
        extentTest.log(LogStatus.PASS,"Menampilkan halaman login");
    }

    @Then("Muncul warning Username atau password tidak ditemukan atau akun anda tidak aktif")
    public void muncul_warning_username_atau_password_tidak_ditemukan_atau_akun_anda_tidak_aktif() {
        Hooks.delay(2);
        Assert.assertEquals(loginPage.getLoginErrorTxt(),"Username atau password tidak ditemukan atau akun anda tidak aktif");
        extentTest.log(LogStatus.PASS,"Muncul Warning Username atau password tidak ditemukan atau akun anda tidak aktif");
        loginPage.dismissLoginWarningMsg();
        Hooks.delay(1);
        loginPage.clearLoginForm();
    }

    @Then("Muncul pesan welcome to web psikotest")
    public void muncul_pesan_welcome() {
        Hooks.delay(5);
        Assert.assertEquals(loginPage.getTxtWelcome(),"Welcome to web psikotest");
        extentTest.log(LogStatus.PASS,"Muncul pesan welcome to web psikotest");
        Hooks.delay(3);
        loginPage.dissmissLoginMsg();
    }
}
