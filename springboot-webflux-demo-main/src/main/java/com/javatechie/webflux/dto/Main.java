package com.javatechie.webflux.dto;

import com.javatechie.webflux.dao.EmployeeDao;

public class Main {
public static void main(String[] args) {
	EmployeeDao e= new EmployeeDao();
	System.out.println(e.employeeMap);
}
}
