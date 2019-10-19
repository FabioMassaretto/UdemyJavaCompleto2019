package com.fabio.javacompletoudemy.secao014aula129.domain.entity;

import com.fabio.javacompletoudemy.secao014aula129.domain.entity.enums.Color;

public class Circle extends Shape{

	private double radius;
	
	public Circle() {
	}

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
