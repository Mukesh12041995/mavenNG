package org.testng;

public class withknownfailed implements IRetryAnalyzer{
int a=0,b=7;

	public boolean retry(ITestResult arg0) {
   if(a<b) {
	a++;
	return true;
   }
		return false;
	}

}
