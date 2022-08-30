package Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorLeavePage {

	
	@FindBy(how=How.XPATH,using="//b[normalize-space()='Leave']")
	public WebElement clickLeaveMenu;
	
	@FindBy(how=How.XPATH,using="//input[@id='calFromDate']")
	public WebElement fromDate;
	
	
	@FindBy(how=How.ID,using="calFromDate")
	public WebElement callFromDate;
	
	@FindBy(how=How.XPATH,using="//table/tbody/tr/td")
	public List <WebElement> tableBody;
	
	
	@FindBy(how=How.XPATH,using="")
	public WebElement toDate;
	
	@FindBy(how=How.ID,using="calToDate")
	public WebElement callToDate1;
	
	@FindBy(how=How.XPATH,using="//table/tbody/tr/td")
	public List <WebElement>  tableBody1;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='leaveList_chkSearchFilter_-1']")
	public WebElement leaveWithStatus;
	
	@FindBy(how=How.XPATH,using="//input[@id='leaveList_txtEmployee_empName']")
	public WebElement selectEmployee;
	@FindBy(how=How.XPATH,using="//li[@class='ac_even ac_over']")
	public WebElement selectEmployee1;
	
	@FindBy(how=How.XPATH,using="//select[@id='leaveList_cmbSubunit']")
	public WebElement subUnit;
	
	@FindBy(how=How.XPATH,using="//input[@id='leaveList_cmbWithTerminated']")
	public WebElement includePastEmployee;
	@FindBy(how=How.XPATH,using="//input[@id='btnSearch']")
	public WebElement clickSearch;

	

}
