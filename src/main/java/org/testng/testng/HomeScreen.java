package org.testng.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import resources.locatorsOfScreen;

public class HomeScreen extends TestNGClass implements locatorsOfScreen {

	@Test(groups = {"home"})
	public void verifyHomeScr(){
		GenericMethods.verifyDisplay(driver.findElement(By.cssSelector(logo)));
		GenericMethods.verifyDisplay(driver.findElement(By.xpath(homeText)));
	}
	
	
}
