package com.easylearning.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class TransactonAspect {
	
	@Around("execution(* com.easylearning.service.LoanService.*(..))")
	public void around(ProceedingJoinPoint pjp) {
		
		try {
			System.out.println("started the transaction");
			pjp.proceed();
			System.out.println("commit is called");
		} catch (Throwable e) {
			System.out.println("rollback is called");
		}
		
	}

}
