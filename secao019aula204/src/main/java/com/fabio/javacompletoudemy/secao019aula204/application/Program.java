package com.fabio.javacompletoudemy.secao019aula204.application;

import com.fabio.javacompletoudemy.secao019aula204.domain.entity.LogEntry;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.nextLine();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while(line != null){
                String[] fileds = line.split(" ");
                String userName = fileds[0];
                Date logDate = Date.from(Instant.parse(fileds[1]));

                set.add(new LogEntry(userName, logDate));

                line = br.readLine();
            }

            System.out.println("Total user: " + set.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
