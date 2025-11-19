package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeDao {
	
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch412" , "root", "root");

               java.sql.Statement s=  c.createStatement();
               
              
      s.executeUpdate(" insert into employee (emp_id, name , department) values(1,'supriya' , 'IT' ) ");
      System.out.println("inserted");    
      c.close();
               
	}
	
	
	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch412", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("update employee set name='mohite' where emp_id=1");
		System.out.println("Data updated...");
		c.close();

	}
	
	
	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch412", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from  employee where emp_id=1");
		System.out.println("Data deleted...");
		c.close();
		
	}
	
	public void selectData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch412", "root", "root");
		Statement s = c.createStatement();
		s.executeQuery("select * from employee where emp_id=1");
		System.out.println("Data selected...");
		c.close();
	}
	
	
	
	
	
	

}
