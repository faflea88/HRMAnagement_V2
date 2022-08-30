package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Actions.loginActionPage;
import Util.SeleniumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	loginActionPage page=PageFactory.initElements(SeleniumDriver.getDriver(), loginActionPage.class);
	//loginActionPage page=new loginActionPage();
	@Given("User is on Home page")
    public void userOnHomePage() {
    	 SeleniumDriver.setUpDriver();
 SeleniumDriver.openPage("https://opensource-demo.orangehrmlive.com/");
    SeleniumDriver.waitForPageToLoad();
    }
 
 
    @Then("User should be able to login successfully")
    public void successfulLogin() throws InterruptedException {
 
    }
 
  
    
 
	@When("^user enters Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
   public void userEntersEmailAsAndPasswordAs(String email, String password)  {
      SeleniumDriver.getDriver().findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(email);
       SeleniumDriver.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
       }

    @When("I click login button")
    public void i_click_login_button() throws InterruptedException {
      // login.buttonClick();
   SeleniumDriver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();   
    }
    
    
    
    //mengakses halaman admin

@Given("I click admin menu")
public void i_click_admin_menu() {
  page.clicAdminMenu();
}
@When("I click Add button")
public void i_click_add_button() {
	page.clickAddButton();	
}

@When("I enter the value")
public void i_enter_the_value() throws InterruptedException {
	page.selectType();
	page.selectStatus();
    page.employeeName();
    page.enterUserName("Winda68");
    page.enterPassword("Abc1234!");
    page.confirmPassword("Abc1234!");
    Thread.sleep(2000);
    page.clickSave();  
    
}

@Then("click save button")
public void click_save_button() {
	
}

//admin screem-search admin


@Given("I on the admin screen")
public void i_on_the_admin_screen() throws InterruptedException {
	Thread.sleep(3000);
  SeleniumDriver.getDriver().navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
}

@When("Enter username")
public void enter_username() {
   page.searchUserName("Winda68");
}

@And("I enter role")
public void i_enter_role() throws InterruptedException {
   page.searchRole();
}

@Then("enter employee name")
public void enter_employee_name() throws InterruptedException {
	 page.searchEmployee();
	
}

@And("enter status")
public void enter_status() throws InterruptedException {
	 page.selectStatus();
	 Thread.sleep(2000);
	    page.clickSave(); 
	    
	    page.clickEditButton();
}
}
