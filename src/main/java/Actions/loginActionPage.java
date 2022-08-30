package Actions;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import Locators.loginLocatorPage;
import Util.SeleniumDriver;

public class loginActionPage {
	
	loginLocatorPage locator=new loginLocatorPage();

	
    // WebDriver driver;
     
 	//@FindBy(how=How.XPATH,using="//input[@id='btnSave']")
   // public WebElement Savebutton;
	
	public loginActionPage() {
		this.locator=new loginLocatorPage();
		  AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(SeleniumDriver.getDriver(),10);
	         PageFactory.initElements(factory,this.locator);
		//PageFactory.initElements(SeleniumDriver.getDriver(),loginPage);
		//this.driver=driver;
	}
	
	public void inputEmail(String email) {
	//	loginPage.txtUserName.sendKeys(email);
		locator.txtUserName.sendKeys(email);

	}

	public void inputPassword(String password){
		locator.txtPassword.sendKeys(password);
	}
	

	
	public void clickSave() {
		locator.tombolSave.submit();
	}

	
	public void employeeName() {
		locator.employeeName.sendKeys("p");
		locator.selectemployee.click();
		
	}
	
	public void enterUserName(String user) {
		locator.enterUserName.sendKeys(user);
	}
	public void enterPassword(String pwd) {
		locator.enterPassword.sendKeys(pwd);
	}
	public void confirmPassword(String pwd1) {
		locator.enterPassword11.sendKeys(pwd1);
	}
	


	public void clickAddButton() {
		locator.clickAddButton.click();
	}
	
	public void clicAdminMenu() {
		locator.clickAdminMenu.click();
	}
	
	public void selectType() throws InterruptedException {
		locator.clickDropdownRole.click();
		 Thread.sleep(2000);
		 locator.option1.click();		
	}
	
	public void selectStatus() throws InterruptedException {
		Thread.sleep(2000);
		locator.clickDropdownStatus.click();
	
		locator.selectstatus.click();
	}
	
	public void btnLogin() {
		locator.btnLogin1.click();
	}
	
	
	
	public void searchUserName(String username) {
		locator.searchUserName.sendKeys(username);
		
	}
	
	public void searchRole() {
		locator.searchUserRole.click();
		locator.searchUserRole1.click();
	}
	
	public void searchEmployee() {
		locator.searchEmployeeName.sendKeys("Ca");
		locator.searchEmployeeName1.click();
	}
	
	public void clickEditButton() {
		locator.clickeditbtn.click();
	}
	
}

