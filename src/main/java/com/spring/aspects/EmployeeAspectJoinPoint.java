package com.spring.aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspectJoinPoint {

	@Before("execution(public void com.spring.model..set*(*))")
	public void loggingwithtragetarg(JoinPoint joinPoint) {
		//method to find the target method
		System.out.println("Before running logging advice on method"+joinPoint.toString());
		System.out.println("method arguments "+Arrays.toString(joinPoint.getArgs()));
	}
	
	//method to create advice for methods with exactly one argument, the argument name should be same a targeted method
	@Before("args(name)")
	public void logStringargument(String name) {
		System.out.println("String argument passed is"+name);
	}
}
