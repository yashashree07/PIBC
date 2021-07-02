package com.pibc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;

public class OnusPaymentFlow extends TestBase{
	String gpkey = null;
	
	DatabaseIntegrity DI = new DatabaseIntegrity();
	
	@FindBy(name="chequeNumber")
	WebElement chequeNumber;
	
	@FindBy(name="payerAccount")
	WebElement payerAccount;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/div/table/tbody/tr[2]/td/input[2]")
	WebElement okBtn;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[9]")
	WebElement chequeType;
	
	@FindBy(xpath="//tr[2]//td[10]")
	WebElement chequedataentrystatus;
	
	@FindBy(id = "btnAll")
	WebElement getAllBtn;
	
	@FindBy(name = "content(reference)")
	WebElement chequeno;

	@FindBy(xpath = "//tr[@class='rowcoloreven']")
	WebElement record;
	
	@FindBy(name = "content(startaccountNumber)")
	WebElement accountNumber;

	@FindBy(name = "payTranPrim")
	WebElement gpKey;
	
	@FindBy(name = "content(messageKey)")
	WebElement entergpkey;

	@FindBy(xpath = "//button[contains(text(),'ack to List')]")
	WebElement backtoListBtn;
	
	@FindBy(xpath = "//a[contains(text(),'Restart Workflow')]")
	WebElement restartWorkflow;

	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[19]")
	WebElement status;
	
	@FindBy(name = "content(periodValueDate)")
	WebElement periodValueDate;

	@FindBy(name="content(paymentType)")
	WebElement paymentType;
	
	@FindBy(name = "content(referenceOption)")
	WebElement referenceOption;

	@FindBy(name = "content(referenceTest)")
	WebElement referenceTest;
	
	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;
	
	@FindBy(xpath = "//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[20]")
	WebElement listScreenStatus;

	
	public OnusPaymentFlow() {
		PageFactory.initElements(driver, this);
	}
	
	public void filterScreen(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo,
			String AccountNumber) throws InterruptedException {
		Select sl = new Select(periodValueDate);
		sl.selectByVisibleText(ValueDateperiod);
		Select sl1=new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		Select sl2 = new Select(referenceOption);
		sl2.selectByVisibleText(Reference);
		Select sl3 = new Select(referenceTest);
		sl3.selectByVisibleText(SubRef);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequeno.clear();
		chequeno.sendKeys(ChequeNo);
		accountNumber.clear();
		accountNumber.sendKeys(AccountNumber);
		getAllBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		record.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		gpkey = gpKey.getAttribute("Value");
		System.out.println(gpkey);
	}

	public void filterScreen1(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo,
			String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Select sl = new Select(periodValueDate);
		sl.selectByVisibleText(ValueDateperiod);
		Select sl1=new Select(paymentType);
		sl1.selectByVisibleText(PaymentType);
		Select sl2 = new Select(referenceOption);
		sl2.selectByVisibleText(Reference);
		Select sl3 = new Select(referenceTest);
		sl3.selectByVisibleText(SubRef);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequeno.clear();
		chequeno.sendKeys(ChequeNo);
		accountNumber.clear();
		accountNumber.sendKeys(AccountNumber);
		getAllBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
	}

	public void filterwithGpkey(String ValueDateperiod,String PaymentType, String Reference, String SubRef, String ChequeNo,
			String AccountNumber) throws InterruptedException {
		if (null == gpkey) {
			filterScreen(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		backtoListBtn.click();
	}
	
	public OnusPaymentFlow checkChequeDataEntryStatus(String ChequeNo,String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		chequeNumber.sendKeys(ChequeNo);
		payerAccount.sendKeys(AccountNumber);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		String chequetype=chequeType.getText();
		if(chequetype.equals("VIPCheque")) {
			System.out.println("Cheque Type is VIPCheque");
		}else if(chequetype.equals("NormalCheque")){
			System.out.println("Cheque Type is NormalCheque");
		}
		String chequeentrystatus=chequedataentrystatus.getText();
		System.out.println("Cheque status is in " + chequeentrystatus + "");
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new OnusPaymentFlow();
	}
	
	public OnusPaymentFlow updatetoNormalOnus() {
		DI.getSqlDatabaseConnection(DI.updatePaymentstatus());
		return new OnusPaymentFlow();
	}
	
	public OnusPaymentFlow checkInitialPaymentstatus(String ValueDateperiod,String PaymentType, String Reference,
			String SubRef, String ChequeNo, String AccountNumber) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		filterwithGpkey(ValueDateperiod,PaymentType, Reference, SubRef, ChequeNo, AccountNumber);
		String paymentActualstatus = status.getText();
		System.out.println(paymentActualstatus);
		String expectedStatus = "QueuedToAccountVerification";
		if (expectedStatus.equals(paymentActualstatus)) {
			System.out.println("Payment moved to QueuedToAccountVerification status");
		} else {
			System.out.println("Payment status is in " + paymentActualstatus + "");
		}
		return new OnusPaymentFlow();
	}
	
}
