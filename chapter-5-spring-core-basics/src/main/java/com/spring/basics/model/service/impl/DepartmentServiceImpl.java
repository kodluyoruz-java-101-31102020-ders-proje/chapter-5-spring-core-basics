package com.spring.basics.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.basics.model.dao.DepartmentDao;
import com.spring.basics.model.service.DepartmentService;

@Service("departmentServiceImpl")
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	
	
	@Override
	public List<String> getAll() {
		
		List<String> names = departmentDao.getNames();
		return names;
	}
}
