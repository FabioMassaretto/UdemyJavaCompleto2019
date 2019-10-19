package com.fabio.javacompletoudemy.secao014aula126.domain.entity;

public class OutsoucedEmployee extends Employee{

	private Double addicionalCharge;

	public OutsoucedEmployee() {
		super();
	}

	public OutsoucedEmployee(String name, Integer hours, Double valuePerHour, Double addicionalCharge) {
		super(name, hours, valuePerHour);
		this.addicionalCharge = addicionalCharge;
	}

	@Override
	public Double payment() {
		Double bonus = (this.addicionalCharge + (this.addicionalCharge * 0.1));
		return super.payment() + bonus;
	}
	
	public Double getAddicionalCharge() {
		return addicionalCharge;
	}
	
}
