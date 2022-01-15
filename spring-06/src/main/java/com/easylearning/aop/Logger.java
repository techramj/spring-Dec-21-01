package com.easylearning.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class Logger {
	
	//when to do
	@Before("execution(* com.easylearning.service.LoanService.*(..))")
	public void beforeLog(JoinPoint jp) {
		//what to do
		System.out.println("---------------------Before Log start----------------------");
		System.out.println(jp.getSignature().getDeclaringTypeName()+"."+jp.getSignature().getName());
	}
	
	@After("execution(* com.easylearning.service.LoanService.*(..))")
	public void afterLog(JoinPoint jp) {
		System.out.println(jp.getSignature().getDeclaringTypeName()+"."+jp.getSignature().getName());
		System.out.println("________________________After log End________________________");
	}
	
	@AfterReturning(pointcut = "execution(* com.easylearning.service.LoanService.*(..))", returning = "retValue")
	public void afterReturningLog(JoinPoint jp, Object retValue) {
		System.out.println("value returned: "+retValue);
	}
	
	@AfterThrowing(pointcut = "execution(* com.easylearning.service.LoanService.*(..))", throwing = "exp")
	public void afterThrowing(JoinPoint jp, Exception exp) {
		System.out.println("error occured");
		System.out.println("Exp: "+ exp.getMessage());
		System.out.println(exp.getCause());
		System.out.println(exp.getClass());
	}


}
