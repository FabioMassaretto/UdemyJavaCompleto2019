package com.fabio.javacompletoudemy.secao018aula192.application;

import com.fabio.javacompletoudemy.secao018aula192.domain.entity.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "//Users//fabiomassareto//Documents//Java//fabiomassaretto//GitHub//UdemyJavaCompleto2019//secao018aula192//src//main//resources//in.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String employeeCsv = br.readLine();
            while (employeeCsv != null){
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }

            Collections.sort(list);
            for(Employee emp : list){
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
