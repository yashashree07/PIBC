package com.pibc.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;

import io.cucumber.datatable.DataTable;

public class ParticipantBankPage extends TestBase{

	@FindBy(name="content(participantBankCode)")
	WebElement swiftCode;
	
	@FindBy(name="content(bankCode)")
	WebElement bankCode;
	
	@FindBy(name="content(name)")
	WebElement name;
	
	@FindBy(name="content(shortName)")
	WebElement shortName;
	
	@FindBy(xpath="//input[3]")
	WebElement OKBtn;
	
	@FindBy(name="content(branchCode)")
	WebElement branchCode;
	
	@FindBy(name="content(bankType)")
	WebElement bankType;
	
	@FindBy(name="org.apache.struts.taglib.html.CANCEL")
	WebElement cancelBtn;
	
	@FindBy(xpath="//center//input[2]")
	WebElement resetBtn;
	
	@FindBy(xpath="//a[contains(text(),'Restart Workflow')]")
	WebElement restartWorkflow;
	
	@FindBy(xpath="//p[@class='errormessages']")
	WebElement errormessages;
	
	@FindBy(xpath="//p[@class='label']")
	WebElement cancelbtnmsg;
	
	@FindBy(xpath="//input[3]")
	WebElement okBtn;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]")
	WebElement revealrecord;
	
	@FindBy(name="approve")
	WebElement approveBtn;

	@FindBy(name="repair")
	WebElement torepairBtn;
	
	@FindBy(name="ok")
	WebElement submitBtn;
	
	@FindBy(xpath="//*[@id=\"LNTablelistable\"]/tbody/tr[2]/td[2]")
	WebElement validatebank;
	
	@FindBy(id="logoutButtonId")
	WebElement logOutBtn;
	
	@FindBy(xpath="//*[@id=\"pageBody\"]/table/tbody/tr/td/form/button/img")
	WebElement logoutBtn;
	
	public ParticipantBankPage() {
		PageFactory.initElements(driver, this);
	}

	public ParticipantBankPage participantBankListwithvaliddata(String SwiftCode,String BankCode,String ShortName) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String a="Operation Cancelled";
		String b=cancelbtnmsg.getText();
		if(a.equals(b))
		{
			System.out.println("Cancel operation executed successfully");
		}
		else {
			System.out.println("Cancel Button is not working");
		}
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		swiftCode.sendKeys(SwiftCode);
		bankCode.sendKeys(BankCode);
		shortName.sendKeys(ShortName);
		String d=swiftCode.getText();
		String e=bankCode.getText();
		String f=shortName.getText();
		resetBtn.click();
		if(d.isEmpty()&& e.isEmpty()&& f.isEmpty()) {
			System.out.println("Reset Button is working properly");
		}
		else {
			System.out.println("Reset Button is not working");
		}
		swiftCode.sendKeys(SwiftCode);
		okBtn.click();
		String g=validatebank.getText();
		String h=SwiftCode;
		if(g.equals(h)) {
			System.out.println(""+SwiftCode+" is displayed in List");
		}
		else {
			System.out.println(""+SwiftCode+" is not displayed in list");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ParticipantBankPage();
	}
	
	public ParticipantBankPage participantBankListwithinvaliddata(String SwiftCode,String BankCode,String ShortName) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String a="Operation Cancelled";
		String b=cancelbtnmsg.getText();
		if(a.equals(b))
		{
			System.out.println("Cancel operation executed successfully");
		}
		else {
			System.out.println("Cancel Button is not working");
		}
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		swiftCode.sendKeys(SwiftCode);
		bankCode.sendKeys(BankCode);
		shortName.sendKeys(ShortName);
		String d=swiftCode.getText();
		String e=bankCode.getText();
		String f=shortName.getText();
		resetBtn.click();
		if(d.isEmpty()&& e.isEmpty()&& f.isEmpty()) {
			System.out.println("Reset Button is working properly");
		}
		else {
			System.out.println("Reset Button is not working");
		}
		swiftCode.sendKeys(SwiftCode);
		bankCode.sendKeys(BankCode);
		shortName.sendKeys(ShortName);
		okBtn.click();
		String g=errormessages.getText();
		String h="No items available for List operation";
		if(g.equals(h)) {
			System.out.println("Validation message is displayed for Invalid fields");
		}
		else {
			System.out.println("Validation failed for Invalid fields");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ParticipantBankPage();
	}
	
	public ParticipantBankPage addvalidParticipantbankdata(String SwiftCode,String BankCode,String Name,String ShortName) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String a=errormessages.getText();
		String b="Operation was cancelled.";
		if(a.equals(b)) {
			System.out.println("Cancel operation executed successfully");
		}
		else {
			System.out.println("Cancel Button is not working");
		}
		restartWorkflow.click();
		swiftCode.sendKeys(SwiftCode);
		bankCode.sendKeys(BankCode);
		name.sendKeys(Name);
		shortName.sendKeys(ShortName);
		resetBtn.click();
		String c=swiftCode.getText();
		String d=bankCode.getText();
		String e=name.getText();
		String f=shortName.getText();
		if(c.isEmpty() && d.isEmpty() && e.isEmpty() && f.isEmpty()) {
			System.out.println("Reset Button is working properly");
		}
		else {
			System.out.println("Reset Button is not working");
		}	
		swiftCode.sendKeys(SwiftCode);
		bankCode.sendKeys(BankCode);
		name.sendKeys(Name);
		shortName.sendKeys(ShortName);
		okBtn.click();
		cancelBtn.click();
		String g=errormessages.getText();
		if(g.equals(b)) {
			System.out.println("Cancel Button from confirm screen worked fine");
		}
		else {
			System.out.println("Cancel button is not working");
		}
		restartWorkflow.click();
		swiftCode.sendKeys(SwiftCode);
		bankCode.sendKeys(BankCode);
		name.sendKeys(Name);
		shortName.sendKeys(ShortName);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		submitBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ParticipantBankPage();
	}
	
	public ParticipantBankPage addvalidParticipantbankdata1(String SwiftCode,String BankCode,String Name,String ShortName,String BankType,String BranchCode) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		cancelBtn.click();
		String a=errormessages.getText();
		String b="Operation was cancelled.";
		if(a.equals(b)) {
			System.out.println("Cancel operation executed successfully");
		}
		else {
			System.out.println("Cancel Button is not working");
		}
		restartWorkflow.click();
		swiftCode.sendKeys(SwiftCode);
		bankCode.sendKeys(BankCode);
		name.sendKeys(Name);
		shortName.sendKeys(ShortName);
		branchCode.sendKeys(BranchCode);
		resetBtn.click();
		String c=swiftCode.getText();
		String d=bankCode.getText();
		String e=name.getText();
		String f=shortName.getText();
		if(c.isEmpty() && d.isEmpty() && e.isEmpty() && f.isEmpty()) {
			System.out.println("Reset Button is working properly");
		}
		else {
			System.out.println("Reset Button is not working");
		}	
		swiftCode.sendKeys(SwiftCode);
		bankCode.sendKeys(BankCode);
		name.sendKeys(Name);
		shortName.sendKeys(ShortName);
		bankType.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		Select sl=new Select(bankType);
		sl.selectByVisibleText(BankType);
		branchCode.sendKeys(BranchCode);
		okBtn.click();
		cancelBtn.click();
		String g=errormessages.getText();
		if(g.equals(b)) {
			System.out.println("Cancel Button from confirm screen worked fine");
		}
		else {
			System.out.println("Cancel button is not working");
		}
		restartWorkflow.click();
		swiftCode.sendKeys(SwiftCode);
		bankCode.sendKeys(BankCode);
		name.sendKeys(Name);
		shortName.sendKeys(ShortName);
		bankType.click();
		Select sl1=new Select(bankType);
		sl1.selectByVisibleText(BankType);
		branchCode.sendKeys(BranchCode);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		submitBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ParticipantBankPage();
	}
	
	public ParticipantBankPage approveParticipantBank(String SwiftCode) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
//		cancelBtn.click();
//		String a=errormessages.getText();
//		String b="Operation was cancelled.";
//		if(a.equals(b)) {
//			System.out.println("Cancel operation executed successfully");
//		}
//		else {
//			System.out.println("Cancel Button is not working");
//		}
//		restartWorkflow.click();
		swiftCode.sendKeys(SwiftCode);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		resetBtn.click();
		String c=swiftCode.getText();
		if(c.isEmpty()) {
			System.out.println("Reset Button is working properly");
		}
		else {
			System.out.println("Reset Button is not working");
		}
		restartWorkflow.click();
		swiftCode.sendKeys(SwiftCode);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		if(revealrecord.isDisplayed()) {
		revealrecord.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		approveBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		}
		else {
			System.out.println("No items available for Approve operation--TestCase Failed");
			logOutBtn.click();
			logoutBtn.click();
			driver.quit();
		}
		return new ParticipantBankPage();
	}
	
	public ParticipantBankPage repairParticipantBank(String SwiftCode) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		swiftCode.sendKeys(SwiftCode);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		revealrecord.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		torepairBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ParticipantBankPage();
	}
	
	public ParticipantBankPage modifyParticipantBank(String SwiftCode,String Name,String BankCode,String BranchCode,String ShortName) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		swiftCode.sendKeys(SwiftCode);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		resetBtn.click();
		String a=swiftCode.getText();
		if(a.isEmpty()) {
			System.out.println("Reset Button is working properly");
		}
		else {
			System.out.println("Reset Button is not working");
		}
		restartWorkflow.click();
		swiftCode.sendKeys(SwiftCode);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		revealrecord.click();
		cancelBtn.click();
		String b=errormessages.getText();
		String c="Operation was cancelled.";
		if(b.equals(c)) {
			System.out.println("Cancel operation executed successfully");
		}
		else {
			System.out.println("Cancel Button is not working");
		}
		revealrecord.click();
		name.clear();
		name.sendKeys(Name);
		bankCode.clear();
		bankCode.sendKeys(BankCode);
		branchCode.clear();
		branchCode.sendKeys(BranchCode);
		shortName.clear();
		shortName.sendKeys(ShortName);
		OKBtn.click();
		submitBtn.click();
		Thread.sleep(IntfConstants.TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ParticipantBankPage();
	}
	
	public ParticipantBankPage modifywithinvaliddata(String SwiftCode,String BankCode,String BranchCode) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		swiftCode.sendKeys(SwiftCode);
		okBtn.click();
		revealrecord.click();
		bankCode.clear();
		bankCode.sendKeys(BankCode);
		OKBtn.click();
		String a=errormessages.getText();
		String b="Bank Code Length should be two digit";
		if(a.equals(b)) {
			System.out.println("Bank code Field validated and displayed proper validation message");
		}
		else{
			System.out.println("Validation failed for Bank Code field");
		}
		restartWorkflow.click();
		swiftCode.sendKeys(SwiftCode);
		okBtn.click();
		revealrecord.click();
		branchCode.clear();
		branchCode.sendKeys(BranchCode);
		OKBtn.click();
		String c=errormessages.getText();
		String d="Branch Code length should be 3 digit";
		if(c.equals(d)) {
			System.out.println("Branch code length validation is proper");
		}
		else {
			System.out.println("Branch code length validation is not proper");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ParticipantBankPage();
	}
	
	public ParticipantBankPage modifywithinvaliddata1(DataTable credentials) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		List<List<String>> data=credentials.asLists();
		swiftCode.sendKeys(data.get(0).get(0));
		okBtn.click();
		revealrecord.click();
		bankCode.clear();
		bankCode.sendKeys(data.get(0).get(1));
		OKBtn.click();
		String a=errormessages.getText();
		String b="Bank Code Length should be two digit";
		if(a.equals(b)) {
			System.out.println("Bank code Field validated and displayed proper validation message");
		}
		else{
			System.out.println("Validation failed for Bank Code field");
		}
		restartWorkflow.click();
		swiftCode.sendKeys(data.get(0).get(0));
		okBtn.click();
		revealrecord.click();
		branchCode.clear();
		branchCode.sendKeys(data.get(0).get(2));
		OKBtn.click();
		String c=errormessages.getText();
		String d="Branch Code length should be 3 digit";
		if(c.equals(d)) {
			System.out.println("Branch code length validation is proper");
		}
		else {
			System.out.println("Branch code length validation is not proper");
		}
		return new ParticipantBankPage();
	}
	
	public ParticipantBankPage modifywithinvaliddata2(DataTable credentials) throws InterruptedException {
		restartWorkflow.click();
		List<List<String>> data=credentials.asLists();
		swiftCode.sendKeys(data.get(0).get(0));
		okBtn.click();
		revealrecord.click();
		branchCode.clear();
		branchCode.sendKeys(data.get(0).get(1));
		OKBtn.click();
		String e=errormessages.getText();
		String f="Branch code does not match with swift code";
		if(e.equals(f)) {
			System.out.println("Branch code and Swift Code match validation message is proper");
		}else {
			System.out.println("Validation failed for Branch code and Swift Code match");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ParticipantBankPage();
	}
	
	public ParticipantBankPage modifyParticipantBank1(String SwiftCode,String Name,String BankCode,String BankType,String BranchCode,String ShortName) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		swiftCode.sendKeys(SwiftCode);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		resetBtn.click();
		String a=swiftCode.getText();
		if(a.isEmpty()) {
			System.out.println("Reset Button is working properly");
		}
		else {
			System.out.println("Reset Button is not working");
		}
		restartWorkflow.click();
		swiftCode.sendKeys(SwiftCode);
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		okBtn.click();
		revealrecord.click();
		cancelBtn.click();
		String b=errormessages.getText();
		String c="Operation was cancelled.";
		if(b.equals(c)) {
			System.out.println("Cancel operation executed successfully");
		}
		else {
			System.out.println("Cancel Button is not working");
		}
		revealrecord.click();
		name.clear();
		name.sendKeys(Name);
		bankCode.clear();
		bankCode.sendKeys(BankCode);
		Select sl=new Select(bankType);
		sl.selectByVisibleText(BankType);
		branchCode.clear();
		branchCode.sendKeys(BranchCode);
		shortName.clear();
		shortName.sendKeys(ShortName);
		OKBtn.click();
		submitBtn.click();
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ParticipantBankPage();
	}

	public ParticipantBankPage validateSwiftCodefield(DataTable credentials) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		List<List<String>> data=credentials.asLists();
		swiftCode.sendKeys(data.get(0).get(0));
		bankCode.sendKeys(data.get(0).get(1));
		name.sendKeys(data.get(0).get(2));
		shortName.sendKeys(data.get(0).get(3));
		okBtn.click();
		String a=errormessages.getText();
		String b= "Invalid Swift Code";
		if(a.equals(b)) {
			System.out.println("Swift code Field validated and displayed proper validation message");
		}
		else{
			System.out.println("Validation failed for Swift Code field");
		}
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		swiftCode.sendKeys(data.get(1).get(0));
		bankCode.sendKeys(data.get(1).get(1));
		name.sendKeys(data.get(1).get(2));
		shortName.sendKeys(data.get(1).get(3));
		okBtn.click();
		String c="Swift Code Already Exists";
		String d=errormessages.getText();
		if(c.equals(d)) {
			System.out.println("Proper validation messages is displayed for Already existing Swift Code");
		}
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		swiftCode.sendKeys(data.get(2).get(0));
		bankCode.sendKeys(data.get(2).get(1));
		name.sendKeys(data.get(2).get(2));
		shortName.sendKeys(data.get(2).get(3));
		okBtn.click();
		String e=errormessages.getText();
		String f= "Swift Code should be 8 digit for Head Office";
		if(e.equals(f)) {
			System.out.println("Proper validation messages is displayed for length of Swift Code Head Office");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ParticipantBankPage();
	}
	
	public ParticipantBankPage validateBankCodefield(DataTable credentials) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		List<List<String>> data=credentials.asLists();
		swiftCode.sendKeys(data.get(0).get(0));
		bankCode.sendKeys(data.get(0).get(1));
		name.sendKeys(data.get(0).get(2));
		shortName.sendKeys(data.get(0).get(3));
		okBtn.click();
		String a=errormessages.getText();
		String b= "Bank Code Length should be two digit";
		if(a.equals(b)) {
			System.out.println("Bank code Field validated and displayed proper validation message");
		}
		else{
			System.out.println("Validation failed for Bank Code field");
		}
		restartWorkflow.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		swiftCode.sendKeys(data.get(1).get(0));
		bankCode.sendKeys(data.get(1).get(1));
		name.sendKeys(data.get(1).get(2));
		shortName.sendKeys(data.get(1).get(3));
		okBtn.click();
		String c="Bank code is already present in database";
		String d=errormessages.getText();
		if(c.equals(d)) {
			System.out.println("Proper validation messages is displayed for Already existing Bank Code");
		}
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ParticipantBankPage();
	}
	
	public ParticipantBankPage validateNamefield(DataTable credentials) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		List<List<String>> data=credentials.asLists();
		swiftCode.sendKeys(data.get(0).get(0));
		bankCode.sendKeys(data.get(0).get(1));
		name.sendKeys(data.get(0).get(2));
		shortName.sendKeys(data.get(0).get(3));
		okBtn.click();
		String a=errormessages.getText();
		String b= "Name cannot be empty";
		if(a.equals(b)) {
			System.out.println("Name Field validated and displayed proper validation message");
		}
		else{
			System.out.println("Validation failed for Name field");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ParticipantBankPage();
	}
	
	public ParticipantBankPage validateShortNamefield(DataTable credentials) throws InterruptedException {
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		List<List<String>> data=credentials.asLists();
		swiftCode.sendKeys(data.get(0).get(0));
		bankCode.sendKeys(data.get(0).get(1));
		name.sendKeys(data.get(0).get(2));
		shortName.sendKeys(data.get(0).get(3));
		okBtn.click();
		String a=errormessages.getText();
		String b= "Short name cannot be empty";
		if(a.equals(b)) {
			System.out.println("Short Name Field validated and displayed proper validation message");
		}
		else{
			System.out.println("Validation failed for Short Name field");
		}
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ParticipantBankPage();
	}

	public ParticipantBankPage listParticipantBank() throws InterruptedException {
		okBtn.click();
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		logOutBtn.click();
		logoutBtn.click();
		driver.quit();
		return new ParticipantBankPage();
	}
}
