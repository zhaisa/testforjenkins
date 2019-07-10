package listener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
	    IRetryAnalyzer retryAnalyzer = annotation.getRetryAnalyzer();//获取到retryAnalyzer的注解
	    if (retryAnalyzer == null){ 
	    	annotation.setRetryAnalyzer(TestRetryAnalyzer.class); 
	    	}  //如果注解为空，则动态设置注解，以确保用例失败后重跑。
	}

}
