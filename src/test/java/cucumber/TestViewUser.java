package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.ChangePassUsersPage;
import projectmagang.pages.ViewUsersPage;

public class TestViewUser {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ViewUsersPage viewUsersPage = new ViewUsersPage();

    public TestViewUser(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("Klik tombol view user")
    public void klik_tombol_view_user(){
        viewUsersPage.clickBtnView();
        extentTest.log(LogStatus.PASS, "Klik tombol edit users");
    }
    @And("Klik tombol close")
    public void klik_tombol_close(){
        viewUsersPage.clickBtnClose();
        extentTest.log(LogStatus.PASS, "Klik tombol close");
    }
    @Then("Menampilkan data user")
    public void admin_menampilkan_data_user(){
        Hooks.delay(1);
        Assert.assertEquals(viewUsersPage.getTxtView(),"tes");
        extentTest.log(LogStatus.PASS, "Menampilkan data user");
    }
}
