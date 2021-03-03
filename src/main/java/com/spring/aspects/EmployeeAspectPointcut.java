package com.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspectPointcut {
	
	@Before("getNamePointcut()")
	public void firstAdvice(){
		System.out.println("executing the first advice using the predefined getNamePointcut()");
	}
	
	@Before("getNamePointcut()")
	public void secondAdvice(){
		System.out.println("executing the second advice using the predefined getNamePointcut()");
	}
	
	@Before("allMethodsPointcut()")
	public void allmethodsadvice() {
		System.out.println("executing the advice using the predefined allMethodsPointcut()");
	}
	/*
	 * we define pointcuts which can be resued and called by other joinpoints with advice
	 */
	@Pointcut("execution(public String getName())")
	public void getNamePointcut() {}
	
	@Pointcut("within(com.spring.service.*)")
	public void allMethodsPointcut() {}

}
