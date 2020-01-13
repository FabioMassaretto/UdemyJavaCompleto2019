package com.fabio.javacompletoudemy.secao019aula199.application;

import com.fabio.javacompletoudemy.secao019aula199.domain.entity.Circle;
import com.fabio.javacompletoudemy.secao019aula199.domain.entity.Rectangle;
import com.fabio.javacompletoudemy.secao019aula199.domain.entity.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Shape> myShape = new ArrayList<>();
        myShape.add(new Rectangle(3.0, 2.0));
        myShape.add(new Circle(2.0));

        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(2.0));
        myCircle.add(new Circle(3.0));
        System.out.println("Total area: " + totalArea(myCircle));
    }

    private static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
