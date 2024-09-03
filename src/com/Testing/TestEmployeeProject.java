package com.Testing;

import com.controller.Controller;
import com.entity.Employee;

public class TestEmployeeProject {
	
	public static void main(String[] args) {
		Controller c1= new Controller();
		System.out.println("1. Single Employee: ");
		Employee emp= c1.controllAPI();
		
		System.out.println(emp);
		
		
		System.out.println("\n2. List of Employee: ");
		Employee emparr[]= c1.controllAPIArray();
		//System.out.println(emp);
		
//		for (int i = 0; i < emparr.length; i++) {
//			
//			System.out.println(emparr[i]);
//			
//		}
		
		
		for (Employee e:emparr) {		// for each loop
			if(e.getSal()>20000) {
				
				 
				System.out.println(e);
			}
			System.out.println(e.getSal()+", ");
			System.out.print(e.getDept());
		}
	}

}
