package com.spring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.AspectsConfig;
import com.spring.service.EmployeeService;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MainApplication.class, args);
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AspectsConfig.class);
		EmployeeService employeeService = annotationConfigApplicationContext.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("Spring");
		
		employeeService.getEmployee().throwException();
		
		annotationConfigApplicationContext.close();
	}

}
