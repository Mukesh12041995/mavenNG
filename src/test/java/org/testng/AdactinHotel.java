package org.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\New PC\\eclipse-workspace\\seleniumAutomation\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	
	
	WebElement txtuser = driver.findElement(By.id("username"));
	txtuser.sendKeys("ragulkcr777");
	
	WebElement txtpass = driver.findElement(By.id("password"));
	txtpass.sendKeys("ragul12345");
	
	WebElement clk = driver.findElement(By.id("login"));
	clk.click();
	
//	WebElement ok = driver.findElement(By.id("Submit"));
//	ok.click();
	
	System.out.println("done");
	
	WebElement locate = driver.findElement(By.id("location"));
	locate.click();
	
	Select s=new Select(locate);
		s.selectByVisibleText("London");
	WebElement hotel = driver.findElement(By.id("hotels"));
	hotel.click();
	Select s1=new Select(hotel);
s1.selectByVisibleText("Hotel Sunshine");
	
	WebElement room = driver.findElement(By.id("room_type"));
	room.click();
	Select s2=new Select(room);
s2.selectByVisibleText("Deluxe");
	
	WebElement no = driver.findElement(By.id("room_nos"));
	no.click();
	Select s3=new Select(no);
s3.selectByValue("2");
	
   
	WebElement indate = driver.findElement(By.id("datepick_in"));
indate.clear();
//	 Robot r=new Robot();  	
//	r.keyPress(KeyEvent.VK_CONTROL);
//	r.keyPress(KeyEvent.VK_A);
//	r.keyRelease(KeyEvent.VK_CONTROL);
//	r.keyRelease(KeyEvent.VK_A);
//	r.keyPress(KeyEvent.VK_DELETE);
//	r.keyRelease(KeyEvent.VK_DELETE);
//	
	indate.sendKeys("22/05/2022");
	
	WebElement outdate = driver.findElement(By.id("datepick_out"));
	outdate.clear();
	outdate.sendKeys("30/05/2022");
	
	WebElement adult = driver.findElement(By.id("adult_room"));
	Select s4=new Select(adult);
	s4.selectByValue("2");
	
	
WebElement sub = driver.findElement(By.id("Submit"));
sub.click();
	
	WebElement radio = driver.findElement(By.id("radiobutton_0"));
	radio.click();
	
	WebElement cont = driver.findElement(By.id("continue"));
	cont.click();
	
	
	WebElement name = driver.findElement(By.id("first_name"));
	name.sendKeys("ragul");
	
	WebElement lastn = driver.findElement(By.id("last_name"));
	lastn.sendKeys("m");
	
	
	WebElement add = driver.findElement(By.id("address"));
	add.sendKeys("qwertyuio,fghjk,1236");
	
	
	WebElement no1 = driver.findElement(By.id("cc_num"));
	no1.sendKeys("1234567890123456");
	
	WebElement cc = driver.findElement(By.id("cc_type"));
	Select s5 =new Select(cc);
	s5.selectByVisibleText("VISA");
	
	
	WebElement mon = driver.findElement(By.id("cc_exp_month"));
	Select s6 =new Select(mon);
	s6.selectByVisibleText("May");
	
	WebElement year = driver.findElement(By.id("cc_exp_year"));
	Select s7 =new Select(year);
	s7.selectByValue("2022");
			
			
	
	WebElement ccv = driver.findElement(By.id("cc_cvv"));
	ccv.sendKeys("321");
	
	
	WebElement book = driver.findElement(By.id("book_now"));
	book.click();
	
	
	
	
}
}
