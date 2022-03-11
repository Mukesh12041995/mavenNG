package org.testng;

import org.Bassclass.Baseclass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(withoutknownfailed.class)
public class sample extends Baseclass {
@Test()
private void samp() {


	SoftAssert s=new SoftAssert();
	chromelaunch();
	urllaunch("https://adactinhotelapp.com/");
	impwait(10);
	maxi();
	PageHotel p=new PageHotel();
	p.start();
	sendkeys(p.getusername(),"mukesh");
	s.assertEquals(getattribute(p.getusername()), "balaji");
	sendkeys(p.getpassword(), "9876543");
	s.assertEquals(getattribute(p.getpassword()), "9876543");
	System.out.println("done");
	s.assertAll();
	
}
	
}
	
	
	
	
	
	
	
	
	
	

