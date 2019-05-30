package net.anz.ui.utility;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.anz.ui.testbase.TestBase;

public class Utility extends TestBase{
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public static void waitExplicit(WebElement element) {
		WebDriverWait myWait = new WebDriverWait(driver,30);
		myWait.until(ExpectedConditions.visibilityOf(element));
		//myWait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void enterData(WebElement object, String objType, String objName, String text) {
		try {
			if(driver !=null) {
				object.sendKeys(text);
				System.out.println(objName+" "+"entered in"+" " +objType);
			}
			else {
				System.out.println("driver not found");
			}			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void clickOn(WebElement object, String objType, String objName) {
		try {
			if(driver != null) {
				object.click();
				System.out.println("clicked on" +" " +objName + " " + objType);
			}
			else {
				System.out.println("driver not found");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void select_option_In_DropDown_ByVal(WebElement dropDown, String objType) {
		try {
			Select s = new Select(dropDown);
			s.selectByIndex(0);
			//s.selectByValue(valueToSelect);
			System.out.println(objType+ " " +"is selected");
		}
		catch(NoSuchElementException e) {
			System.out.println("value not found in drop down");
		}
	}
	
	public static String convert(String str) {
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)<48 || sb.charAt(i)>57) {
				sb.deleteCharAt(i);
				i--;
			}
		}
		return sb.toString();	
		
	}


}
