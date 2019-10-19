package com.fabio.javacompletoudemy.secao014aula126.application;

import com.fabio.javacompletoudemy.secao014aula126.domain.entity.Employee;
import com.fabio.javacompletoudemy.secao014aula126.domain.entity.OutsoucedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao009aula108
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> listEmployee = new ArrayList<>();
		
		
		System.out.print("Enter the number of employees: ");
   		int numberEmployees = sc.nextInt();

		for (int i = 1; i <= numberEmployees; i++) {
			System.out.printf("Employee #%d data: %n", i);
			System.out.println("Outsoufarced? (y/n) ");
			char yesNoChar = sc.next().charAt(0);
			boolean isOutsourced = yesNoChar == 'y';
			
			System.out.println("Name: ");
			String name = sc.next();
			
			System.out.println("Hours: ");
			int hours = sc.nextInt();
			
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			Employee employee = new Employee(name, hours, valuePerHour);
			
			if (isOutsourced) {
				System.out.println("Addicional charge: ");
				double addicionalCharge = sc.nextDouble();
				
				employee = new OutsoucedEmployee(name, hours, valuePerHour, addicionalCharge);
			}
			
			listEmployee.add(employee);
			
			System.out.println("");
		}
		
		System.out.println("PAYMENTS:");
		for (Employee employee : listEmployee) {
			System.out.printf("%s - $ %.2f %n", employee.getName(), employee.payment());
		}
	}

}
