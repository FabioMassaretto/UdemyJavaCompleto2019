package com.fabio.javacompletoudemy.secao020aula220.application;

import com.fabio.javacompletoudemy.secao020aula220.domain.entity.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path:");
        String path = sc.nextLine();

        System.out.print("Enter salary: ");
        Double salary = sc.nextDouble();

        System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));

        List<Employee> employees = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while(line != null) {
                String[] fields = line.split(",");
                String employeeName = fields[0];
                String employeeEmail = fields[1];
                Double employeeSalary = Double.parseDouble(fields[2]);

                employees.add(new Employee(employeeName, employeeEmail, employeeSalary));

                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Comparator<Employee> comp = (e1, e2) -> e1.getEmail().toLowerCase().compareTo(e2.getEmail().toLowerCase());

        employees.stream().sorted(comp)
                .filter(e -> e.getSalary() > salary)
                .forEach(e -> System.out.println(e.getEmail()));

        Double sumSalary = employees.stream()
                .filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
                .map(e -> e.getSalary())
                .reduce(0.0, (x, y) -> x + y).doubleValue();

        System.out.println("Sum of salary of people whose name starts with 'M': " + sumSalary);
    }
}
