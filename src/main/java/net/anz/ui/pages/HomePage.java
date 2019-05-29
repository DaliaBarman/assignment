package net.anz.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.anz.ui.testbase.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//input[@id='application_type_single']")
	WebElement appType;
	
	@FindBy(xpath="//select[@title='Number of dependants']")
	WebElement dependentNum;
	
	@FindBy(xpath="//input[@value='H']")
	WebElement propertyType;
	
	@FindBy(xpath="//input[@aria-labelledby='q2q1']")
	WebElement income;
	
	@FindBy(xpath="//input[@aria-labelledby='q2q2']")
	WebElement otherIncome;
	
	@FindBy(xpath="//input[@id='expenses']")
	WebElement livingExp;
	
	@FindBy(xpath="//input[@id='homeloans']")
	WebElement homeLoan;
	
	@FindBy(xpath="//input[@id='otherloans']")
	WebElement otherLoan;
	
	@FindBy(xpath="//input[@aria-labelledby='q3q4']")
	WebElement otherCommit;
	
	@FindBy(xpath="//input[@id='credit']")
	WebElement creditLimit;

}
