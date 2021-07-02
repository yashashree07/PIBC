package com.pibc.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.util.TestUtil;

public class CalendarPage extends TestBase {

	@FindBy(name = "currency")
	WebElement currency;

	@FindBy(name = "paymentType")
	WebElement paymentType;

	@FindBy(name = "month")
	WebElement month;

	@FindBy(name = "year")
	WebElement year;

	@FindBy(name = "filter")
	WebElement statusfilter;

	@FindBy(name = "toYear")
	WebElement toYear;

	@FindBy(id = "resetButton")
	WebElement resetBtn;

	@FindBy(xpath="//body[@id='body']//td//td[1]//input[1]")
	WebElement resetbtn;
	
	@FindBy(xpath = "//tr[7]//td[1]//input[1]")
	WebElement RESETBtn;

	@FindBy(xpath = "//tr[8]//td[1]//input[1]")
	WebElement ResetBtn;

	@FindBy(xpath = "//table[@class='TableBorder']//input[2]")
	WebElement okBtn;

	@FindBy(name = "submit")
	WebElement submitBtn;

	@FindBy(name = "confirm")
	WebElement confirmBtn;

	@FindBy(name = "Cancel")
	WebElement CANCELBtn;

	@FindBy(xpath = "//p[@class='label']")
	WebElement message;

	@FindBy(xpath = "//tr[2]")
	WebElement record;

	@FindBy(xpath="//div[@id='pageBody']//table//tbody//tr//td//form//p//input")
	WebElement removeBtn;
	
	@FindBy(xpath="//button[contains(text(),'ack to List')]")
	WebElement backtoListBtn;
	
	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement verifyCurrency;

	@FindBy(name = "approve")
	WebElement approveBtn;

	@FindBy(name = "reject")
	WebElement rejectBtn;

	@FindBy(name = "repair")
	WebElement repairBtn;

	@FindBy(xpath = "//body[@id='body']//td//td[1]//input[2]")
	WebElement OKBtn;

	@FindBy(xpath = "//center//input[2]")
	WebElement OKBTN;

	@FindBy(name = "day")
	WebElement daytype;

	@FindBy(name = "org.apache.struts.taglib.html.CANCEL")
	WebElement cancelBtn;

	@FindBy(xpath = "//a[contains(text(),'Restart Workflow')]")
	WebElement restartWorkflow;

	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement errormessages;

	@FindBy(name = "collapse")
	WebElement collapsemonth;

	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;

	public CalendarPage() {
		PageFactory.initElements(driver, this);
	}

	public CalendarPage createCalendar(String ISOCode, String PaymentType, String Month, String Year,
			String Daytype) throws InterruptedException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		month.click();
		Select sl2 = new Select(month);
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		resetbtn.click();
		String a = year.getText();
		if (a.isEmpty()) {
			System.out.println("Reset Button functionality is working fine");
		} else {
			System.out.println("Reset Button is not working fine");
		}
		currency.click();
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		sl1.selectByVisibleText(PaymentType);
		month.click();
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		cancelBtn.click();
		String b = errormessages.getText();
		String c = "Operation Create new calendar was cancelled.";
		if (b.equals(c)) {
			System.out.println("Cancel operation executed successully");
		} else {
			System.out.println("Cancel Button is not working");
		}
		restartWorkflow.click();
		currency.click();
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		sl1.selectByVisibleText(PaymentType);
		month.click();
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		Select sl3 = new Select(daytype);
		sl3.selectByVisibleText(Daytype);
		OKBtn.click();
		cancelBtn.click();
		if (b.equals(c)) {
			System.out.println("Cancel Button from Calendar details screen is working fine");
		} else {
			System.out.println("Cancel button from Calendar details screen is not working");
		}
		restartWorkflow.click();
		currency.click();
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		sl1.selectByVisibleText(PaymentType);
		month.click();
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		sl3.selectByVisibleText(Daytype);
		OKBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		OKBTN.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}

	public CalendarPage addexistingCalendar(String ISOCode, String PaymentType, String Month,
			String Year) throws InterruptedException, IOException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		month.click();
		Select sl2 = new Select(month);
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		okBtn.click();
		String actualYearMsg = errormessages.getText();
		String expectedYearMsg = "Calendar already exists";
		if (actualYearMsg.equals(expectedYearMsg)) {
			System.out.println(
					"Proper error message is displayed for Already existing Year for " + ISOCode + " currency");
		} else {
			System.out.println("Validation failed for Existing year");
			TestUtil.takeScreenshot(actualYearMsg, expectedYearMsg);
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}

	public CalendarPage createCalendar1(String ISOCode, String PaymentType, String Month, String Year)
			throws InterruptedException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		month.click();
		Select sl2 = new Select(month);
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		okBtn.click();
		String a = errormessages.getText();
		String b = "Invalid Year.";
		if (a.equals(b)) {
			System.out.println("Proper validation message is displayed for Invalid Year for " + ISOCode + " currency");
		} else {
			System.out.println("Validation failed for Invalid Year");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}

	public CalendarPage approveCalendar(String ISOCode, String PaymentType, String Month, String Year)
			throws InterruptedException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		month.click();
		Select sl2 = new Select(month);
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		collapsemonth.click();
		RESETBtn.click();
		String a = year.getText();
		if (a.isEmpty()) {
			System.out.println("Reset Button functionality is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		currency.click();
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		sl1.selectByVisibleText(PaymentType);
		month.click();
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		collapsemonth.click();
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}

	public CalendarPage rejectCalendar(String ISOCode, String PaymentType, String Month, String Year)
			throws InterruptedException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		month.click();
		Select sl2 = new Select(month);
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		collapsemonth.click();
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		rejectBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}

	public CalendarPage sendtorepairqueue(String ISOCode, String PaymentType, String Month,
			String Year) throws InterruptedException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		month.click();
		Select sl2 = new Select(month);
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		collapsemonth.click();
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		repairBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}

	public CalendarPage addBulkCalendarwithInvaliddata(String ISOCode, String PaymentType,
			String FromYear, String ToYear) throws InterruptedException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		year.sendKeys(FromYear);
		toYear.sendKeys(ToYear);
		submitBtn.click();
		String a = errormessages.getText();
		String b = "Years must be numeric";
		String c = "Years must be 4 digits";
		String d = "Please enter to year";
		String e="From year cannot be greater than to year";
		String f="Years must be from 20th, 21st or 22nd century";
		
		if (a.equals(b)) {
			System.out.println("Years must be numeric validation message is propery displayed for Invalid year");
		} else if (a.equals(c)) {
			System.out.println("Years must be 4 digits validation message is displayed properly");
		} else if (a.equals(d)) {
			System.out.println("Please enter to year validation message is displayed properly");
		} else if(a.equals(e)){
			System.out.println("From year cannot be greater than to year validation message is displayed properly");
		} else if(a.equals(f)) {
			System.out.println("Years must be from 20th, 21st or 22nd century, Validation Message Displayed is Proper");
		}
		else{
			System.out.println("Validation failed for Invalid Year");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}

	public CalendarPage addBulkCalendarwithValiddata(String ISOCode, String PaymentType,
			String FromYear, String ToYear) throws InterruptedException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		year.sendKeys(FromYear);
		toYear.sendKeys(ToYear);
		resetBtn.click();
		String a = year.getText();
		String b = toYear.getText();
		if (a.isEmpty() && b.isEmpty()) {
			System.out.println("Reset Button functionality is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		currency.click();
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		sl1.selectByVisibleText(PaymentType);
		year.sendKeys(FromYear);
		toYear.sendKeys(ToYear);
		submitBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		CANCELBtn.click();
		String c = message.getText();
		String d = "Create Bulk Calendar";
		if (c.equals(d)) {
			System.out.println("Cancel Button from BulkCalendar screen is working fine");
		} else {
			System.out.println("Cancel button from BulkCalendar screen is not working");
		}
		submitBtn.click();
		confirmBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}

	public CalendarPage addExistingCalendar(String ISOCode, String PaymentType, String FromYear,
			String ToYear) throws InterruptedException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		year.sendKeys(FromYear);
		toYear.sendKeys(ToYear);
		submitBtn.click();
		String a = errormessages.getText();
		String b = "Entered combination for calendar exists, please try again.";
		if (a.equals(b)) {
			System.out.println(
					"Validation message is displayed for Already existing Calendar for " + ISOCode + " currency");
		} else {
			System.out.println("Validation failed for Existing year for " + ISOCode + " currency");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}

	public CalendarPage viewCalendarwithInvaliddata(String ISOCode, String PaymentType, String Month,
			String Year, String Status) throws InterruptedException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		month.click();
		Select sl2 = new Select(month);
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		Select sl3 = new Select(statusfilter);
		sl3.selectByVisibleText(Status);
		collapsemonth.click();
		ResetBtn.click();
		String a = year.getText();
		if (a.isEmpty()) {
			System.out.println("Reset Button functionality is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		currency.click();
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		sl1.selectByVisibleText(PaymentType);
		month.click();
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		sl3.selectByVisibleText(Status);
		collapsemonth.click();
		okBtn.click();
		String b = errormessages.getText();
		String c = "An error occurred while processing the request. Please contact the Help Desk.\r\n"
				+ "Time: 2020-06-02 19:52:54.551, Error: For input string: \"" + Year + "\"";
		String d="No items available for List operation given the search criteria";
		
		String ValidateMsgNew="An error occurred while processing the request. Please contact the Help Desk.";
		
		if(b.contains(ValidateMsgNew)) {
			System.out.println("Validation Message is Displayed for Invalid Year for " + ISOCode + " currency ");
		}
		else if(b.equals(d)) {
			System.out.println("No items available for List operation given the search criteria message is displayed for "+ISOCode+" currency");
		}else{
			System.out.println("Validation failed for " + ISOCode + " currency");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}

	public CalendarPage viewCalendarwithValiddata(String ISOCode, String PaymentType, String Month,
			String Year, String Status) throws InterruptedException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		month.click();
		Select sl2 = new Select(month);
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		Select sl3 = new Select(statusfilter);
		sl3.selectByVisibleText(Status);
		collapsemonth.click();
		ResetBtn.click();
		String a = year.getText();
		if (a.isEmpty()) {
			System.out.println("Reset Button functionality is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		currency.click();
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		sl1.selectByVisibleText(PaymentType);
		month.click();
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		sl3.selectByVisibleText(Status);
		collapsemonth.click();
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String b = verifyCurrency.getText();
		String c = ISOCode;
		if (b.equals(c)) {
			System.out.println("" + ISOCode + " currency is displayed in list");
		} else {
			System.out.println("" + ISOCode + " currency is not displayed in list");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}

	public CalendarPage modifyCalendarwithValiddata(String ISOCode, String PaymentType, String Month,
			String Year, String Daytype) throws InterruptedException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		month.click();
		Select sl2 = new Select(month);
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		collapsemonth.click();
		RESETBtn.click();
		String a = year.getText();
		if (a.isEmpty()) {
			System.out.println("Reset Button functionality is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		currency.click();
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		sl1.selectByVisibleText(PaymentType);
		month.click();
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		collapsemonth.click();
		okBtn.click();
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		daytype.click();
		Select sl3 = new Select(daytype);
		sl3.selectByVisibleText(Daytype);
		cancelBtn.click();
		String b = errormessages.getText();
		String c = "Operation Modify/Repair calendar was cancelled.";
		if (b.equals(c)) {
			System.out.println("Cancel Button is working fine");
		} else {
			System.out.println("Cancel button is not working");
		}
		currency.click();
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		sl1.selectByVisibleText(PaymentType);
		month.click();
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		collapsemonth.click();
		okBtn.click();
		record.click();
		OKBtn.click();
		cancelBtn.click();
		if (b.equals(c)) {
			System.out.println("Cancel Button from Confirm screen is working fine");
		} else {
			System.out.println("Cancel button from Confirm screen is not working");
		}
		currency.click();
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		sl1.selectByVisibleText(PaymentType);
		month.click();
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		collapsemonth.click();
		okBtn.click();
		record.click();
		OKBtn.click();
		OKBTN.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}

	public CalendarPage modifyCalendarwithInvaliddata(String ISOCode, String PaymentType, String Month,
			String Year) throws InterruptedException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		month.click();
		Select sl2 = new Select(month);
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		collapsemonth.click();
		okBtn.click();
		String a=errormessages.getText();
		String b="No items available for Modify operation given the search criteria";
		String c = "An error occurred while processing the request. Please contact the Help Desk.\r\n"
				+ "Time: 2020-06-02 19:52:54.551, Error: For input string: \"" + Year + "\"";
		
		String ValidateMsgNew="An error occurred while processing the request. Please contact the Help Desk.";
		
		if(a.contains(ValidateMsgNew)) {
			System.out.println("Validation Message is Displayed for Invalid Year for " + ISOCode + " currency ");
		}
		else if(a.equals(b)) {
			System.out.println("No items available for Modify operation given the search criteria  validation messages is displayed");
		}else{
			System.out.println("Validation failed for Invalid year for currency " + ISOCode + " currency");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}
	
	public CalendarPage deleteCalendar(String ISOCode, String PaymentType, String Month,
			String Year) throws InterruptedException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		month.click();
		Select sl2 = new Select(month);
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		collapsemonth.click();
		RESETBtn.click();
		String a = year.getText();
		if (a.isEmpty()) {
			System.out.println("Reset Button functionality is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		currency.click();
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		sl1.selectByVisibleText(PaymentType);
		month.click();
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		collapsemonth.click();
		okBtn.click();
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		backtoListBtn.click();
		String b=message.getText();
		String c="Delete a calendar";
		if(b.equals(c)) {
			System.out.println("Back to List button is working fine");
		}else {
			System.out.println("Back to List button is not working");
		}
		record.click();
		removeBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}
	
	public CalendarPage deleteCalendar1(String ISOCode, String PaymentType, String Month,
			String Year) throws InterruptedException {
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		Select sl1 = new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		month.click();
		Select sl2 = new Select(month);
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		collapsemonth.click();
		RESETBtn.click();
		String a = year.getText();
		if (a.isEmpty()) {
			System.out.println("Reset Button functionality is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		currency.click();
		sl.selectByVisibleText(ISOCode);
		paymentType.click();
		sl1.selectByVisibleText(PaymentType);
		month.click();
		sl2.selectByVisibleText(Month);
		year.sendKeys(Year);
		collapsemonth.click();
		okBtn.click();
		String b=errormessages.getText();
		String c="No items available for Remove operation given the search criteria";
		if(b.equals(c)) {
			System.out.println("No items available for List operation given the search criteria messages is displayed for "+ISOCode+" currency");
		}else {
			System.out.println("Validation failed for "+ISOCode+" currency");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CalendarPage();
	}
}
