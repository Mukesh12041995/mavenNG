package org.testng;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.Bassclass.Baseclass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Screens extends Baseclass{
	
	@BeforeClass
	private void brforeclass() {
		chromelaunch();
    System.out.println("facebook testing");
		}
	@BeforeMethod
	private void beforemethod() {
       Date d=new Date ();
      System.out.println("before method"+ d);
	}
	@Test
	private void test1() throws InterruptedException {
urllaunch("https://www.facebook.com/");
fbpage f=new fbpage();
maxi();
Thread.sleep(5000);
sendkeys(f.getusername(), "mukesh");
		sendkeys(f.getuserpass(), "987654");
		click(f.login());
	Thread.sleep(5000);
	
	}
	
	@AfterMethod
	private void aftermethod(ITestResult a) throws IOException {
       System.out.println("aftermethod");
		
		int st = a.getStatus();
		if(st==1) {
			String name = a.getName();
			Date d=new Date ();
			int i = d.getSeconds();
			
			TakesScreenshot ss=(TakesScreenshot)driver;
			File from = ss.getScreenshotAs(OutputType.FILE);
			File to=new File("C:\\Users\\New PC\\eclipse-workspace\\mavetng\\src\\test\\resources\\Screenshot\\"+i+".png");
			FileUtils.copyFile(from, to);
			
			
//			screenshots("facebook"+name);
			
		}
	
	
		
	}
	
	
	
	
	
	
	

}
