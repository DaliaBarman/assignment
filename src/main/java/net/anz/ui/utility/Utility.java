package net.anz.ui.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.anz.ui.testbase.TestBase;

public class Utility extends TestBase{
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public static void waitExplicit(WebElement element) {
		WebDriverWait myWait = new WebDriverWait(driver,30);
		myWait.until(ExpectedConditions.elementToBeClickable(element));
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


}
