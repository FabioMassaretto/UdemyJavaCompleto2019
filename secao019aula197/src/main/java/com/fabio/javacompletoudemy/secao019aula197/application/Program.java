package com.fabio.javacompletoudemy.secao019aula197.application;

import com.fabio.javacompletoudemy.secao019aula197.domain.entity.Product;
import com.fabio.javacompletoudemy.secao019aula197.service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        String path = "//Users//fabiomassareto//Documents//Java//fabiomassaretto//GitHub//UdemyJavaCompleto2019//secao018aula197//src//main//resources//in.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.print("Most expensive: ");
            System.out.println(x);
        }catch (IOException ioe){
            System.out.println("Error: " + ioe.getMessage());
        }
    }
}
