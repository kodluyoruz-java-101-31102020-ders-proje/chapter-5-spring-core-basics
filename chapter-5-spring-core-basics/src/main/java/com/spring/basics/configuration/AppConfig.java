package com.spring.basics.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.ConsoleApplication;
import com.spring.basics.data.exporter.SalaryJsonConverter;

@Configuration
@ComponentScan(basePackages = {
		"com.spring.basics.dto",
		"com.spring.basics.data.exporter",
		"com.spring.basics.model.dao.impl",
		"com.spring.basics.model.service.impl"
})
public class AppConfig {

	@Bean("sJsonConverter")
	public SalaryJsonConverter createSalaryJsonConverter() {
		
		return new SalaryJsonConverter();
	}
	
	@Bean("consoleApplication")
	public ConsoleApplication createConsoleApplication() {
		
		return new ConsoleApplication();
	}
	
	/* Bean etiketi ile ancak tek tek tanımlama yapmak zorundayız.
	 * 
	@Bean("departmentDaoImpl")
	public DepartmentDao createDepartmentDao() {
		
		return new DepartmentDaoImpl();
	}
	*/
}
