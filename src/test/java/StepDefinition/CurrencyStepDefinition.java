package StepDefinition;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.pages.CurrencyPage;
import com.pibc.qa.pages.HomePage;
import com.pibc.qa.pages.LoginPage;
import com.pibc.qa.util.Windowhandle;

import io.cucumber.java.en.Then;

public class CurrencyStepDefinition extends TestBase{
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	CurrencyPage currencyPage;
	Windowhandle win;

	@Then("User goes to Maintenance and open Currency Add menu to Add the Currency")
	public void user_goes_to_Maintenance_and_open_Currency_Add_menu_to_Add_the_Currency() throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    currencyPage=homePage.clickonCurrencyAddLink();
	}

	@Then("User kept {string},{string},{string},{string},{string},{string},{string},{string},{string},{string} fields blank and click on NEXT button")
	public void user_kept_fields_blank_and_click_on_NEXT_button(String ISOCode, String CurrencyUnit, String firstCutoffHH, String firstCutoffMM, String secondCutoffHH, String secondCutoffMM, String TruncateConversion, String HolidayPoisition, String ConvRate, String ConvTolerance) throws InterruptedException {
		currencyPage=currencyPage.addCurrencywithBlankdata(ISOCode, CurrencyUnit, firstCutoffHH, firstCutoffMM, secondCutoffHH, secondCutoffMM, TruncateConversion, HolidayPoisition, ConvRate, ConvTolerance);
	}

	@Then("User fill Invalid data with {string},{string},{string},{string},{string},{string},{string},{string},{string},{string} fields and click on NEXT button")
	public void user_fill_Invalid_data_with_fields_and_click_on_NEXT_button(String ISOCode, String CurrencyUnit, String firstCutoffHH, String firstCutoffMM, String secondCutoffHH, String secondCutoffMM, String TruncateConversion, String HolidayPoisition, String ConvRate, String ConvTolerance) throws InterruptedException {
		currencyPage=currencyPage.addCurrencywithInvaliddata(ISOCode, CurrencyUnit, firstCutoffHH, firstCutoffMM, secondCutoffHH, secondCutoffMM, TruncateConversion, HolidayPoisition, ConvRate, ConvTolerance);
	}

	@Then("User enter valid {string},{string},{string},{string},{string},{string},{string},{string},{string},{string} and click on NEXT button")
	public void user_enter_valid_and_click_on_NEXT_button(String ISOCode, String CurrencyUnit, String firstCutoffHH, String firstCutoffMM, String secondCutoffHH, String secondCutoffMM, String TruncateConversion, String HolidayPoisition, String ConvRate, String ConvTolerance) throws InterruptedException {
		currencyPage=currencyPage.addCurrencywithValiddata(ISOCode, CurrencyUnit, firstCutoffHH, firstCutoffMM, secondCutoffHH, secondCutoffMM, TruncateConversion, HolidayPoisition, ConvRate, ConvTolerance);
	}
	
	@Then("User goes to Maintenance and open Currency Approve menu to Approve the Currency")
	public void user_goes_to_Maintenance_and_open_Currency_Approve_menu_to_Approve_the_Currency() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		currencyPage=homePage.clickonCurrencyApproveLink();
	}
	
	@Then("User approve the currency using {string}")
	public void user_approve_the_currency_using(String ISOCode) throws InterruptedException {
		currencyPage=currencyPage.approveCurrency(ISOCode);
	}
	
	@Then("User goes to Maintenance and open Currency List menu to List the Currency")
	public void user_goes_to_Maintenance_and_open_Currency_List_menu_to_List_the_Currency() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		currencyPage=homePage.clickonCurrencyListLink();
	}
	
	@Then("User view the Currency list with {string},{string},{string}")
	public void user_view_the_Currency_list_with(String ISOCode, String Status, String Description) throws InterruptedException {
		currencyPage=currencyPage.listCurrency(ISOCode, Status,Description);
	}

	@Then("User view the Currency list with {string},{string}")
	public void user_view_the_Currency_list_with(String ISOCode, String Status) throws InterruptedException {
		currencyPage=currencyPage.listCurrencyInvalidcriteria(ISOCode, Status);
	}
	
	@Then("User goes to Maintenance and open Currency Modify menu")
	public void user_goes_to_Maintenance_and_open_Currency_Modify_menu() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		currencyPage=homePage.clickonCurrencyModifyLink();
	}
	
	@Then("User modify {string} with {string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_modify_with(String ISOCode,String CurrencyUnit,String firstCutoffHH,String firstCutoffMM,String secondCutoffHH,String secondCutoffMM,String TruncateConversion,String HolidayPoisition,String ConvRate,String ConvTolerance) throws InterruptedException {
		currencyPage=currencyPage.modifyCurrency(ISOCode, CurrencyUnit, firstCutoffHH, firstCutoffMM, secondCutoffHH, secondCutoffMM, TruncateConversion, HolidayPoisition, ConvRate, ConvTolerance);
	}
	
	@Then("User try to modify {string} with {string},{string},{string},{string},{string},{string},{string},{string},{string} with Invalid data")
	public void user_try_to_modify_with_with_Invalid_data(String ISOCode, String CurrencyUnit, String firstCutoffHH, String firstCutoffMM, String secondCutoffHH, String secondCutoffMM, String TruncateConversion, String HolidayPoisition, String ConvRate, String ConvTolerance) throws InterruptedException {
		currencyPage=currencyPage.modifyCurrencywithInvalidddata(ISOCode, CurrencyUnit, firstCutoffHH, firstCutoffMM, secondCutoffHH, secondCutoffMM, TruncateConversion, HolidayPoisition, ConvRate, ConvTolerance);
	}
	
	@Then("User will keep {string},{string},{string},{string},{string},{string},{string},{string},{string},{string} fields blank and click on NEXT button")
	public void user_will_keep_fields_blank_and_click_on_NEXT_button(String ISOCode, String CurrencyUnit, String firstCutoffHH, String firstCutoffMM, String secondCutoffHH, String secondCutoffMM, String TruncateConversion, String HolidayPoisition, String ConvRate, String ConvTolerance) throws InterruptedException {
		currencyPage=currencyPage.modifyCurrencywithBlankdata(ISOCode, CurrencyUnit, firstCutoffHH, firstCutoffMM, secondCutoffHH, secondCutoffMM, TruncateConversion, HolidayPoisition, ConvRate, ConvTolerance);
	}
	
	@Then("User goes to Maintenance and open Currency Delete menu")
	public void user_goes_to_Maintenance_and_open_Currency_Delete_menu() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
		currencyPage=homePage.clickonCurrencyDeleteLink();
	}

	@Then("User delete the currency using {string},{string}")
	public void user_delete_the_currency_using(String ISOCode, String Description) throws InterruptedException {
		currencyPage=currencyPage.deleteCurrency(ISOCode,Description);
	}
	
	@Then("User view the deleted Currency")
	public void user_view_the_deleted_Currency() throws InterruptedException {
		currencyPage=currencyPage.listCurrency1();
	}
}
