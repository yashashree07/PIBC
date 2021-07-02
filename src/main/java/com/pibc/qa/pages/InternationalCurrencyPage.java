package com.pibc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;

public class InternationalCurrencyPage extends TestBase{

	@FindBy(name="intCurrencyCode")
	WebElement intCurrencyCode;
	
	@FindBy(name="intCountryCode")
	WebElement intCountryCode;
	
	@FindBy(name="intCurrencyName")
	WebElement intCurrencyName;
	
	@FindBy(name="intCurrencyFractions")
	WebElement intCurrencyFractions;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[4]/td/input[1]")
	WebElement resetBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/form/table/tbody/tr/td/table/tbody/tr[4]/td/input[2]")
	WebElement OKBtn;
	
	@FindBy(xpath="//tr[2]//td[2]")
	WebElement elementEUR;
	
	@FindBy(xpath="//td[contains(text(),'USD')]")
	WebElement elementUSD;
	
	@FindBy(xpath="//td[contains(text(),'JOD')]")
	WebElement elementJOD;
	
	@FindBy(xpath="//td[contains(text(),'ILS')]")
	WebElement elementILS;
	
	@FindBy(xpath="//input[@name='cancel']")
	WebElement cancelBtn;
	
	@FindBy(xpath="//p[@class='errormessages']")
	WebElement errormessages;
	
	@FindBy(xpath="//input[6]")
	WebElement addBtn;
	
	@FindBy(xpath="//input[6]")
	WebElement addConfirmBtn;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement validateCurrencyCodefield;
	
	@FindBy(xpath="//p[@class='label']")
	WebElement validationmessageforlist;
	
	@FindBy(id="logoutButtonId")
	WebElement logOutBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button/img")
	WebElement logoutBtn;
	
	public InternationalCurrencyPage() {
		PageFactory.initElements(driver, this);
	}

	public InternationalCurrencyPage entervaliddata(String CurrencyCODE,String CountryCode,String CurrencyName) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		intCurrencyCode.click();
		Select sl=new Select(intCurrencyCode);
		sl.selectByVisibleText(CurrencyCODE);
		intCountryCode.sendKeys(CountryCode);
		intCurrencyName.sendKeys(CurrencyName);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		resetBtn.click();
		String a=intCountryCode.getText();
		String b=intCurrencyName.getText();
		if(a.isEmpty()&&b.isEmpty()) {
			System.out.println("Reset Button is working fine");
		}
		else {
			System.out.println("Reset Button is not working");
		}
		intCurrencyCode.click();
		Select sl1=new Select(intCurrencyCode);
		sl1.selectByVisibleText(CurrencyCODE);
		intCountryCode.sendKeys(CountryCode);
		intCurrencyName.sendKeys(CurrencyName);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		OKBtn.click();
		if(CurrencyCODE.equals("EUR")) {
		String c=validateCurrencyCodefield.getText();
		if(c.equals(CurrencyCODE)) {
			System.out.println("EUR Currency is displayed in list");
		}
		else {
			System.out.println("EUR Currency is not displayed in list");
		}
		}
		if(CurrencyCODE.equals("ILS")) {
			String d=validateCurrencyCodefield.getText();
			if(d.equals(CurrencyCODE)) {
				System.out.println("ILS Currency is displayed in list");
			}
			else {
				System.out.println("ILS Currency is not displayed in list");
			}
		}
		if(CurrencyCODE.equals("JOD")) {
			String e=validateCurrencyCodefield.getText();
			if(e.equals(CurrencyCODE)) {
				System.out.println("JOD Currency is displayed in list");
			}
			else {
				System.out.println("JOD Currency is not displayed in list");
			}
		}
		if(CurrencyCODE.equals("USD")) {
			String f=validateCurrencyCodefield.getText();
			if(f.equals(CurrencyCODE)) {
				System.out.println("USD Currency is displayed in list");
			}
			else {
				System.out.println("USD Currency is not displayed in list");
			}
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new InternationalCurrencyPage();
	}
	
	public InternationalCurrencyPage enterinvaliddata(String CountryCode,String CurrencyName) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		intCountryCode.sendKeys(CountryCode);
		intCurrencyName.sendKeys(CurrencyName);
		OKBtn.click();
		String a=validationmessageforlist.getText();
		String b="No items available for List operation given the search criteria";
		if(a.equals(b)) {
			System.out.println("Validation message is displayed for Invalid fields");
		}
		else
		{
			System.out.println("Validation failed for Invalid fields");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new InternationalCurrencyPage();
	}
	
	public InternationalCurrencyPage addvalidCurrencydata(String CurrencyCODE,String CountryCode,String CurrencyName,String CurrencyFractions) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		intCurrencyCode.sendKeys(CurrencyCODE);
		intCountryCode.sendKeys(CountryCode);
		intCurrencyName.sendKeys(CurrencyName);
		resetBtn.click();
		String a=intCurrencyCode.getText();
		String b=intCountryCode.getText();
		String c=intCurrencyName.getText();
		if(a.isEmpty() && b.isEmpty() && c.isEmpty()) {
			System.out.println("Reset Button functionality is working fine");
		}
		else {
			System.out.println("Reset Button is not working");
		}
		intCurrencyCode.sendKeys(CurrencyCODE);
		intCountryCode.sendKeys(CountryCode);
		intCurrencyName.sendKeys(CurrencyName);
		OKBtn.click();
		cancelBtn.click();
		String d=errormessages.getText();
		String e="Operation Cancelled";
		if(d.equals(e))
		{
			System.out.println("Cancel operation executed successfully");
		}
		else {
			System.out.println("Cancel Button is not working");
		}
		intCurrencyCode.sendKeys(CurrencyCODE);
		intCountryCode.sendKeys(CountryCode);
		intCurrencyName.sendKeys(CurrencyName);
		OKBtn.click();
		intCurrencyFractions.click();
		Select sl=new Select(intCurrencyFractions);
		sl.selectByVisibleText(CurrencyFractions);
		addBtn.click();
		cancelBtn.click();
		if(d.equals(e))
		{
			System.out.println("Cancel Button from Confirm screen is working fine");
		}
		else {
			System.out.println("Cancel Button is not working");
		}
		intCurrencyCode.sendKeys(CurrencyCODE);
		intCountryCode.sendKeys(CountryCode);
		intCurrencyName.sendKeys(CurrencyName);
		OKBtn.click();
		intCurrencyFractions.click();
		Select sl1=new Select(intCurrencyFractions);
		sl1.selectByVisibleText(CurrencyFractions);
		addBtn.click();
		addConfirmBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new InternationalCurrencyPage();
	} 
	
	public InternationalCurrencyPage addinvalidCurrencydata(String CurrencyCODE,String CountryCode,String CurrencyName) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		intCurrencyCode.sendKeys(CurrencyCODE);
		intCountryCode.sendKeys(CountryCode);
		intCurrencyName.sendKeys(CurrencyName);
		OKBtn.click();
		String a=errormessages.getText();
		String b="Missing or Incorrect Currency Code";
		if(a.equals(b)) {
			System.out.println("Validation message is displayed for "+CurrencyCODE+" field");
		}
		else {
			System.out.println("Validation failed for "+CurrencyCODE+" field");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new InternationalCurrencyPage();
	}
	
	public InternationalCurrencyPage blankCurrencydata() throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		OKBtn.click();
		String a=errormessages.getText();
		String b="Missing or Incorrect Currency Code";
		if(a.equals(b)) {
			System.out.println("Validation message is displayed for blank fields");
		}
		else {
			System.out.println("Validation failed for blank fields");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new InternationalCurrencyPage();
	}
}
	
