package com.pibc.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pibc.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="j_user")
	WebElement username;
	
	@FindBy(name="j_pass")
	WebElement password;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	@FindBy(name="j_user")
	WebElement username1;
	
	@FindBy(name="j_pass")
	WebElement password1;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
//	public HomePage login1(String un,String pwd) {
//		username1.sendKeys(un);
//		password1.sendKeys(pwd);
//		loginBtn.click();
//		return new HomePage();
//	}
}
