package org.Bassclass;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	// .....................BROWSER METHODS AND WEB ELEMENTS....................//

	// browser launch 1
	public static WebDriver chromelaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;

	}

	// get url 2
	public static void urllaunch(String url) {
		driver.get(url);

	}

	// send keys 3
	public static void sendkeys(WebElement e, String data) {
		e.sendKeys(data);
	}

	// maximize 4
	public static void maxi() {
		driver.manage().window().maximize();

	}

	// click 5
	public static void click(WebElement e) {
		e.click();

	}

	// get attribute 6
	public static String getattribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;

	}

	// get title 7
	public static String gettit() {
		String tit = driver.getTitle();
		return tit;
	}

	// get current url
	public static String getcurrenturl() {
		String curnturl1 = driver.getCurrentUrl();
		return curnturl1;

	}

	// quit 8
	public static void quit() {
		driver.quit();
	}

	// close 9
	public static void close() {
		driver.close();
	}

	// clear 10
	public static void clear(WebElement e) {
		e.clear();

	}

	// is displyed 11
	public static boolean isdisplyed(WebElement e) {
		boolean displayed = e.isDisplayed();
		return displayed;
	}

	// ....................ACTIONS......................//

	// drag and drop 12
	public static void drgdrp(WebElement from, WebElement to) {
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).perform();
	}

	// double click 13
	public static void doublclk() {
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}

	// context click or right click 14
	public static void contextclk() {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}

	// actions click 15
	public static void actclk() {
		Actions act = new Actions(driver);
		act.click().perform();
	}

	// ..................NAVIGATIONS..........................//

	public static void navigationURL(String u) {
		Navigation naviurl = driver.navigate();
		naviurl.to(u);

	}

	public static void navigateTo(String to) {
		Navigation naviTo = driver.navigate();
		naviTo.to(to);
	}

	public static void navigateRefresh() {
		Navigation navirefresh = driver.navigate();
		navirefresh.refresh();

	}

	public static void navigateBack() {
		Navigation navback = driver.navigate();
		navback.back();
	}

	public static void navigateForward() {
		Navigation navfor = driver.navigate();
		navfor.forward();

	}

	// ..............................WAIT...............................//

	// implicitwait
	public static void impwait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}

	// ..........................SWITCH TO FRAMES......................//
	//
	public static WebDriver frameint(int frmI) {
		WebDriver frame1 = driver.switchTo().frame(frmI);
		return frame1;

	}

	public static WebDriver framestring(String frmS) {
		WebDriver frame2 = driver.switchTo().frame(frmS);
		return frame2;

	}
	// .........................SWITCH TO ALERT..........................//

	public static void alertAccept() {
		driver.switchTo().alert().accept();

	}

	public static void alertDismiss() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public static void alertSendkeys(String as) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(as);

	}

	public static Alert alertText() {
		Class<? extends Alert> class1 = driver.switchTo().alert().getClass();
		return null;
	}

	// ..........................SWITCH TO WINDOW......................//
	public static WebDriver window(String win) {
		WebDriver window = driver.switchTo().window(win);
		return window;

	}

	// .........................WINDOW HANDLES......................//

	public static String getWindowhandle(int a) {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;

	}

	public static void windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
	}

	// .............................TAKE SCREENSHOT.........................//
	public static void screenshots(String string) throws IOException {

		TakesScreenshot st = (TakesScreenshot) driver;

		File from = st.getScreenshotAs(OutputType.FILE);

		File to = new File("C:\\Users\\New PC\\eclipse-workspace\\mavetng\\src\\test\\resources\\Screenshot\\facebook.png");
		FileUtils.copyFile(from, to);
	}

	//........................getscreenshot..................................//
	
//	public static  <getScreenshot, getscreenshot> void getScreenshot(String a) {
//     getScreenshot s=(getScreenshot) driver;
//     
     
	
	
	
	
	// .............................JAVA SCRIPT................................//

	// entersendkeys

	public static void jsfindele(WebElement testuser, String g) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','mukesh')", testuser);

	}

	public static void bottonClick(WebElement jsc) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click()", jsc);
	}

	public static Object jsGetattribute(WebElement testuser) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object s = js.executeScript("return arguments[0].getAttribute('value')", testuser);
		return s;

	}

}
