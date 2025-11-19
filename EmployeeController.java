package com.controller;

import com.service.EmployeeService;

public class EmployeeController {
	public static void main(String[] args) throws Exception {
		
		 EmployeeService  ee =new  EmployeeService ();
		 ee.insertData();
		ee.selectData();
		 ee.updateData();
		 ee.deleteData();
		 
	}

}
