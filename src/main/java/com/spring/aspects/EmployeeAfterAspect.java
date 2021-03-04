package com.spring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAfterAspect {
	
	@After("args(name)")
	public void logStringArguments(String name) {
		System.out.println("Running the After advise for calling single argument "+name);
	}
	
	@AfterThrowing("within(com.spring.model.Employee)")
	public void logExceptions(JoinPoint joinPoint) {
		System.out.println("Running the After throwing advice for exceptions in model class"+joinPoint.toString());
	}
	
	@AfterReturning(pointcut="execution(* getName())", returning = "returnString")
	public void logReturnValue(String returnString) {
		System.out.println("Running the After asvuse on checking the return value "+returnString);
	}
}
