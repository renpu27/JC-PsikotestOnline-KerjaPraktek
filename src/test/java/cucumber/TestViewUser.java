package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.ViewUserPage;

public class TestViewUser {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ViewUserPage viewUser= new ViewUserPage();

    public TestViewUser(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @And("Klik tombol view user")
    public void klik_tombol_view_user(){
        Hooks.delay(3);
        viewUser.clickBtnViewUser();
        extentTest.log(LogStatus.PASS, "Klik tombol view user");
    }

    @Then("Muncul tampilan View User")
    public void menampilkan_view_user(){
        Hooks.delay(1);
        Assert.assertEquals(viewUser.getTxtViewUser(),"[d] View User");
        extentTest.log(LogStatus.PASS,"Muncul tampilan View User");
    }

}
