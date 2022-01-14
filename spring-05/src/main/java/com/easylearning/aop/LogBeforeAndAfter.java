package com.easylearning.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAndAfter implements MethodBeforeAdvice, AfterReturningAdvice {

	//advice: what to do and when to do
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("-------------------------------------------------------");
		System.out.println("Entered: " + target.getClass() + "." + method.getName());
		

	}

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Exit: " + target.getClass() + "." + method.getName());
		System.out.println("______________________________________________________");

	}

}
