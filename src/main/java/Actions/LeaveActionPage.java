package Actions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import Locators.LocatorLeavePage;
import Util.SeleniumDriver;

public class LeaveActionPage {
	
	private static final int WebElement = 0;
	private static final int List = 0;
	LocatorLeavePage locatorLeave=new LocatorLeavePage();
	
	public LeaveActionPage() {
	this.locatorLeave=new LocatorLeavePage();
	AjaxElementLocatorFactory fac=new AjaxElementLocatorFactory(SeleniumDriver.getDriver(), 10);
	PageFactory.initElements(fac, this.locatorLeave);
	}

	
	public void clickLeaveMenu() {
		locatorLeave.clickLeaveMenu.click();
	}
	
	public void clickFromDate() {
	 locatorLeave.fromDate.click();
	 locatorLeave.callFromDate.click();
	 List<WebElement> t= (List<WebElement>) locatorLeave.tableBody;
	 for (int k=0; k<t.size();k++) {
	String dt=t.get(k).getText();
	if (dt.equals("2")) {
		t.get(k).click();
		break;
	}
	 }
	 String v=locatorLeave.fromDate.getAttribute("value");
	 System.out.print("Date selected by date picker"+v);
	
	  
	}
	
		
	public void selectCallFromDate() {
		locatorLeave.leaveWithStatus.click();
	
	}
	
	public void clickToDate() {
	
		locatorLeave.toDate.click();
		locatorLeave.callToDate1.click();
		 List<WebElement> t= (List<WebElement>) locatorLeave.tableBody1;
		
		for(int p=0;p<t.size();p++) {
			String b=t.get(p).getTagName();
					if(b.equals("3")) {
						t.get(p).click();
						break;
					}
			
		}
		
		
	}
	
	public void showStatus() {
		locatorLeave.leaveWithStatus.click();
		
	}
	
	public void selectEmployee() {
		locatorLeave.selectEmployee.sendKeys(Keys.SPACE);
		locatorLeave.selectEmployee1.click();
	}
	
	public void subUnit() {
		Select list=new Select(locatorLeave.leaveWithStatus);
		list.selectByIndex(4);
		
	}
	
	public void pastEmployee() {
	locatorLeave.includePastEmployee.click();
		
	}
	
	public void search() {
		locatorLeave.clickSearch.click();
	}
	
	
	
	
	
	
}
