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
		EmployeeService employeeService=annotationConfigApplicationContext.getBean(EmployeeService.class);
		employeeService.getEmployee().setName("Saviour");
		System.out.println(employeeService.getEmployee().getName());
	}

}
