package com.service;

import com.dao.EmployeeDao;

public class EmployeeService   {
	
	
	public void insertData() throws Exception {
		
	
	EmployeeDao d =new EmployeeDao();
	d.insertData();

	}
	
	public void updateData()  throws Exception {

		EmployeeDao d =new EmployeeDao();
		d.updateData();
	}
	
	public void deleteData()  throws Exception {

		EmployeeDao d =new EmployeeDao();
		d.deleteData();
	}
	
	
	public void  selectData() throws Exception {
		EmployeeDao d =new EmployeeDao();
		d.selectData();
	}
	
	
	
	
}
