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
	
	//pointcuts could be targeted to get all methods matching in a particular package
	@Before("execution(* com.spring.service.*.get*())")
	public void getAllAdvice() {
		System.out.println("Advice targeted or executed when the joinpoints are from service package with all pointcuts within the package and starting with get");
	}
}
