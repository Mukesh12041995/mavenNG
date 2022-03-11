package org.testng;

import org.Bassclass.Baseclass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class fbbook extends Baseclass {
	@Test
	private void book() {
		SoftAssert s = new SoftAssert();
		chromelaunch();
		urllaunch("https://www.facebook.com/");
		s.assertTrue(getcurrenturl().contains("facebook"), "verify url");
		maxi();
		impwait(10);
		fbpage fb = new fbpage();
		sendkeys(fb.getusername(), "mukesh");
		s.assertEquals(getattribute(fb.getusername()), "mukesh", "verify username");
		sendkeys(fb.getuserpass(), "987654");
		s.assertEquals(getattribute(fb.getuserpass()), "987654", "verify Password");

	}
}

// public static void main(String[] args) throws InterruptedException {
// SoftAssert s=new SoftAssert();
// chromelaunch();
// urllaunch("https://www.facebook.com/");
// s.assertTrue(getcurrenturl().contains("facebook"), "verify url");
// maxi();
// impwait(10);
//
// fbpage fb=new fbpage();
// fb.start();
// sendkeys(fb.getusername(),"mukesh");
//
// sendkeys(fb.getuserpass(),"4587565");
//// s.assertEquals(getattribute(fb.getuserpass()),"4587565");
// click(fb.login());
//
// Thread.sleep(5000);
// s.assertTrue(getcurrenturl().contains("privacy_mutation_token"), "after
// login");
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
// }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
// }
