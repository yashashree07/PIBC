package com.pibc.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;

import io.cucumber.datatable.DataTable;

public class UserAuthorizationMatrixPage extends TestBase {

	@FindBy(name = "content(name)")
	WebElement name;

	@FindBy(name = "content(stages)")
	WebElement stages;

	@FindBy(name = "content(transactionTypes)")
	WebElement transactionTypes;

	@FindBy(name = "ok")
	WebElement SUBMITBtn;

	@FindBy(name = "org.apache.struts.taglib.html.CANCEL")
	WebElement cancelBtn;

	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement errormessages;

	@FindBy(xpath = "//a[contains(text(),'Restart Workflow')]")
	WebElement restartWorkflow;

	@FindBy(id = "btnLocalAdd")
	WebElement addRowBtn;

	@FindBy(id = "inf_content(name)")
	WebElement validatename;

	@FindBy(xpath = "//tbody//input[3]")
	WebElement submitBtn;

	@FindBy(xpath = "//tr[@class='rowcoloreven']")
	WebElement record;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement matrix;
	
	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[3]/td[2]")
	WebElement matrix1;
	
	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[4]/td[2]")
	WebElement matrix2;
	
	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[5]/td[2]")
	WebElement matrix3;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[6]/td[2]")
	WebElement matrix4;
	
	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[7]/td[2]")
	WebElement matrix5;
	
	@FindBy(name = "approve")
	WebElement approveBtn;

	@FindBy(name="approve")
	WebElement deleteBtn;
	
	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;

	public UserAuthorizationMatrixPage() {
		PageFactory.initElements(driver, this);
	}

	public UserAuthorizationMatrixPage addMatrixwithBlankdata() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String a = errormessages.getText();
		String b = "Operation was cancelled.";
		if (a.equals(b)) {
			System.out.println("Cancel operation executed successully");
		} else {
			System.out.println("Cancel Button is not working");
		}
		restartWorkflow.click();
		addRowBtn.click();
		String c = validatename.getText();
		String d = "Please enter the master";
		if (c.contains(d)) {
			System.out.println("Validation message is displayed for Name field on click of Add Row button");
		} else {
			System.out.println("Validation failed for Name field on click of Add Row button");
		}
		restartWorkflow.click();
		submitBtn.click();
		if (c.contains(d)) {
			System.out.println("Validation message is displayed for Name field on click of Submit button");
		} else {
			System.out.println("Validation failed for Name field on click of Submit button");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new UserAuthorizationMatrixPage();
	}

	public UserAuthorizationMatrixPage addMatrixdataforOutwardMaker1(DataTable credentials)
			throws InterruptedException {
		List<List<String>> data = credentials.asLists();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String a = errormessages.getText();
		String b = "Operation was cancelled.";
		if (a.equals(b)) {
			System.out.println("Cancel operation executed successully");
		} else {
			System.out.println("Cancel Button is not working");
		}
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		name.sendKeys(data.get(0).get(0));
		Select sl = new Select(stages);
		sl.selectByVisibleText(data.get(0).get(1));
		Select sl1 = new Select(transactionTypes);
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(2));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(3));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(4));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(5));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(6));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(7));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(8));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		submitBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		if (a.equals(b)) {
			System.out.println("Cancel operation from Confirm Screen is executed successully");
		} else {
			System.out.println("Cancel Button from Confirm screen is not working");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		name.sendKeys(data.get(0).get(0));
		sl.selectByVisibleText(data.get(0).get(1));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(2));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(3));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(4));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(5));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(6));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(7));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(8));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		submitBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		SUBMITBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new UserAuthorizationMatrixPage();
	}

	public UserAuthorizationMatrixPage approvematrix() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new UserAuthorizationMatrixPage();
	}

	public UserAuthorizationMatrixPage approvematrix1() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new UserAuthorizationMatrixPage();
	}
	
	public UserAuthorizationMatrixPage addMatrixdataforOutwardChecker1(DataTable credentials)
			throws InterruptedException {
		List<List<String>> data = credentials.asLists();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		name.sendKeys(data.get(0).get(0));
		Select sl = new Select(stages);
		sl.selectByVisibleText(data.get(0).get(1));
		Select sl1 = new Select(transactionTypes);
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(2));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(3));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(4));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(5));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(6));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		submitBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		SUBMITBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new UserAuthorizationMatrixPage();
	}

	public UserAuthorizationMatrixPage addMatrixdataforInwardMaker2(DataTable credentials)
			throws InterruptedException {
		List<List<String>> data = credentials.asLists();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		name.sendKeys(data.get(0).get(0));
		Select sl = new Select(stages);
		sl.selectByVisibleText(data.get(0).get(1));
		Select sl1 = new Select(transactionTypes);
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(2));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(3));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(4));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(5));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(6));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(7));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		submitBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		SUBMITBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new UserAuthorizationMatrixPage();
	}

	public UserAuthorizationMatrixPage addMatrixdataforInwardChecker2(DataTable credentials)
			throws InterruptedException {
		List<List<String>> data = credentials.asLists();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		name.sendKeys(data.get(0).get(0));
		Select sl = new Select(stages);
		sl.selectByVisibleText(data.get(0).get(1));
		Select sl1 = new Select(transactionTypes);
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(2));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(3));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(4));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(5));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(6));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(7));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(8));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		submitBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		SUBMITBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new UserAuthorizationMatrixPage();
	}

	public UserAuthorizationMatrixPage addMatrixdataforOnusMaker3(DataTable credentials)
			throws InterruptedException {
		List<List<String>> data = credentials.asLists();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		name.sendKeys(data.get(0).get(0));
		Select sl = new Select(stages);
		sl.selectByVisibleText(data.get(0).get(1));
		Select sl1 = new Select(transactionTypes);
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(2));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(3));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(4));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(5));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(6));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(7));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(8));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(9));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(10));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(11));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		submitBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		SUBMITBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new UserAuthorizationMatrixPage();
	}

	public UserAuthorizationMatrixPage addMatrixdataforOnusChecker3(DataTable credentials)
			throws InterruptedException {
		List<List<String>> data = credentials.asLists();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		name.sendKeys(data.get(0).get(0));
		Select sl = new Select(stages);
		sl.selectByVisibleText(data.get(0).get(1));
		Select sl1 = new Select(transactionTypes);
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(2));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(3));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(4));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(5));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(6));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(7));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		sl.deselectAll();
		sl.selectByVisibleText(data.get(0).get(8));
		sl1.selectByVisibleText(data.get(1).get(0));
		sl1.selectByVisibleText(data.get(1).get(1));
		sl1.selectByVisibleText(data.get(1).get(2));
		addRowBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		submitBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		SUBMITBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new UserAuthorizationMatrixPage();
	}

	public UserAuthorizationMatrixPage listMatrix(DataTable credentials) throws InterruptedException {
		List<List<String>> data=credentials.asLists();
		String a=matrix.getText();
		String b=matrix1.getText();
		String c=matrix2.getText();
		String d=matrix3.getText();
		String e=matrix4.getText();
		String f=matrix5.getText();
		String g=data.get(0).get(0);
		String h=data.get(0).get(1);
		String i=data.get(0).get(2);
		String j=data.get(0).get(3);
		String k=data.get(0).get(4);
		String l=data.get(0).get(5);
		if(a.equals(g)) {
			System.out.println(""+data.get(0).get(0)+" matrix is displayed in list");
		}
		else{
			System.out.println(""+data.get(0).get(0)+" matrix is not displayed in list");
		}
		if(b.equals(h)){
			System.out.println(""+data.get(0).get(1)+" matrix is displayed in list");
		}
		else{
			System.out.println(""+data.get(0).get(1)+" matrix is not displayed in list");
		}
		if(c.equals(i)){
			System.out.println(""+data.get(0).get(2)+" matrix is displayed in list");
		}else {
			System.out.println(""+data.get(0).get(2)+" matrix is not displayed in list");
		}
		if(d.equals(j)){
			System.out.println(""+data.get(0).get(3)+" matrix is displayed in list");
		}else {
			System.out.println(""+data.get(0).get(3)+" matrix is not displayed in list");
		}
		if(e.equals(k)){
			System.out.println(""+data.get(0).get(4)+" matrix is displayed in list");
		}else {
			System.out.println(""+data.get(0).get(4)+" matrix is not displayed in list");
		}
		if(f.equals(l)){
			System.out.println(""+data.get(0).get(5)+" matrix is displayed in list");
		}else {
			System.out.println(""+data.get(0).get(5)+" matrix is not displayed in list");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new UserAuthorizationMatrixPage();
	}
	
	public UserAuthorizationMatrixPage deleteMatrix() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		matrix.click();
		cancelBtn.click();
		String a = errormessages.getText();
		String b = "Operation was cancelled.";
		if (a.equals(b)) {
			System.out.println("Cancel operation executed successully");
		} else {
			System.out.println("Cancel Button is not working");
		}
		matrix.click();
		deleteBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		matrix.click();
		deleteBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		matrix.click();
		deleteBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		matrix.click();
		deleteBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		matrix.click();
		deleteBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		matrix.click();
		deleteBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new UserAuthorizationMatrixPage();
	}
}
