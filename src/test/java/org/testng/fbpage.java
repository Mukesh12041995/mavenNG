package org.testng;

import org.Bassclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbpage extends Baseclass {

	public fbpage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtusername;

	@FindBy(id = "pass")
	private WebElement txtuserpass;

	@FindBy(name = "login")
	private WebElement click;

	public WebElement getusername() {
		return txtusername;
	}

	public WebElement getuserpass() {
		return txtuserpass;
	}

	public WebElement login() {
		return click;
		// TODO Auto-generated method stub

	}
}
