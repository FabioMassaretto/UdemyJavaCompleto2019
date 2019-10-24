package com.fabio.javacompletoudemy.secao010aula094.application;

import com.fabio.javacompletoudemy.secao010aula094.domain.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao005aula076
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter many employees wil be registered: ");
		int n = sc.nextInt();
		System.out.println();
		
		List<Employee> listEmployee = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d%n", i+1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			System.out.println();
			
			listEmployee.add(new Employee(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer employeeId = sc.nextInt();
			
		Employee employee = listEmployee.stream().filter(x -> x.getId().equals(employeeId)).findFirst().orElse(null);
		
		if(employee != null) {
			System.out.print("Enter the porcentage: ");
			double porcentage = sc.nextDouble();
			employee.increaseSalary(porcentage);
		} else {
			System.out.println("This id does not exist!");
		}
		System.out.println();
		
		System.out.println("List of employees:");
		for (Employee item : listEmployee) {
			System.out.printf("%d, %s, %.2f %n", 
					item.getId(),
					item.getName(),
					item.getSalary());
		}
		
		sc.close();

	}

}
