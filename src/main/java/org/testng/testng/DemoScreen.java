package org.testng.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import resources.locatorsOfScreen;

public class DemoScreen extends TestNGClass implements locatorsOfScreen {

	@Test(description = "Draggable Tab Functionality Verification", groups = { "demo" }, enabled = false)
	public void verifyDraggableFnc() {
		driver.findElement(By.xpath(demoTab)).click();
		driver.findElement(By.xpath(draggableTab)).click();
		Reporter.log("Draggable tab is opened");
		GenericMethods.waitForVisible(GenericMethods.waitForPresent(By.xpath(draggableEle), 60), 60).click();
		Actions action = new Actions(driver);
		WebElement eleSource = GenericMethods.waitForVisible(GenericMethods.waitForPresent(By.xpath(item1), 60), 60);
		WebElement eleDest = driver.findElement(By.xpath(itemLast));
		int offset = (int) (eleDest.getSize().getHeight() + eleDest.getLocation().getY())
				- (eleSource.getLocation().getY() + eleSource.getSize().getHeight());
		action.dragAndDropBy(eleSource, 0, (int) (offset + offset * .1)).perform();
	}

}
