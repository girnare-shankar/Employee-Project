package com.service;

import com.dao.Dao;
import com.entity.Employee;

public class Service {
	Dao obj1 =null;
	
	public Employee serviceMethod() {
		obj1=new Dao();
		Employee e1 = obj1.oneEmployee();
		return e1;
	}
	
	public Employee[] serviceMethod2() {
		obj1= new Dao();
		Employee[] e2 = obj1.manyEmployee();
		return e2;
	}
	
	
}
