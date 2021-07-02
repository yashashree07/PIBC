package StepDefinition;

import com.pibc.qa.base.TestBase;
import com.pibc.qa.constants.IntfConstants;
import com.pibc.qa.pages.HomePage;
import com.pibc.qa.pages.InternationalCurrencyPage;
import com.pibc.qa.pages.LoginPage;
import com.pibc.qa.util.Windowhandle;

import io.cucumber.java.en.Then;

public class InternationalCurrencyStepDefinition extends TestBase{
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	InternationalCurrencyPage internationalCurrencyPage; 
	Windowhandle win;

	@Then("User goes to Maintenance DB and open International Currency List menu to list the added currency")
	public void user_goes_to_Maintenance_DB_and_open_International_Currency_List_menu_to_list_the_added_currency() throws InterruptedException {
	    driver.switchTo().frame("toc");
	    Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    internationalCurrencyPage=homePage.clickonDBInternationalCurrencyListLink();
	}
	
	@Then("User select valid {string},{string},{string} and click on OK button")
	public void user_select_valid_and_click_on_OK_button(String CurrencyCODE, String CountryCode, String CurrencyName) throws InterruptedException {
		internationalCurrencyPage=internationalCurrencyPage.entervaliddata(CurrencyCODE, CountryCode, CurrencyName);
	}
	
	@Then("User select invalid {string},{string} and click on OK button")
	public void user_select_invalid_and_click_on_OK_button(String CountryCode, String CurrencyName) throws InterruptedException {
		internationalCurrencyPage=internationalCurrencyPage.enterinvaliddata(CountryCode, CurrencyName);
	}
	
	@Then("User goes to Maintenance DB and open International Currency Add menu to Add the International currency")
	public void user_goes_to_Maintenance_DB_and_open_International_Currency_Add_menu_to_Add_the_International_currency() throws InterruptedException {
		driver.switchTo().frame("toc");
		Thread.sleep(IntfConstants.SHORT_TIMEOUT);
	    internationalCurrencyPage=homePage.clickonDBInternationalCurrencyAddLink();
	}

	@Then("User enter valid {string},{string},{string},{string} and click on OK button")
	public void user_enter_valid_and_click_on_OK_button(String CurrencyCODE, String CountryCode, String CurrencyName, String CurrencyFractions) throws InterruptedException {
		internationalCurrencyPage=internationalCurrencyPage.addvalidCurrencydata(CurrencyCODE, CountryCode, CurrencyName,CurrencyFractions); 
	}

	@Then("User enter invalid {string},{string},{string} and click on OK button")
	public void user_enter_invalid_and_click_on_OK_button(String CurrencyCODE, String CountryCode, String CurrencyName) throws InterruptedException {
		internationalCurrencyPage=internationalCurrencyPage.addinvalidCurrencydata(CurrencyCODE, CountryCode, CurrencyName);
	}
	
	@Then("User keep {string},{string},{string} fields blank and click on OK button")
	public void user_keep_fields_blank_and_click_on_OK_button(String CurrencyCODE, String CountryCode, String CurrencyName) throws InterruptedException {
		internationalCurrencyPage=internationalCurrencyPage.blankCurrencydata();
	}
}
