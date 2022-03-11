package org.testng;

import org.Bassclass.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageHotel extends  Baseclass{
public void start() {
	
	PageFactory.initElements(driver, this);
}
	@FindBy(id="username")
	private WebElement txtusername;
	@FindBy(id="password")
	private WebElement txtpassword;
	@FindBy(id="login")
	private WebElement loginbtn;
	
	public WebElement getusername() {
		return txtusername;
	}
	public WebElement getpassword() {
		return txtpassword;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
