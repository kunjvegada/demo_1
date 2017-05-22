package org.testng.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGClass {

	static WebDriver driver;

	@BeforeMethod
	public static void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "browsers\\Firefox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
	}

	@AfterMethod
	public static void afterTest() {
		driver.quit();
	}

}
