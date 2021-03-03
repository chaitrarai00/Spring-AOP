package com.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {
	
	//the parameter passed to before is the pointcut expression and the 
	//getNameAdvice will execute o=when methods with getName is called
	@Before("execution(public String getName())")
	public void getNameAdvice() {
		System.out.println("Advice when getName joinpoint is reached with mentioned pointcut:execution(public String getName()");
	}
	
}
