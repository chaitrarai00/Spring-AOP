package com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.aspects.EmployeeAfterAspect;
import com.spring.aspects.EmployeeAnnotationAspect;
import com.spring.aspects.EmployeeAroundAspect;
import com.spring.aspects.EmployeeAspect;
import com.spring.aspects.EmployeeAspectJoinPoint;
import com.spring.aspects.EmployeeAspectPointcut;
import com.spring.model.Employee;
import com.spring.service.EmployeeService;

@Configuration
@ComponentScan("com.spring")
public class AspectsConfig {
	
	@Bean
	public Employee employee() {
		return new Employee();
	}
	
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeService();
	}
	
	@Bean
	public EmployeeAspect employeeaspect() {
		return new EmployeeAspect();
	}
	
	@Bean
	public EmployeeAspectPointcut employeeaspectpointcut() {
		return new EmployeeAspectPointcut();
	}
	
	@Bean
	public EmployeeAspectJoinPoint employeeaspectjoinpoint() {
		return new EmployeeAspectJoinPoint();
	}
	
	@Bean
	public EmployeeAfterAspect employeeafteraspect() {
		return new EmployeeAfterAspect();
	}
	
	@Bean
	public EmployeeAroundAspect employeearoundaspect() {
		return new EmployeeAroundAspect();
	}
	
	@Bean
	public EmployeeAnnotationAspect employeeAnnotationAspect() {
		return new EmployeeAnnotationAspect();
	}
}
