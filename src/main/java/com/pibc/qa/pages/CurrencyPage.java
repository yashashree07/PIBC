package com.pibc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;

public class CurrencyPage extends TestBase {

	@FindBy(name = "currencyIsoCode")
	WebElement currencyIsoCode;

	@FindBy(xpath = "//td[@class='HeaderTitle']")
	WebElement verifycurrencyIsoCode;

	@FindBy(name = "currencyUnit")
	WebElement currencyUnit;

	@FindBy(name = "currency1stCutHH")
	WebElement currency1stCutHH;

	@FindBy(name = "currency1stCutMM")
	WebElement currency1stCutMM;

	@FindBy(name = "currency2ndCutHH")
	WebElement currency2ndCutHH;

	@FindBy(name = "currency2ndCutMM")
	WebElement currency2ndCutMM;

	@FindBy(name = "currencyTruncate")
	WebElement currencyTruncate;

	@FindBy(name = "currencyHoliPos")
	WebElement currencyHoliPos;

	@FindBy(name = "currencyConvRateSignificance")
	WebElement currencyConvRateSignificance;

	@FindBy(name = "convRateTolerance")
	WebElement convRateTolerance;

	@FindBy(name = "org.apache.struts.taglib.html.CANCEL")
	WebElement cancelBtn;

	@FindBy(xpath = "//p[@class='errormessages']")
	WebElement errormessages;

	@FindBy(xpath = "//a[contains(text(),'Restart Workflow')]")
	WebElement restartWorkflow;

	@FindBy(name = "backToList")
	WebElement backToListBtn;

	@FindBy(name = "status")
	WebElement status;

	@FindBy(xpath = "//tbody//input[2]")
	WebElement resetBtn;

	@FindBy(name = "back")
	WebElement backBtn;

	@FindBy(xpath = "//p[@class='label']")
	WebElement message;

	@FindBy(id = "submitButton")
	WebElement nextBtn;
	
	@FindBy(xpath="//tbody//input[3]")
	WebElement NEXTBtn;

	@FindBy(name = "ok")
	WebElement okBtn;

	@FindBy(xpath = "//input[3]")
	WebElement OKBtn;

	@FindBy(id = "logoutButtonId")
	WebElement logOutBtn;

	@FindBy(xpath = "//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button")
	WebElement logoutBtn;

	public CurrencyPage() {
		PageFactory.initElements(driver, this);
	}

	public CurrencyPage addCurrencywithBlankdata(String ISOCode, String CurrencyUnit,
			String firstCutoffHH, String firstCutoffMM, String secondCutoffHH, String secondCutoffMM,
			String TruncateConversion, String HolidayPoisition, String ConvRate, String ConvTolerance)
			throws InterruptedException {
		Thread.sleep(IntfConstants.TIMEOUT);
		currencyIsoCode.click();
		Select sl=new Select(currencyIsoCode);
		sl.selectByVisibleText(ISOCode);
		currencyUnit.sendKeys(CurrencyUnit);
		currency1stCutHH.click();
		Select sl1 = new Select(currency1stCutHH);
		sl1.selectByVisibleText(firstCutoffHH);
		currency1stCutMM.click();
		Select sl2 = new Select(currency1stCutMM);
		sl2.selectByVisibleText(firstCutoffMM);
		currency2ndCutHH.click();
		Select sl3 = new Select(currency2ndCutHH);
		sl3.selectByVisibleText(secondCutoffHH);
		currency2ndCutMM.click();
		Select sl4 = new Select(currency2ndCutMM);
		sl4.selectByVisibleText(secondCutoffMM);
		currencyTruncate.click();
		Select sl5=new Select(currencyTruncate);
		sl5.selectByVisibleText(TruncateConversion);
		currencyHoliPos.click();
		Select sl6=new Select(currencyHoliPos);
		sl6.selectByVisibleText(HolidayPoisition);
		currencyConvRateSignificance.sendKeys(ConvRate);
		convRateTolerance.sendKeys(ConvTolerance);
		nextBtn.click();
		String a = errormessages.getText();
		String b = "Currency Unit Not Entered or Invalid";
		String c = "Required 1st Cutoff HH";
		String d = "Required 1st Cutoff MM";
		String e = "Required 2nd Cutoff HH";
		String f = "Required 2nd Cutoff MM";
		String g = "Truncate Conversion not selected";
		String h = "Currency Holiday Position required";
		String i = "Conv. Rate Significant Digits required";
		String j = "Invalid Conversation Rate Tolerance";
		if (a.equals(b)) {
			System.out.println("Validation is proper for Currency Unit for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.contains(c)) {
			System.out.println("Validation is proper for firstCutoffHH for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.contains(d)) {
			System.out.println("Validation is proper for firstCutoffMM for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.contains(e)) {
			System.out.println("Validation is proper for secondCutoffHH for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.contains(f)) {
			System.out.println("Validation is proper for secondCutoffMM for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.equals(g)) {
			System.out.println("Validation is proper for TruncateConversion for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.equals(h)) {
			System.out.println("Validation is proper for HolidayPoisition for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.equals(i)) {
			System.out.println("Validation is proper for ConvRate for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.equals(j)) {
			System.out.println("Validation is proper for ConvTolerance for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else {
			System.out.println("Validation failed for Blank data for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		}
		return new CurrencyPage();
	}

	public CurrencyPage addCurrencywithInvaliddata(String ISOCode, String CurrencyUnit,
			String firstCutoffHH, String firstCutoffMM, String secondCutoffHH, String secondCutoffMM,
			String TruncateConversion, String HolidayPoisition, String ConvRate, String ConvTolerance)
			throws InterruptedException {
		currencyIsoCode.click();
		Select sl=new Select(currencyIsoCode);
		sl.selectByVisibleText(ISOCode);
		currencyUnit.sendKeys(CurrencyUnit);
		currency1stCutHH.click();
		Select sl1 = new Select(currency1stCutHH);
		sl1.selectByVisibleText(firstCutoffHH);
		currency1stCutMM.click();
		Select sl2 = new Select(currency1stCutMM);
		sl2.selectByVisibleText(firstCutoffMM);
		currency2ndCutHH.click();
		Select sl3 = new Select(currency2ndCutHH);
		sl3.selectByVisibleText(secondCutoffHH);
		currency2ndCutMM.click();
		Select sl4 = new Select(currency2ndCutMM);
		sl4.selectByVisibleText(secondCutoffMM);
		currencyTruncate.click();
		Select sl5=new Select(currencyTruncate);
		sl5.selectByVisibleText(TruncateConversion);
		currencyHoliPos.click();
		Select sl6=new Select(currencyHoliPos);
		sl6.selectByVisibleText(HolidayPoisition);
		currencyConvRateSignificance.sendKeys(ConvRate);
		convRateTolerance.sendKeys(ConvTolerance);
		nextBtn.click();
		String a = errormessages.getText();
		String b = "Currency Unit Not Entered or Invalid";
		String c = "Invalid Conv. Rate Significant Digits, expected numeric";
		String d = "Invalid Conversation Rate Tolerance";
		if (a.equals(b)) {
			System.out.println("Validation is proper for Currency Unit for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.equals(c)) {
			System.out.println("Validation is proper for ConvRate for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.equals(d)) {
			System.out.println("Validation is proper for ConvTolerance for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else {
			System.out.println("Validation failed for Invalid data for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		}
		return new CurrencyPage();

	}

	public CurrencyPage addCurrencywithValiddata(String ISOCode, String CurrencyUnit,
			String firstCutoffHH, String firstCutoffMM, String secondCutoffHH, String secondCutoffMM,
			String TruncateConversion, String HolidayPoisition, String ConvRate, String ConvTolerance)
			throws InterruptedException {
		Thread.sleep(IntfConstants.TIMEOUT);
		cancelBtn.click();
		String a = errormessages.getText();
		String b = "Operation Add Currency was cancelled.";
		if (a.equals(b)) {
			System.out.println("Cancel operation executed successully");
		} else {
			System.out.println("Cancel Button is not working");
		}
		restartWorkflow.click();
		currencyIsoCode.click();
		Select sl=new Select(currencyIsoCode);
		sl.selectByVisibleText(ISOCode);
		currencyUnit.sendKeys(CurrencyUnit);
		currency1stCutHH.click();
		Select sl1 = new Select(currency1stCutHH);
		sl1.selectByVisibleText(firstCutoffHH);
		currency1stCutMM.click();
		Select sl2 = new Select(currency1stCutMM);
		sl2.selectByVisibleText(firstCutoffMM);
		currency2ndCutHH.click();
		Select sl3 = new Select(currency2ndCutHH);
		sl3.selectByVisibleText(secondCutoffHH);
		currency2ndCutMM.click();
		Select sl4 = new Select(currency2ndCutMM);
		sl4.selectByVisibleText(secondCutoffMM);
		currencyTruncate.click();
		Select sl5= new Select(currencyTruncate);
		sl5.selectByVisibleText(TruncateConversion);
		currencyHoliPos.click();
		Select sl6=new Select(currencyHoliPos);
		sl6.selectByVisibleText(HolidayPoisition);
		currencyConvRateSignificance.sendKeys(ConvRate);
		convRateTolerance.sendKeys(ConvTolerance);
		resetBtn.click();
		String c = currencyUnit.getText();
		String d = currencyConvRateSignificance.getText();
		String e = convRateTolerance.getText();
		if (c.isEmpty() && d.isEmpty() && e.isEmpty()) {
			System.out.println("Reset Button is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		currencyIsoCode.click();
		sl.selectByVisibleText(ISOCode);
		currencyUnit.sendKeys(CurrencyUnit);
		currency1stCutHH.click();
		sl1.selectByVisibleText(firstCutoffHH);
		currency1stCutMM.click();
		sl2.selectByVisibleText(firstCutoffMM);
		currency2ndCutHH.click();
		sl3.selectByVisibleText(secondCutoffHH);
		currency2ndCutMM.click();
		sl4.selectByVisibleText(secondCutoffMM);
		currencyTruncate.click();
		sl5.selectByVisibleText(TruncateConversion);
		currencyHoliPos.click();
		sl6.selectByVisibleText(HolidayPoisition);
		currencyConvRateSignificance.sendKeys(ConvRate);
		convRateTolerance.sendKeys(ConvTolerance);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		nextBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		backBtn.click();
		String f = message.getText();
		String g = "Add Currency";
		if (f.equals(g)) {
			System.out.println("Back button functionality working fine");
		} else {
			System.out.println("Back button is not working");
		}
		nextBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		if (a.equals(b)) {
			System.out.println("Cancel button from Confirm Screen working fine");
		} else {
			System.out.println("Cancel Button is not working");
		}
		restartWorkflow.click();
		currencyIsoCode.click();
		sl.selectByVisibleText(ISOCode);
		currencyUnit.sendKeys(CurrencyUnit);
		currency1stCutHH.click();
		sl1.selectByVisibleText(firstCutoffHH);
		currency1stCutMM.click();
		sl2.selectByVisibleText(firstCutoffMM);
		currency2ndCutHH.click();
		sl3.selectByVisibleText(secondCutoffHH);
		currency2ndCutMM.click();
		sl4.selectByVisibleText(secondCutoffMM);
		currencyTruncate.click();
		sl5.selectByVisibleText(TruncateConversion);
		currencyHoliPos.click();
		sl6.selectByVisibleText(HolidayPoisition);
		currencyConvRateSignificance.sendKeys(ConvRate);
		convRateTolerance.sendKeys(ConvTolerance);
		nextBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CurrencyPage();
	}

	public CurrencyPage approveCurrency(String ISOCode) throws InterruptedException {
		currencyIsoCode.click();
		Select sl = new Select(currencyIsoCode);
		sl.selectByVisibleText(ISOCode);
		resetBtn.click();
		String a = currencyIsoCode.getText();
		if (a.isEmpty()) {
			System.out.println("Reset Button functionality is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		restartWorkflow.click();
		currencyIsoCode.click();
		sl.selectByVisibleText(ISOCode);
		OKBtn.click();
		cancelBtn.click();
		String b = errormessages.getText();
		String c = "Operation Approve Currency was cancelled.";
		if (b.equals(c)) {
			System.out.println("Cancel button from Approve screen is working fine");
		} else {
			System.out.println("Cancel Button is not working");
		}
		restartWorkflow.click();
		currencyIsoCode.click();
		sl.selectByVisibleText(ISOCode);
		OKBtn.click();
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CurrencyPage();
	}

	public CurrencyPage listCurrency(String ISOCode, String Status, String Description)
			throws InterruptedException {
		currencyIsoCode.click();
		Select sl = new Select(currencyIsoCode);
		sl.selectByVisibleText(ISOCode);
		status.click();
		Select sl1 = new Select(status);
		sl1.selectByVisibleText(Status);
		resetBtn.click();
		String a = currencyIsoCode.getText();
		if (a.isEmpty()) {
			System.out.println("Reset Button functionality is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		currencyIsoCode.click();
		sl.selectByVisibleText(ISOCode);
		status.click();
		sl1.selectByVisibleText(Status);
		OKBtn.click();
		String b = verifycurrencyIsoCode.getText();
		String c = "Currency :  " + Description + "";
		System.out.println(b);
		System.out.println(c);
		if (b.equals(c)) {
			System.out.println("" + ISOCode + " is displayed in list");
		} else {
			System.out.println("" + ISOCode + " is not displayed in list");
		}
		backToListBtn.click();
		String d = message.getText();
		String e = "List Currency";
		if (d.equals(e)) {
			System.out.println("Back to List Button is working fine");
		} else {
			System.out.println("Back to List Button is not working");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CurrencyPage();
	}

	public CurrencyPage listCurrency1() throws InterruptedException {
		String a=errormessages.getText();
		String b="No items available for List operation given the search criteria";
		if(a.equals(b)) {
			System.out.println("No items available for List operation given the search criteria messages is diaplyed on screen");
		}else {
			System.out.println("Valiidation failed when listing deleted currency");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CurrencyPage();
	}
	
	public CurrencyPage listCurrencyInvalidcriteria(String ISOCode, String Status)
			throws InterruptedException {
		currencyIsoCode.click();
		Select sl = new Select(currencyIsoCode);
		sl.selectByVisibleText(ISOCode);
		status.click();
		Select sl1 = new Select(status);
		sl1.selectByVisibleText(Status);
		resetBtn.click();
		String a = currencyIsoCode.getText();
		if (a.isEmpty()) {
			System.out.println("Reset Button functionality is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		currencyIsoCode.click();
		sl.selectByVisibleText(ISOCode);
		status.click();
		sl1.selectByVisibleText(Status);
		OKBtn.click();
		String b = errormessages.getText();
		String c = "No items available for List operation given the search criteria";
		if (b.equals(c)) {
			System.out.println(
					"No items available for List operation given the search criteria validation message is displayed properly");
		} else {
			System.out.println("Validation failed for Invalid Currency criteria");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CurrencyPage();
	}

	public CurrencyPage deleteCurrency(String ISOCode,String Description) throws InterruptedException {
		currencyIsoCode.click();
		Select sl = new Select(currencyIsoCode);
		sl.selectByVisibleText(ISOCode);
		resetBtn.click();
		String a = currencyIsoCode.getText();
		if (a.isEmpty()) {
			System.out.println("Reset Button functionality is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		currencyIsoCode.click();
		sl.selectByVisibleText(ISOCode);
		OKBtn.click();
		String b=message.getText();
		String c="Confirm Delete Currency";
		if(b.equals(c)) {
			System.out.println("Confirm Delete Currency Screen is displayed");
		}else {
			System.out.println("Confirm Delete Currency is not displayed");
		}
		String d = verifycurrencyIsoCode.getText();
		String e = "Currency :  " + Description + "";
		if (d.equals(e)) {
			System.out.println("" + ISOCode + " is displayed on screen");
		} else {
			System.out.println("" + ISOCode + " is not displayed on screen");
		}
		cancelBtn.click();
		String f = errormessages.getText();
		String g = "Operation Delete Currency was cancelled.";
		if (f.equals(g)) {
			System.out.println("Cancel button from Delete screen is working fine");
		} else {
			System.out.println("Cancel Button is not working");
		}
		restartWorkflow.click();
		currencyIsoCode.click();
		sl.selectByVisibleText(ISOCode);
		OKBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CurrencyPage();
	}
	
	public CurrencyPage modifyCurrency(String ISOCode,String CurrencyUnit,String firstCutoffHH,String firstCutoffMM,String secondCutoffHH,String secondCutoffMM,String TruncateConversion,String HolidayPoisition,String ConvRate,String ConvTolerance) throws InterruptedException {
		currencyIsoCode.click();
		Select sl = new Select(currencyIsoCode);
		sl.selectByVisibleText(ISOCode);
		resetBtn.click();
		String a = currencyIsoCode.getText();
		if (a.isEmpty()) {
			System.out.println("Reset Button functionality is working fine");
		} else {
			System.out.println("Reset Button is not working");
		}
		currencyIsoCode.click();
		sl.selectByVisibleText(ISOCode);
		OKBtn.click();
		String b=message.getText();
		String c="Modify Currency";
		if(b.equals(c)) {
			System.out.println("Modify Currency Screen is displayed");
		}else {
			System.out.println("Modify Currency Screen is not displayed");
		}
		currencyUnit.sendKeys(CurrencyUnit);
		currency1stCutHH.click();
		Select sl1 = new Select(currency1stCutHH);
		sl1.selectByVisibleText(firstCutoffHH);
		currency1stCutMM.click();
		Select sl2 = new Select(currency1stCutMM);
		sl2.selectByVisibleText(firstCutoffMM);
		currency2ndCutHH.click();
		Select sl3 = new Select(currency2ndCutHH);
		sl3.selectByVisibleText(secondCutoffHH);
		currency2ndCutMM.click();
		Select sl4 = new Select(currency2ndCutMM);
		sl4.selectByVisibleText(secondCutoffMM);
		currencyTruncate.click();
		Select sl5=new Select(currencyTruncate);
		sl5.selectByVisibleText(TruncateConversion);
		currencyHoliPos.click();
		Select sl6=new Select(currencyHoliPos);
		sl6.selectByVisibleText(HolidayPoisition);
		currencyConvRateSignificance.sendKeys(ConvRate);
		convRateTolerance.sendKeys(ConvTolerance);
		cancelBtn.click();
		String d = errormessages.getText();
		String e = "Operation Modify Currency was cancelled.";
		if (d.equals(e)) {
			System.out.println("Cancel button from Modify screen is working fine");
		} else {
			System.out.println("Cancel Button from Modify screen is not working");
		}
		restartWorkflow.click();
		currencyIsoCode.click();
		sl.selectByVisibleText(ISOCode);
		OKBtn.click();
		currencyUnit.sendKeys(CurrencyUnit);
		currency1stCutHH.click();
		sl1.selectByVisibleText(firstCutoffHH);
		currency1stCutMM.click();
		sl2.selectByVisibleText(firstCutoffMM);
		currency2ndCutHH.click();
		sl3.selectByVisibleText(secondCutoffHH);
		currency2ndCutMM.click();
		sl4.selectByVisibleText(secondCutoffMM);
		currencyTruncate.click();
		sl5.selectByVisibleText(TruncateConversion);
		currencyHoliPos.click();
		sl6.selectByVisibleText(HolidayPoisition);
		currencyConvRateSignificance.sendKeys(ConvRate);
		convRateTolerance.sendKeys(ConvTolerance);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		NEXTBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		backBtn.click();
		String f = message.getText();
		String g = "Modify Currency";
		if (f.equals(g)) {
			System.out.println("Back button functionality working fine");
		} else {
			System.out.println("Back button is not working");
		}
		NEXTBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		if (a.equals(b)) {
			System.out.println("Cancel button from Confirm Screen working fine");
		} else {
			System.out.println("Cancel Button is not working");
		}
		restartWorkflow.click();
		currencyIsoCode.click();
		currencyIsoCode.sendKeys(ISOCode);
		OKBtn.click();
		currencyUnit.sendKeys(CurrencyUnit);
		currency1stCutHH.click();
		sl1.selectByVisibleText(firstCutoffHH);
		currency1stCutMM.click();
		sl2.selectByVisibleText(firstCutoffMM);
		currency2ndCutHH.click();
		sl3.selectByVisibleText(secondCutoffHH);
		currency2ndCutMM.click();
		sl4.selectByVisibleText(secondCutoffMM);
		currencyTruncate.click();
		sl5.selectByVisibleText(TruncateConversion);
		currencyHoliPos.click();
		sl6.selectByVisibleText(HolidayPoisition);
		currencyConvRateSignificance.sendKeys(ConvRate);
		convRateTolerance.sendKeys(ConvTolerance);
		NEXTBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new CurrencyPage();
	}
	
	public CurrencyPage modifyCurrencywithInvalidddata(String ISOCode, String CurrencyUnit,
			String firstCutoffHH, String firstCutoffMM, String secondCutoffHH, String secondCutoffMM,
			String TruncateConversion, String HolidayPoisition, String ConvRate, String ConvTolerance) throws InterruptedException {
		currencyIsoCode.click();
		currencyIsoCode.sendKeys(ISOCode);
		OKBtn.click();
		currencyUnit.clear();
		currencyUnit.sendKeys(CurrencyUnit);
		currency1stCutHH.click();
		Select sl = new Select(currency1stCutHH);
		sl.selectByVisibleText(firstCutoffHH);
		currency1stCutMM.click();
		Select sl1 = new Select(currency1stCutMM);
		sl1.selectByVisibleText(firstCutoffMM);
		currency2ndCutHH.click();
		Select sl2 = new Select(currency2ndCutHH);
		sl2.selectByVisibleText(secondCutoffHH);
		currency2ndCutMM.click();
		Select sl3 = new Select(currency2ndCutMM);
		sl3.selectByVisibleText(secondCutoffMM);
		currencyTruncate.sendKeys(TruncateConversion);
		currencyHoliPos.sendKeys(HolidayPoisition);
		currencyConvRateSignificance.clear();
		currencyConvRateSignificance.sendKeys(ConvRate);
		convRateTolerance.clear();
		convRateTolerance.sendKeys(ConvTolerance);
		NEXTBtn.click();
		String a = errormessages.getText();
		String b = "Currency Unit Not Entered or Invalid";
		String c = "Invalid Conv. Rate Significant Digits, expected numeric";
		String d = "Invalid Conversation Rate Tolerance";
		if (a.equals(b)) {
			System.out.println("Validation is proper for Currency Unit for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.equals(c)) {
			System.out.println("Validation is proper for ConvRate for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.equals(d)) {
			System.out.println("Validation is proper for ConvTolerance for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		}
		else if(a.contains(c) && a.contains(d) && a.contains(b)) {
			System.out.println("Validation Message is proper for ConvRate,ConvTolerance and Currency Unit " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		}	
		else {
			System.out.println("Validation failed for Invalid data for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		}
		return new CurrencyPage();
	}
	
	public CurrencyPage modifyCurrencywithBlankdata(String ISOCode, String CurrencyUnit,
			String firstCutoffHH, String firstCutoffMM, String secondCutoffHH, String secondCutoffMM,
			String TruncateConversion, String HolidayPoisition, String ConvRate, String ConvTolerance) throws InterruptedException {
		currencyIsoCode.click();
		currencyIsoCode.sendKeys(ISOCode);
		OKBtn.click();
		currencyUnit.clear();
		currencyUnit.sendKeys(CurrencyUnit);
		currency1stCutHH.click();
		Select sl = new Select(currency1stCutHH);
		sl.selectByVisibleText(firstCutoffHH);
		currency1stCutMM.click();
		Select sl1 = new Select(currency1stCutMM);
		sl1.selectByVisibleText(firstCutoffMM);
		currency2ndCutHH.click();
		Select sl2 = new Select(currency2ndCutHH);
		sl2.selectByVisibleText(secondCutoffHH);
		currency2ndCutMM.click();
		Select sl3 = new Select(currency2ndCutMM);
		sl3.selectByVisibleText(secondCutoffMM);
		currencyTruncate.click();
		Select sl4=new Select(currencyTruncate);
		sl4.selectByVisibleText(TruncateConversion);
		currencyHoliPos.click();
		Select sl5=new Select(currencyHoliPos);
		sl5.selectByVisibleText(HolidayPoisition);
		currencyConvRateSignificance.clear();
		currencyConvRateSignificance.sendKeys(ConvRate);
		convRateTolerance.clear();
		convRateTolerance.sendKeys(ConvTolerance);
		NEXTBtn.click();
		String a = errormessages.getText();
		String b = "Currency Unit Not Entered or Invalid";
		String c = "Required 1st Cutoff HH";
		String d = "Required 1st Cutoff MM";
		String e = "Required 2nd Cutoff HH";
		String f = "Required 2nd Cutoff MM";
		String g = "Truncate Conversion not selected";
		String h = "Currency Holiday Position required";
		String i = "Conv. Rate Significant Digits required";
		String j = "Invalid Conversation Rate Tolerance";
		if (a.equals(b)) {
			System.out.println("Validation is proper for Currency Unit for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.contains(c)) {
			System.out.println("Validation is proper for firstCutoffHH for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.contains(d)) {
			System.out.println("Validation is proper for firstCutoffMM for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.contains(e)) {
			System.out.println("Validation is proper for secondCutoffHH for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.contains(f)) {
			System.out.println("Validation is proper for secondCutoffMM for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.equals(g)) {
			System.out.println("Validation is proper for TruncateConversion for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.equals(h)) {
			System.out.println("Validation is proper for HolidayPoisition for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.equals(i)) {
			System.out.println("Validation is proper for ConvRate for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else if (a.equals(j)) {
			System.out.println("Validation is proper for ConvTolerance for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		} else {
			System.out.println("Validation failed for Blank data for " + ISOCode + " currency");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		}
		return new CurrencyPage();
	}
}
