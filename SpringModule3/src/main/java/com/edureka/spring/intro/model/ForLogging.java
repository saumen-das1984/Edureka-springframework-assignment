package com.edureka.spring.intro.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class ForLogging {
	
	@Before("execution (* com.edureka.*.*(..))")
	public void beforeLogging(JoinPoint jointpoint)
	{
		System.out.println("In the beforeLogging of ForLogging Aspect!");
		System.out.println("Intercepted the call to "+jointpoint.getSignature().getName());
	}

}
