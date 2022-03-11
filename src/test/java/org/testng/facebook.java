package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebook  {
@Test
	private void test() {
		System.out.println("test");
	}
	
	
	
	@BeforeClass
private void beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\New PC\\eclipse-workspace\\seleniumAutomation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		System.out.println("before class");

}
	@BeforeMethod
	private void beforemethod() {
	
		System.out.println("before method");

	}
	@AfterMethod
	private void aftermethod() {
		System.out.println("after method");

	}
	@AfterClass
	private void afterclass() {
		System.out.println("after class");

	}
}
