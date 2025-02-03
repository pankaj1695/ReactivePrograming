package com.javatechie.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.webflux.dao.EmployeeDao;
import com.javatechie.webflux.dto.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService {
@Autowired
	public static EmployeeDao dao;
EmployeeService(EmployeeDao employeeDao){
	this.dao = employeeDao;
}

	//inserting employee object
public Mono<Employee> createEmployee(Employee employee){
	return dao.save(employee);
}
// getting employee by id

public Mono<Employee> findById(Integer id){
	return dao.getByiId(id);
}
//gett all Employee

public Flux<Employee> getAllEmployee(){
	return dao.getAllEmp();
}
public Mono<Employee> updateEmp(Integer id,Employee employee){
	 return dao.update(id, employee);
}

//delete Employee

public Mono<Void> deleteEmp(Integer id){
	 return dao.delete(id);
	
}
public Flux<Employee> getlistedemp(){
	return dao.getEmpList();
}


}
