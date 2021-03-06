package com.fabio.javacompletoudemy.secao014aula126.domain.entity;

public class Employee {
	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	public Employee() {
		super();
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	public Double payment() {
		return this.hours * this.valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}
}
