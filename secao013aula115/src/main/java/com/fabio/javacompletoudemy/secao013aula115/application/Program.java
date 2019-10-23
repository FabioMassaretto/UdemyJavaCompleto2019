package com.fabio.javacompletoudemy.secao013aula115.application;

import com.fabio.javacompletoudemy.secao013aula115.domain.entity.Department;
import com.fabio.javacompletoudemy.secao013aula115.domain.entity.HourContract;
import com.fabio.javacompletoudemy.secao013aula115.domain.entity.Worker;
import com.fabio.javacompletoudemy.secao013aula115.domain.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao008aula097
public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department\'s name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data:");
		System.out.print("Enter worker name: ");
		String workerName = sc.nextLine();
		System.out.print("Enter worker level: ");
		String level = sc.nextLine();
		System.out.print("Enter worker base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(level), baseSalary, new Department(departmentName));
		
		System.out.print("How many contract to this worker? ");
		int nContract = sc.nextInt();
		
		for (int i = 0; i < nContract; i++) {
			System.out.printf("Enter contract #%d data:%n", i + 1);
			System.out.print("Enter date (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Enter value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Enter duration (hours): ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(date, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.split("/")[0]);
		int year = Integer.parseInt(monthAndYear.split("/")[1]);
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for: " 
				+ monthAndYear + ": " + worker.income(year, month));
		
		
		sc.close();
	}

}
