package net.anz.ui.stepDefinitions;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.anz.ui.pages.HomePage;
import net.anz.ui.testbase.TestBase;
import net.anz.ui.utility.Utility;

public class HomePageSteps extends TestBase {
	
	HomePage homepage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() {
	    TestBase.initialization();
	    homepage=new HomePage();
	}

	@When("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		Assert.assertEquals("Home loan borrowing power calculator | ANZ", homepage.validateHomePageTitle());
	    
	}

	@Then("^user provides Your Detail$")
	public void User_provides_Your_Detail(){
		homepage.fillYourDetails();
	}

	@Then("^user provides Your earnings$")
	public void user_provides_Your_earnings(DataTable earningData) {
		List<List<String>> enData= earningData.raw();
		Utility.enterData(homepage.income, "textBox", "YourIncome", enData.get(0).get(0));
		Utility.enterData(homepage.otherIncome, "textBox", "OtherIncome", enData.get(0).get(1));		
	}


	@Then("^user provides Your Expences$")
	public void user_provides_Your_Expences(DataTable expenseData){
		List<List<String>> exData= expenseData.raw();
		Utility.enterData(homepage.livingExp, "textBox", "LivingExpns",exData.get(0).get(0));
		Utility.enterData(homepage.homeLoan, "textBox", "CurrHomeLoan",exData.get(0).get(1));
		Utility.enterData(homepage.otherLoan, "textBox", "otherLoan",exData.get(0).get(2));
		Utility.enterData(homepage.otherCommit, "textBox", "OtherCommitments",exData.get(0).get(3));
		Utility.enterData(homepage.creditLimit, "textBox", "creditLimit",exData.get(0).get(4));	
	}
	
	//1st
	
	@Given("^Calculate button appears$")
	public void Calculate_button_appears() {
		homepage.calculateButtonVisible();
	}
		
	@When("^user clicks on calculate button$")
	public void user_clicks_on_calculate_button() {
		homepage.clickOnCalculateButton();
		Utility.waitExplicit(homepage.amountVisible);
	}
	
	@Then("^user validates borrow amount$")
	public void user_validates_borrow_amount() throws Throwable {
		Assert.assertEquals(459000, homepage.validateAmount());   
	}
	
	@Then("^user closes browser$")
	public void user_closes_browser() {
		driver.quit();
	}
	
	//2nd
	@Given("^click on calculate button$")
	public void click_on_calculate_button() {
		homepage.clickOnCalculateButton();
	}
	
	@When("^user clicks on start over button$")
	public void user_clicks_on_start_over_button() {
		homepage.clickStartOver();
	}
	
	@Then("^user validates empty form$")
	public void user_validates_empty_form() {
		Assert.assertNotNull(homepage.checkIncomeFieldText());
		Assert.assertNotNull(homepage.checkOtherIncomeText());
		Assert.assertNotNull(homepage.checkLivingFieldText());
		Assert.assertNotNull(homepage.checkHomeLoanFieldText());
		Assert.assertNotNull(homepage.checkOtherLoanFieldText());
		Assert.assertNotNull(homepage.checkOtherCommitFieldText());
		Assert.assertNotNull(homepage.checkCreditLimitFieldText());
	}
	
	@Then("^browser closing$")
	public void browser_closing() {
		driver.quit();
	}
	
	
	//3rd
	
	@Given("^user clicking on calculate button$")
	public void user_clicking_on_calculate_button() {
		homepage.clickOnCalculateButton();
	}
	
	@When("^user clicking on start over button$")
	public void user_clicking_on_start_over_button() throws InterruptedException {
		homepage.clickStartOver();
		Thread.sleep(3000);
	}

	
	@Then("^user provides only living expense as 1$")
	public void user_provides_only_living_expense_as_1(DataTable livExp){
		List<List<String>> livData= livExp.raw();
		Utility.enterData(homepage.livingExp, "textBox", "LivingObj", livData.get(0).get(0));
	}
	
	@Then("^user click on calculate button$")
	public void user_click_on_calculate_button() {
		homepage.clickOnCalculateButton();		
	}
	
	
	@Then("^user validates error message$")
	public void user_validates_error_message() {
		Assert.assertEquals("Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 100 641.", homepage.checkErrorMessage());
		
	}
	
	@Then("^browser closed$")
	public void browser_closed() {
		driver.quit();
	}





}
