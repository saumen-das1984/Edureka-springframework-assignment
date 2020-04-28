package com.edureka.spring.intro.model;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		Object obj;
		System.out.println("Before you can proceed you can write the code you want to perform before the actual logic execution");
		obj=methodInvocation.proceed();
		System.out.println("After you can proceed you can write the code you want to perform after the actual logic execution");
		return obj;
	}

}
