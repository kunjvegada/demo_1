package org.testng.testng;

import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.locatorsOfScreen;

public class RegistrationScreen extends TestNGClass implements locatorsOfScreen {

	static Logger log = Logger.getLogger(RegistrationScreen.class);

	@Test(enabled = false)
	public void openRegistrationPage() {
		driver.findElement(By.xpath(registationBtn)).click();
		GenericMethods.waitForPresent(By.xpath(registrationTitle), 60);
		try {
			Thread.sleep(10000);
		} catch (Exception e) {

		}
	}

	@Test(dataProvider = "registerdata")
	public void registrUser(Map<Object, Object> data) {

		System.out.println("Data---" + data);
		String name = (String) data.get("fname");
		System.out.println("name==" + name);
		driver.findElement(By.xpath(registationBtn)).click();
		GenericMethods.waitForPresent(By.xpath(registrationTitle), 60);
		WebElement ele = GenericMethods.waitForVisible(GenericMethods.waitForPresent(By.xpath(fName), 30), 30);
		ele.sendKeys(name);
		
	}

	@DataProvider(name = "registerdata")
	public Object[][] getData() {
		Map<Object, Object> map = GenericMethods.readXMLFile();
		System.out.println("Map---" + map);
		return new Object[][] { { map } };
	}

}
