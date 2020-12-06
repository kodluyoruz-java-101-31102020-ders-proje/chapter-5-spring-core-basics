package com.spring.basics.model.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.basics.model.dao.EmployeeDao;

@Repository("employeeDaoImpl")
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public List<String> getNames() {
		
		return Arrays.asList("Ali", "Ahmet", "Ayşe");
	}

}
