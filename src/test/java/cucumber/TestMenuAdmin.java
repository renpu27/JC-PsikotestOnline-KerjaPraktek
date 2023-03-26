package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.MenuAdminPage;

public class TestMenuAdmin {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static MenuAdminPage menuadmin = new MenuAdminPage();
    public TestMenuAdmin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("Admin berada di menu Admin")
    public void admin_berada_di_menu_admin() {
        Hooks.delay(2);
        menuadmin.clickMenuUserManagement();
        Hooks.delay(1);
        menuadmin.clickBtnAdmin();
        extentTest.log(LogStatus.PASS,"Admin berada di Menu Admin");
    }

    @When("Admin menginput keyword kedalam Search Bar")
    public void admin_menginput_keyword_kedalam_search_bar() {
        menuadmin.sendKeyword("Lorem Ipsum Dolor Sit Amet");
        extentTest.log(LogStatus.PASS,"Admin input keyword kedalam Search Bar");
    }

    @When("Admin input keyword kedalam searchbar")
    public void admin_input_keyword_kedalam_searchbar() {
        Hooks.delay(1);
        menuadmin.clearSearchBar();
        Hooks.delay(1);
        menuadmin.sendKeyword("Copy keyword ini yaa");
        extentTest.log(LogStatus.PASS,"Admin input keyword kedalam searchbar");
    }

    @And("Admin melakukan operasi copy terhadap keyword yang diinput")
    public void admin_melakukan_operasi_copy_terhadap_keyword_yang_diinput() {
        Hooks.delay(1);
        driver.findElement(By.xpath("//input[@id='tl_user_management--53685_text']")).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.xpath("//input[@id='tl_user_management--53685_text']")).sendKeys(Keys.CONTROL,"c");
        extentTest.log(LogStatus.PASS,"Admin melakukan operasi copy keyword");
    }

    @And("Admin melakukan operasi paste terhadap keyword yang dicopy")
    public void admin_melakukan_operasi_paste_terhadap_keyword_yang_dicopy() {
        Hooks.delay(1);
        menuadmin.clearSearchBar();
        Hooks.delay(1);
        driver.findElement(By.xpath("//input[@id='tl_user_management--53685_text']")).sendKeys(Keys.CONTROL,"v");
        extentTest.log(LogStatus.PASS,"Admin melakukan operasi paste keyword");
    }

    @Then("Admin dapat melihat keyword yang diinput")
    public void admin_dapat_melihat_keyword_yang_diinput() {
        Hooks.delay(1);
        Assert.assertEquals(menuadmin.getKeyword(),"Lorem Ipsum Dolor Sit Amet");
        extentTest.log(LogStatus.PASS,"Admin dapat melihat keyword yang diinput");
    }

    @Then("Admin dapat melihat keyword yang di copy-paste")
    public void admin_dapat_melihat_keyword_yang_di_copy_paste(){
        Hooks.delay(1);
        Assert.assertEquals(menuadmin.getKeyword(),"Copy keyword ini yaa");
        extentTest.log(LogStatus.PASS,"Admin dapat melihat keyword yang di copy-paste");
    }
}
