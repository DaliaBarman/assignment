package net.anz.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.anz.ui.testbase.TestBase;
import net.anz.ui.utility.Utility;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//input[@id='application_type_single']")
	public WebElement appType;
	
	@FindBy(xpath="//select[@title='Number of dependants']")
	public WebElement dependentNum;
	
	@FindBy(xpath="//input[@value='H']")
	public WebElement propertyType;
	
	@FindBy(xpath="//input[@aria-labelledby='q2q1']")
	public WebElement income;
	
	@FindBy(xpath="//input[@aria-labelledby='q2q2']")
	public WebElement otherIncome;
	
	@FindBy(xpath="//input[@id='expenses']")
	public WebElement livingExp;
	
	@FindBy(xpath="//input[@id='homeloans']")
	public WebElement homeLoan;
	
	@FindBy(xpath="//input[@id='otherloans']")
	public WebElement otherLoan;
	
	@FindBy(xpath="//input[@aria-labelledby='q3q4']")
	public WebElement otherCommit;
	
	@FindBy(xpath="//input[@id='credit']")
	public WebElement creditLimit;
	
	@FindBy(xpath="//button[@class='btn btn--action btn--borrow__calculate']")
	public WebElement workoutCal;
	
	@FindBy(xpath="//span[contains(text(),'$459,000')]")
	public WebElement amountVisible;
	
	@FindBy(xpath="//span[@class='borrow__result__text__amount']")
	public WebElement estimBorrow;
	
	@FindBy(xpath="//button[@class='start-over']")
	public WebElement startOver;
	
	@FindBy(xpath="//span[@class='borrow__error__text']")
	public WebElement errorMessage;
	
	
	//Initializing the page objects
	
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
	//Actions
		
		public String validateHomePageTitle() {
			return driver.getTitle();
		}
		
		public void fillYourDetails() {
			Utility.clickOn(appType, "button", "appType");
			Utility.select_option_In_DropDown_ByVal(dependentNum, "dropdown");
			Utility.clickOn(propertyType, "button", "propertyType");
		}

		
		public void clickOnCalculateButton() {
			Utility.clickOn(workoutCal, "button", "workoutCal");
			
		}
		
		public int validateAmount() {
			String amount = estimBorrow.getText();
			String newAmount = Utility.convert(amount);
			return Integer.parseInt(newAmount);
			
		}
		
		public boolean calculateButtonVisible() {
			return workoutCal.isDisplayed();
		}
		
		public void clickStartOver() {
			Utility.clickOn(startOver, "button", "start over");
		}	
		
		public String checkErrorMessage() {
			return Utility.getText(errorMessage, "text", "message");
		}
		
		public String checkIncomeFieldText() {
			return Utility.getText(income, "textbox", "income");			
			
		}
		
		public String checkOtherIncomeText() {
		return Utility.getText(otherIncome, "textbox", "othrIncome");
				
		}
		
		public String checkLivingFieldText() {
		return Utility.getText(livingExp,"textbox", "livingExpense");
		}
		
		public String checkHomeLoanFieldText() {
		
		return Utility.getText(homeLoan, "textbox", "homeLoan");
		}
		
		public String checkOtherLoanFieldText() {
		return Utility.getText(otherLoan, "textbox", "otherLoan");
		}
		
		public String checkOtherCommitFieldText() {
			return Utility.getText(otherCommit, "text", "otherCommit");
		}
		
		public String checkCreditLimitFieldText() {
			return Utility.getText(creditLimit, "text", "creditLimit");
		}

}
