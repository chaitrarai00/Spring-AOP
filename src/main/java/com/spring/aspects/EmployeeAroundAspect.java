package com.spring.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAroundAspect {
	/*
	 * Around has this feature of controlling the behaviour of the method it targets 
	 * thats the joinpoint and also the feature to execute or not execute that method
	 */
	@Around("execution (* com.spring.model.Employee.getName())")
	public Object EmpAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Object value=null;
		System.out.println("Before invoking Around targetted method");
		try {
			value=proceedingJoinPoint.proceed();
			// this argument lets you call the targeting joinpoint method and returns the value
		}catch(Throwable e) {
		e.printStackTrace();
		}
		System.out.println("After invoking Around targetted method");
		return value;
	}
}
