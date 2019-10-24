package com.fabio.javacompletoudemy.secao010aula094.domain.entity;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void increaseSalary(double porcente) {
		Double salaryPorcentage = salary * (porcente / 100.0);
		salary += salaryPorcentage;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}
	
}
