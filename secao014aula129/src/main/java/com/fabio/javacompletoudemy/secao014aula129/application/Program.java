package com.fabio.javacompletoudemy.secao014aula129.application;

import com.fabio.javacompletoudemy.secao014aula129.domain.entity.Circle;
import com.fabio.javacompletoudemy.secao014aula129.domain.entity.Rectangle;
import com.fabio.javacompletoudemy.secao014aula129.domain.entity.Shape;
import com.fabio.javacompletoudemy.secao014aula129.domain.entity.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao009aula111
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int numberOfShapes = sc.nextInt();
		
		List<Shape> listShapes = new ArrayList<>();
		for (int i = 1; i <= numberOfShapes; i++) {
			System.out.printf("Shape #%d data:%n", i);
			System.out.print("Rectangle or Circle (r/c)? ");
			sc.nextLine();
			char shape = sc.nextLine().charAt(0);
			
			System.out.print("What is the color? (BLACK/BLUE/RED)? ");
			Color color = Color.valueOf(sc.nextLine());
			
			switch (shape) {
				case 'r':
					System.out.print("Width: ");
					double width = sc.nextDouble();
					System.out.print("Height: ");
					double height = sc.nextDouble();
					listShapes.add(new Rectangle(color,width, height));
					break;
				case 'c':
					System.out.print("Radius: ");
					double radius = sc.nextDouble();
					listShapes.add(new Circle(color, radius));
					break;
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		for(Shape shape : listShapes) {
			System.out.println(shape.area());
		}

	}

}
