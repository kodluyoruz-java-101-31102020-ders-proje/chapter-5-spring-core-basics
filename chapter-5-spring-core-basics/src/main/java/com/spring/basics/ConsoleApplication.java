package com.spring.basics;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.spring.basics.data.exporter.DataExporter;
import com.spring.basics.dto.Salary;
import com.spring.basics.model.service.DepartmentService;
import com.spring.basics.model.service.EmployeeService;

@Component
public class ConsoleApplication implements CommandLineRunner{

	@Autowired
	private DataExporter dataExporter;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	
	@Autowired
	private ApplicationContext applicationContext;
	
	
	public void run(String... args) throws Exception {
		
		// dependency injection yöntemi!
		Salary salary2 = applicationContext.getBean("salary", Salary.class);
		salary2.setValue(15000);
		salary2.setCreateDate(new Date());
		System.out.println(salary2);
		
		// dependency injection yöntemi!
		Salary salary1 = applicationContext.getBean("salary", Salary.class);
		salary1.setValue(20000);
		salary1.setCreateDate(new Date());
		System.out.println(salary1);
		
		String json = dataExporter.convertSalaryToJson(salary1);
		System.out.println(json);
		
		json = dataExporter.convertSalaryToJson(salary2);
		System.out.println(json);
		
		System.out.println("Çalışan Listesi");
		System.out.println(employeeService.getAll());
		
		System.out.println("Departman Listesi");
		System.out.println(departmentService.getAll());
	}
	
	public void sayHello() {
		System.out.println("Hello from ConsoleApplication!");
	}
}
