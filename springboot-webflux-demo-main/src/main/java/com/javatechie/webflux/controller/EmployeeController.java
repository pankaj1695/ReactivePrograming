package com.javatechie.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.webflux.dto.Employee;
import com.javatechie.webflux.service.EmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
@Autowired	
EmployeeService employeeService ;
EmployeeController(EmployeeService employeeService){
	
this.employeeService=employeeService;
}
//insert data in database
@PostMapping
public Mono<Employee> insertEmp(@RequestBody Employee employeeDto){
	return employeeService.createEmployee(employeeDto);
}
// get employee by id
@GetMapping("/{id}")
public Mono<Employee> getEmployeebyId( @PathVariable Integer id){
	return employeeService.findById(id);
}
//get all Employee

@GetMapping("/all")
public Flux<Employee> findAllEmployee(){
	return employeeService.getAllEmployee();
	
}
//update employee
@PutMapping("/{id}")
public Mono<Employee> update(Integer id ,Employee employee){
	return employeeService.updateEmp(id, employee);
}
//delete employee
@DeleteMapping("/{id}")
public Mono<Void> deleteEmployee( @PathVariable Integer id){
	return employeeService.deleteEmp(id);
}
@GetMapping("/listedemp")
public Flux<Employee> getlistedEmployee(){
	return employeeService.getlistedemp();
}
// commit
@GetMapping("/listedemp")
public Flux<Employee> getlisteEmployee(){
	return employeeService.getlistedemp();
}
}