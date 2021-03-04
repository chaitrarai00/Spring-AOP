package com.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
 * Pointcuts might lead to aspects getting executed when its not intended
 * the expressions has to be made as precise and confined as possible 
 * but unintended introduction to a new getName method in the example might lead to an 
 * Advice calls 
 * here we can create custom annotations and avoid such scenarios
 * @Transaction is one such example 
 */
@Aspect
public class EmployeeAnnotationAspect {
	@Before("@annotation(com.spring.aspects.Loggable)")
	public void myAdvice() {
		System.out.println("Executing MyAdvice on a safe custom based annotation approach");;
	}
	
}
