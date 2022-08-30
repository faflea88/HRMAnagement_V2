package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginLocatorPage {
	

	@FindBy(how= How.XPATH,using="//input[@placeholder='Username']")
    public WebElement txtUserName;
	
	@FindBy(how= How.XPATH,using="//input[@placeholder='Password']")
    public WebElement txtPassword;
	
	@FindBy(how= How.XPATH,using="//button[@type='submit']")
    public WebElement btnLogin;
	
	@FindBy(how= How.ID,using="welcome")
    public WebElement Welcome;
	
	@FindBy(how=How.XPATH,using="//input[@id='btnSave']")
    public WebElement Savebutton;
	
 
	@FindBy(how=How.XPATH,using="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	public WebElement clickDropdownRole;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	public WebElement selectRole;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[1]/div[1]/div[2]/div[1]/div[1]")
    public WebElement pilihRole;
	
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type for hints...']")
    public WebElement employeeName;
	
	
	@FindBy(how=How.XPATH,using="//div[@class=\"oxd-autocomplete-option\"][4]")
    public WebElement selectemployee;
	
	
	@FindBy(how=How.XPATH,using="(//input[@autocomplete='off'])[1]")
    public WebElement enterUserName;
	
	
	@FindBy(how=How.XPATH,using="'oxd-select-text oxd-select-text--focus']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']")
    public WebElement selectStatus;
	
	
	@FindBy(how=How.XPATH,using="(//input[@type='password'])[1]")
    public WebElement enterPassword;
	
	
	@FindBy(how=How.XPATH,using="(//input[@type='password'])[2]")
    public WebElement enterPassword11;
	
	//Locator for admin screen
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Admin']")
    public WebElement clickAdminMenu;
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Add']")
    public WebElement clickAddButton;
	
	@FindBy(how=How.XPATH,using="//a[normalize-space()='Assign Leave']")
    public WebElement assigendMenu;

	@FindBy(how=How.XPATH,using="//div[@role='option'][2]")
	public WebElement option1;
	
	@FindBy(how=How.XPATH,using="//i[@class='oxd-icon bi-caret-up-fill oxd-select-text--arrow']")
	public WebElement status1;
	
	@FindBy(how=How.XPATH,using="//span[text()='Enabled']")
	public WebElement selectstatus;

	@FindBy(how=How.XPATH,using="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	public WebElement clickDropdownStatus;
	
	
	@FindBy(how=How.XPATH,using="//button[@type=\"submit\"]")
	public WebElement tombolSave;
	
	@FindBy(how= How.XPATH,using="//button[@type='submit']")
    public WebElement btnLogin1;
	
	
	///locator on the admin screen
		
	//admin screen-search admin
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")
	public WebElement searchUserName;

	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
	public WebElement searchUserRole;
	
	@FindBy(how=How.XPATH,using="//div[@class='oxd-select-option']//span[text()='Admin']")
	public WebElement searchUserRole1;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Type for hints...']")
	public WebElement searchEmployeeName;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Hope')]")
	public WebElement searchEmployeeName1;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='oxd-autocomplete-option'][2]")
	public WebElement searchStatus;
	
	@FindBy(how=How.XPATH,using="//div[@class='oxd-select-option'][1]")
	public WebElement searchStatus1;
	
	
	@FindBy(how=How.XPATH,using="//i[@class='oxd-icon bi-pencil-fill']")
	public WebElement clickeditbtn;
}
