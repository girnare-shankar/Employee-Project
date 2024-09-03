package com.dao;

import com.entity.Employee;

public class Dao {

	public Employee oneEmployee(){
		
		return new Employee(101, "Ajay", 45000, "DEV");
	}
	
	public Employee [] manyEmployee() {
		
		Employee[] db=new Employee[5];
		
			db[0]= new Employee(101, "Vijay", 35000, "Testing");
			db[1]= new Employee(110, "Ajay", 37000, "Testing");
			db[2]= new Employee(201, "Sajay", 28000, "Testing");
			db[3]= new Employee(102, "Parajay", 65000, "Testing");
			db[4]= new Employee(143, "Jay", 19000, "Testing");
		
		return db;
		
		
	}
}
