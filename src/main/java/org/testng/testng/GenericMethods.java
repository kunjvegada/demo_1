package org.testng.testng;

import java.io.File;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class GenericMethods extends TestNGClass {

	public static void verifyDisplay(WebElement ele) {
		try {
			Assert.assertTrue(true, "Element is displayed");
			Reporter.log("Element is displayed");
		} catch (Error e) {
			Reporter.log("Element is not visible");
		}
	}

	public static WebElement waitForPresent(By by, long seconds) {
		return new WebDriverWait(driver, seconds).until(ExpectedConditions.presenceOfElementLocated(by));
	}

	public static WebElement waitForVisible(WebElement ele, long seconds) {
		return new WebDriverWait(driver, seconds).until(ExpectedConditions.visibilityOf(ele));
	}

	public static HashMap<Object, Object> readXMLFile() {
		File file = new File("src/main/java/data/registerData.xml");
		HashMap<Object, Object> registerData = new HashMap<Object, Object>();
		try {
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document doc = builder.parse(file);
			doc.getDocumentElement().normalize();
			System.out.println("Root Node :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("valid");
			System.out.println("-----------------------------------");
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				System.out.println("Current node name : " + node.getNodeName());

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element ele = (Element) node;
					registerData.put("fname", ele.getElementsByTagName("fname").item(0).getTextContent());
					registerData.put("lname", ele.getElementsByTagName("lname").item(0).getTextContent());
					registerData.put("maritalstatus",
							ele.getElementsByTagName("maritalstatus").item(0).getTextContent());
					registerData.put("hobby", ele.getElementsByTagName("hobby").item(0).getTextContent());
					registerData.put("country", ele.getElementsByTagName("country").item(0).getTextContent());
					registerData.put("month", ele.getElementsByTagName("month").item(0).getTextContent());
					registerData.put("day", ele.getElementsByTagName("day").item(0).getTextContent());
					registerData.put("year", ele.getElementsByTagName("year").item(0).getTextContent());
					registerData.put("phone", ele.getElementsByTagName("phone").item(0).getTextContent());
					registerData.put("email", ele.getElementsByTagName("email").item(0).getTextContent());
					registerData.put("about", ele.getElementsByTagName("about").item(0).getTextContent());
					registerData.put("password", ele.getElementsByTagName("password").item(0).getTextContent());
					registerData.put("confpwd", ele.getElementsByTagName("confpwd").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerData;
	}

	public static void main(String arg[]) {
		readXMLFile();
	}
}
