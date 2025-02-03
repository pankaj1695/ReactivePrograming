package com.javatechie.webflux.dao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.javatechie.webflux.dto.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Repository
public class EmployeeDao {
	
	public static int counter=1;
 Employee e1=new Employee(1,"Ahmad","HR",60000.0,"M");
 Employee e2=new Employee(2,"Ramayan","CSE",60000.0,"M");
 Employee e3=new Employee(3,"Ahmad","ECE",750000.0,"M");
 Employee e4=new Employee(4,"Ahmad","IT",80000.0,"M");
 Employee e5=new Employee(5,"Ahmad","HR",70000.0,"M");
 public Map<Integer, Employee> employeeMap = new HashMap<>();
public List<Employee> emplist= Arrays.asList(e1,e1,e3,e4,e5);
 //remote  crearted emp
 public Flux<Employee> getAllEmp(){
	 return Flux.fromIterable(employeeMap.values());
	 
 }
 public static int generateId() {
     return counter++;
 }
 
 public Mono<Employee> getByiId(int id) {
	 return Mono.justOrEmpty(employeeMap.get(id));
	 
 }
 // for Manual created emp
 public Flux<Employee> getEmpList(){
	 return Flux.fromIterable(emplist);
 }
 
 //for inset emp
 
 public Mono<Employee> save(Employee employee){
	 if(employee.getId()==null) {
		 employee.setId(generateId());
		 }
		employeeMap.put(employee.setId(counter), employee) ;
		return Mono.just(employee) ;
	 }
 
 // delete employee
 
 public Mono<Void> delete(Integer id){
	 employeeMap.remove(id) ;
	 return Mono.empty();
 }
 //update employee by id
public Mono<Employee> update(Integer id,Employee employee){
	
	 if (employeeMap.containsKey(id)) {
         employee.setId(id);
         employeeMap.put(id, employee);
         return Mono.just(employee);
	
}
	 return Mono.empty();

 }
}
 
 

