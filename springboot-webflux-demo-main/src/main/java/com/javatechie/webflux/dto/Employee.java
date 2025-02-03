package com.javatechie.webflux.dto;

public class Employee {
private Integer id;
private String name;
private  String depatment;
private double salary;
private String gender ;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", depatment=" + depatment + ", salary=" + salary + ", gender="
			+ gender + "]";
}
public Integer getId() {
	return id;
}
public Integer setId(Integer id) {
return	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepatment() {
	return depatment;
}
public void setDepatment(String depatment) {
	this.depatment = depatment;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Employee(Integer id, String name, String depatment, double salary, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.depatment = depatment;
	this.salary = salary;
	this.gender = gender;
}
public Employee() {
}
}