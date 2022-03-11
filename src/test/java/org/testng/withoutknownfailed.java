package org.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;

public class withoutknownfailed implements IAnnotationTransformer {

	public void transform(ITestAnnotation m, Class arg1, Constructor arg2, Method arg3) {

		m.setRetryAnalyzer(withknownfailed.class);
	}

}
