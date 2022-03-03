package com.example.demo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAssignmentApplication {

	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
		        SpringJDBCConfiguration.class);

		    EmployeeDAO empDAO = applicationContext.getBean(EmployeeDAO.class);

		    String empName = empDAO.getEmployeeName(1);

		    System.out.println("Employee name is " + empName);

		    applicationContext.close();
		  }
	}


