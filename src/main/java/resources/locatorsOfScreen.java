package resources;

public interface locatorsOfScreen {

	//Home page Locators
	final String logo = ".site-anchor>img";
	final String demoTab = ".//a[contains(text(),'Demo')]";
	final String draggableTab = ".//a[contains(text(),'Draggable')]";
	final String homeText = ".//h1[text()='Home']";
	final String registationBtn = ".//a[text()='Registration']";
	
	//Draggale Screen
	final String draggableEle = ".//a[contains(text(),'Draggable + Sortable')]";
	final String item1 = ".//*[@id='sortablebox']/li[1]";
	final String itemLast = ".//*[@id='sortablebox']/li[last()]";
	
	//Registration Screen
	final String registrationTitle = ".//h1[text()='Registration']";
	final String fName = ".//*[@id='name_3_firstname']";
	final String lName = ".//*[@id='name_3_lastname']";
	final String mStatus = ".//*[text()='Marital Status']/following-sibling::div[@class='radio_wrap']/input";
	final String hobby = ".//*[text()='Hobby']/following-sibling::div[@class='radio_wrap']/input";
	final String country = ".//*[@id='dropdown_7']";
	final String dobMonth = ".//*[@id='mm_date_8']";
	final String dobDay = ".//*[@id='dd_date_8']";
	final String dobYear = ".//*[@id='yy_date_8']";
	final String phone = ".//*[@id='phone_9']";
	final String userName = ".//*[@id='username']";
	final String email = ".//*[@id='email_1']";
	final String aboutU = ".//*[@id='description']";
	final String password = ".//*[@id='password_2']";
	final String confPwd = ".//*[@id='confirm_password_password_2']";
	final String submitBtn = ".//input[@value='Submit']";
}
