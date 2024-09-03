package com.controller;

import com.entity.Employee;
import com.service.Service;

public class Controller {

	Service service;
	
	public Employee controllAPI() {
		
		service = new Service();
		Employee e1= service.serviceMethod();
		return e1;
		
	}
	
	public Employee[] controllAPIArray() {
		service = new Service();
		Employee[] e2= service.serviceMethod2();
		
		return e2;
	}
	
}
