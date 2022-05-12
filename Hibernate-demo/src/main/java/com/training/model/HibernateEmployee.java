package com.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="HibernateEmployee")
public class HibernateEmployee {
	@Id
	@Column(name="employee_id")
	private int id;
	private String name;
	private String Department;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public HibernateEmployee(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
		this.salary = salary;
	}
	public HibernateEmployee() {
		super();
	}
	@Override
	public String toString() {
		return "HibernateEmployee [id=" + id + ", name=" + name + ", Department=" + Department + ", salary=" + salary
				+ "]";
	}
	
	
}