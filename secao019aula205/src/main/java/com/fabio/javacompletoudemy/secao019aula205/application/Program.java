package com.fabio.javacompletoudemy.secao019aula205.application;

import com.fabio.javacompletoudemy.secao019aula205.domain.entity.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Student> set = new HashSet<>();

        System.out.println("How many students for course A?");
        Integer numberStudentsCourseA = sc.nextInt();

        for (int i = 0; i < numberStudentsCourseA; i++){
            Integer id = sc.nextInt();
            set.add(new Student(id, ""));
        }

        System.out.println("How many students for course A?");
        Integer numberStudentsCourseB = sc.nextInt();

        for (int i = 0; i < numberStudentsCourseB; i++){
            Integer id = sc.nextInt();
            set.add(new Student(id, ""));
        }

        System.out.println("How many students for course A?");
        Integer numberStudentsCourseC = sc.nextInt();

        for (int i = 0; i < numberStudentsCourseC; i++){
            Integer id = sc.nextInt();
            set.add(new Student(id, ""));
        }

        System.out.println("Total of students: " + set.size());
    }
}
