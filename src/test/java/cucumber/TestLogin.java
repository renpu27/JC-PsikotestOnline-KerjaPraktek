package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;
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

    @When("Input URL benar di browser")
    public void input_url_benar() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS,"Input URL benar di browser");
    }

    @When("Input username terdaftar")
    public void input_username_terdaftar() {
        loginPage.enterUsername("super");
        extentTest.log(LogStatus.PASS,"Input username terdaftar");
    }

    @And("Input password terdaftar")
    public void input_password_terdaftar() {
        loginPage.enterPassword("1");
        extentTest.log(LogStatus.PASS,"Input password terdaftar");
    }

    @And("Klik tombol sign in")
    public void klik_tombol_signin(){
        loginPage.clickBtnSignin();
        extentTest.log(LogStatus.PASS,"Klik tombol sign in");
    }

    @Then("Menampilkan halaman login")
    public void admin_go_to_login_page() {
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getLoginTitle(), "[d] LOGIN");
        extentTest.log(LogStatus.PASS,"Menampilkan halaman login");
    }

    @Then("Muncul pesan welcome to web psikotest")
    public void muncul_pesan_welcome() {
        Hooks.delay(1);
        Assert.assertEquals(loginPage.getTxtWelcome(),"Welcome to web psikotest");
        extentTest.log(LogStatus.PASS,"Muncul pesan welcome to web psikotest");
    }
}
