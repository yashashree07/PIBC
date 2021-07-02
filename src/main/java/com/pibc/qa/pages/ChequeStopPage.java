package com.pibc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;

public class ChequeStopPage extends TestBase {

	@FindBy(name = "content(payee)")
	WebElement issuer;

	@FindBy(name = "content(branchCode)")
	WebElement branchCode;

	@FindBy(name = "content(currency)")
	WebElement currency;

	@FindBy(xpath = "//p[@class='label']")
	WebElement message;

	@FindBy(name = "content(minimumChequeNumber)")
	WebElement minimumChequeNumber;

	@FindBy(name = "content(maximumChequeNumber)")
	WebElement maximumChequeNumber;

	@FindBy(name = "content(accountNumber)")
	WebElement accountNumber;

	@FindBy(name = "org.apache.struts.taglib.html.CANCEL")
	WebElement cancelBtn;

	@FindBy(xpath = "//center//input[2]")
	WebElement resetBtn;

	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement errormessages;

	@FindBy(xpath = "//p[@class='messages']")
	WebElement successmessage;

	@FindBy(xpath = "//a[contains(text(),'Restart Workflow')]")
	WebElement restartWorkflow;

	@FindBy(xpath = "//input[3]")
	WebElement okBtn;

	@FindBy(name = "file")
	WebElement choosefileBtn;

	@FindBy(xpath = "//body[@id='body']//td//td[1]//input[1]")
	WebElement uploadFileBtn;

	@FindBy(name = "approve")
	WebElement approveBtn;

	@FindBy(name = "approve")
	WebElement deleteBtn;

	@FindBy(xpath = "//tr[2]")
	WebElement record;

	@FindBy(xpath = "//button[contains(text(),'ack to List')]")
	WebElement backtoListBtn;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[4]")
	WebElement currencyverify;

	@FindBy(name = "repair")
	WebElement repairBtn;

	@FindBy(name = "ok")
	WebElement submitBtn;

	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;

	public ChequeStopPage() {
		PageFactory.initElements(driver, this);
	}

	public ChequeStopPage addChequeStopentrywithBlankdata(String Issuer, String BranchCode,
			String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber)
			throws InterruptedException {
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
		issuer.click();
		Select sl = new Select(issuer);
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		Select sl1 = new Select(currency);
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		resetBtn.click();
		String c = branchCode.getText();
		String d = minimumChequeNumber.getText();
		String e = maximumChequeNumber.getText();
		String f = accountNumber.getText();
		if (c.isEmpty() && d.isEmpty() && e.isEmpty() && f.isEmpty()) {
			System.out.println("Reset Button is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		issuer.click();
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String g = errormessages.getText();
		String h = "Issuer Required";
		String i = "Currency Required";
		String j = "Either Minimum Cheque Number Or Maximum Cheque Number Required";
		String k = "Either account number is empty or alphanumeric, kindly enter only numbers";
		if (g.equals(h)) {
			System.out.println("Validation message is displayed for Issuer field for " + Currency + "");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (g.equals(i)) {
			System.out.println("Validation message is displayed for Currency is proper");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (g.equals(j)) {
			System.out.println(
					"Validation message is displayed for Minimum and Maximum Cheque number field for " + Currency + "");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (g.equals(k)) {
			System.out.println("Validation message is displayed for Account Number field for " + Currency + "");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else {
			System.out.println("Validation failed for " + Currency + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		}
		return new ChequeStopPage();
	}

	public ChequeStopPage addChequeStopentrywithInvaliddata(String Issuer, String BranchCode,
			String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber)
			throws InterruptedException {
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
		issuer.click();
		Select sl = new Select(issuer);
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		Select sl1 = new Select(currency);
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		resetBtn.click();
		String c = branchCode.getText();
		String d = minimumChequeNumber.getText();
		String e = maximumChequeNumber.getText();
		String f = accountNumber.getText();
		if (c.isEmpty() && d.isEmpty() && e.isEmpty() && f.isEmpty()) {
			System.out.println("Reset Button is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		issuer.click();
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String g = errormessages.getText();
		String h = "Minimum Cheque Number Length Is Invalid";
		String i = "Maximum Cheque Number Length Is Invalid";
		String j = "Account number length is not as given in param constants";
		if (g.equals(h)) {
			System.out.println("Validation message is displayed for Invalid Minimum Cheque Number Length field for "
					+ Currency + "");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (g.equals(i)) {
			System.out.println("Validation message is displayed for Invalid Maximum Cheque Number Length field for "
					+ Currency + "");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (g.equals(j)) {
			System.out.println("Validation message is displayed for Account number field for " + Currency + "");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else {
			System.out.println("Validation failed for " + Currency + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		}
		return new ChequeStopPage();
	}

	public ChequeStopPage addChequeStopentrywithValiddata(String Issuer, String BranchCode,
			String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber)
			throws InterruptedException {
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
		issuer.click();
		Select sl = new Select(issuer);
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		Select sl1 = new Select(currency);
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		resetBtn.click();
		String c = branchCode.getText();
		String d = minimumChequeNumber.getText();
		String e = maximumChequeNumber.getText();
		String f = accountNumber.getText();
		if (c.isEmpty() && d.isEmpty() && e.isEmpty() && f.isEmpty()) {
			System.out.println("Reset Button is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		issuer.click();
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String g = errormessages.getText();
		String h = "Operation was cancelled.";
		if (g.equals(h)) {
			System.out.println("Cancel operation from Confirm screen is executed successully");
		} else {
			System.out.println("Cancel Button is not working");
		}
		issuer.click();
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		submitBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ChequeStopPage();
	}

	public ChequeStopPage addChequeStopentryforalreadyExistingdata(String Issuer, String BranchCode,
			String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber)
			throws InterruptedException {
		issuer.click();
		Select sl = new Select(issuer);
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		Select sl1 = new Select(currency);
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String a = errormessages.getText();
		String b = "Duplicate range for Cheque No";
		if (a.equals(b)) {
			System.out.println("Validation message is displayed for Duplicate cheque entry for " + Currency + "");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else {
			System.out.println("Validation failed for Duplicate Cheque entry for " + Currency + "");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		}
		return new ChequeStopPage();
	}

	public ChequeStopPage approveChequeStopEntry(String Issuer, String BranchCode, String Currency,
			String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		issuer.click();
		Select sl = new Select(issuer);
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		Select sl1 = new Select(currency);
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		resetBtn.click();
		String a = branchCode.getText();
		String b = minimumChequeNumber.getText();
		String c = maximumChequeNumber.getText();
		String d = accountNumber.getText();
		if (a.isEmpty() && b.isEmpty() && c.isEmpty() && d.isEmpty()) {
			System.out.println("Reset Button is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		issuer.click();
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		record.click();
		cancelBtn.click();
		String e = errormessages.getText();
		String f = "Operation was cancelled.";
		if (e.equals(f)) {
			System.out.println("Cancel operation from Confirm screen is executed successully");
		} else {
			System.out.println("Cancel Button from Confirm screen is not working");
		}
		record.click();
		approveBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ChequeStopPage();
	}

	public ChequeStopPage sendtorepairChequeStopEntry(String Issuer, String BranchCode,
			String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber)
			throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		issuer.click();
		Select sl = new Select(issuer);
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		Select sl1 = new Select(currency);
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		resetBtn.click();
		String a = branchCode.getText();
		String b = minimumChequeNumber.getText();
		String c = maximumChequeNumber.getText();
		String d = accountNumber.getText();
		if (a.isEmpty() && b.isEmpty() && c.isEmpty() && d.isEmpty()) {
			System.out.println("Reset Button is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		issuer.click();
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		record.click();
		cancelBtn.click();
		String e = errormessages.getText();
		String f = "Operation was cancelled.";
		if (e.equals(f)) {
			System.out.println("Cancel operation from Confirm screen is executed successully");
		} else {
			System.out.println("Cancel Button from Confirm screen is not working");
		}
		record.click();
		repairBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ChequeStopPage();
	}

	public ChequeStopPage invalidCriteriaforApprove(String Issuer, String BranchCode, String Currency,
			String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		issuer.click();
		Select sl = new Select(issuer);
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		Select sl1 = new Select(currency);
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		String a = errormessages.getText();
		String b = "No items available for Approve operation";
		if (a.equals(b)) {
			System.out.println("Validation messages is displayed for invalid criteria selected for approval for "
					+ Currency + " currency");
		} else {
			System.out.println(
					"Validation failed for invalid criteria selected for approval for " + Currency + " currency");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ChequeStopPage();
	}

	public ChequeStopPage listChequeStopEntrywithInvaliddata(String Issuer, String BranchCode,
			String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber)
			throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		issuer.click();
		Select sl = new Select(issuer);
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		Select sl1 = new Select(currency);
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		resetBtn.click();
		String a = branchCode.getText();
		String b = minimumChequeNumber.getText();
		String c = maximumChequeNumber.getText();
		String d = accountNumber.getText();
		if (a.isEmpty() && b.isEmpty() && c.isEmpty() && d.isEmpty()) {
			System.out.println("Reset Button is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		issuer.click();
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		String e = errormessages.getText();
		String f = "No items available for List operation";
		if (e.equals(f)) {
			System.out.println("Validation messages is displayed for invalid criteria selected for List for " + Currency
					+ " currency");
		} else {
			System.out
					.println("Validation failed for invalid criteria selected for List for " + Currency + " currency");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ChequeStopPage();
	}

	public ChequeStopPage listChequeStopEntrywithValiddata(String Issuer, String BranchCode,
			String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber)
			throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		issuer.click();
		Select sl = new Select(issuer);
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		Select sl1 = new Select(currency);
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		resetBtn.click();
		String a = branchCode.getText();
		String b = minimumChequeNumber.getText();
		String c = maximumChequeNumber.getText();
		String d = accountNumber.getText();
		if (a.isEmpty() && b.isEmpty() && c.isEmpty() && d.isEmpty()) {
			System.out.println("Reset Button is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		issuer.click();
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		record.click();
		backtoListBtn.click();
		String e = message.getText();
		String f = "List";
		if (e.equals(f)) {
			System.out.println("Back to List button is working fine");
		} else {
			System.out.println("Back to List button is not working");
		}
		String g = currencyverify.getText();
		String h = Currency;
		if (g.equals(h)) {
			System.out.println("Cheque Stop entry is displayed in List for " + Currency + " currency");
		} else {
			System.out.println("Cheque Stop entry is not displayed in List for " + Currency + " currency");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ChequeStopPage();
	}

	public ChequeStopPage deleteChequeStopEntrywithInvaliddata(String Issuer, String BranchCode,
			String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber)
			throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		issuer.click();
		Select sl = new Select(issuer);
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		Select sl1 = new Select(currency);
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		resetBtn.click();
		String a = branchCode.getText();
		String b = minimumChequeNumber.getText();
		String c = maximumChequeNumber.getText();
		String d = accountNumber.getText();
		if (a.isEmpty() && b.isEmpty() && c.isEmpty() && d.isEmpty()) {
			System.out.println("Reset Button is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		issuer.click();
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		String e = errormessages.getText();
		String f = "No items available for Delete operation";
		if (e.equals(f)) {
			System.out.println(
					"Validation messages is displayed properly for invalid data for " + Currency + " currency");
		} else {
			System.out.println("Vallidation failed for invalid data for " + Currency + " currency");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ChequeStopPage();
	}

	public ChequeStopPage deleteChequeStopEntrywithinValiddata(String Issuer, String BranchCode,
			String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber)
			throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		issuer.click();
		Select sl = new Select(issuer);
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		Select sl1 = new Select(currency);
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		resetBtn.click();
		String a = branchCode.getText();
		String b = minimumChequeNumber.getText();
		String c = maximumChequeNumber.getText();
		String d = accountNumber.getText();
		if (a.isEmpty() && b.isEmpty() && c.isEmpty() && d.isEmpty()) {
			System.out.println("Reset Button is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		issuer.click();
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String e = errormessages.getText();
		String f = "Operation was cancelled.";
		if (e.equals(f)) {
			System.out.println("Cancel operation executed successully");
		} else {
			System.out.println("Cancel button is not working");
		}
		record.click();
		deleteBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ChequeStopPage();
	}

	public ChequeStopPage listdeletedChequeStopEntry(String Issuer, String BranchCode,
			String Currency, String MinimumChequeNumber, String MaximumChequeNumber, String AccountNumber)
			throws InterruptedException {
		issuer.click();
		Select sl = new Select(issuer);
		sl.selectByVisibleText(Issuer);
		branchCode.sendKeys(BranchCode);
		currency.click();
		Select sl1 = new Select(currency);
		sl1.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		String a = errormessages.getText();
		String b = "No items available for List operation";
		if (a.equals(b)) {
			System.out.println("Cheque Stop entry gets deleted from list for " + Currency + " currency");
		} else {
			System.out.println("Validation failed for deleted Cheque Stop entry for " + Currency + " currency");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ChequeStopPage();
	}

	public ChequeStopPage modifyChequeStopEntry(String Currency, String MinimumChequeNumber, String MaximumChequeNumber,
			String Issuer, String BranchCode, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		currency.click();
		Select sl = new Select(currency);
		sl.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		resetBtn.click();
		String a = minimumChequeNumber.getText();
		String b = maximumChequeNumber.getText();
		if (a.isEmpty() && b.isEmpty()) {
			System.out.println("Reset Button is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		currency.click();
		sl.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		okBtn.click();
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String c = errormessages.getText();
		String d = "Operation was cancelled.";
		if (c.equals(d)) {
			System.out.println("Cancel operation executed successully");
		} else {
			System.out.println("Cancel button is not working");
		}
		record.click();
		issuer.click();
		Select sl1=new Select(issuer);
		sl1.selectByVisibleText(Issuer);
		branchCode.clear();
		branchCode.sendKeys(BranchCode);
		accountNumber.clear();
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		cancelBtn.click();
		if (c.equals(d)) {
			System.out.println("Cancel operation from Confirm screen executed successully");
		} else {
			System.out.println("Cancel button from Confirm screen is not working");
		}
		restartWorkflow.click();
		currency.click();
		sl.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		okBtn.click();
		record.click();
		issuer.click();
		sl1.selectByVisibleText(Issuer);
		branchCode.clear();
		branchCode.sendKeys(BranchCode);
		accountNumber.clear();
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		submitBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ChequeStopPage();
	}

	public ChequeStopPage modifyChequeStopEntrywithInvaliddata(String Currency, String MinimumChequeNumber, String MaximumChequeNumber,
			String Issuer, String BranchCode, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Select sl = new Select(currency);
		currency.click();
		sl.selectByVisibleText(Currency);
		minimumChequeNumber.sendKeys(MinimumChequeNumber);
		maximumChequeNumber.sendKeys(MaximumChequeNumber);
		okBtn.click();
		record.click();
		accountNumber.clear();
		accountNumber.sendKeys(AccountNumber);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String a=errormessages.getText();
		String b = "Account number length is not as given in param constants";
		if (a.equals(b)) {
			System.out.println("Validation message is displayed for Invalid Account Number Length field for "
					+ Currency + "");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		}
			else {
				System.out.println("Vallidation failed for Account number field for "+Currency+"");
				}
		return new ChequeStopPage();
	}
	
	public ChequeStopPage uploadBulkChequeDataEntry(String ChooseFile) throws InterruptedException {
		choosefileBtn.sendKeys(ChooseFile);
		uploadFileBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String a = successmessage.getText();
		String b = "Bulk Stop Cheque Upload Successfull";
		if (a.equals(b)) {
			System.out.println("Bulk Upload gets successfully done");
		} else {
			System.out.println("Bulk Upload gets failed");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ChequeStopPage();
	}

}
