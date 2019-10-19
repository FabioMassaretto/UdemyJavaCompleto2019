package com.fabio.javacompletoudemy.secao015aula140.application;

import com.fabio.javacompletoudemy.secao015aula140.domain.entity.Reservation;
import com.fabio.javacompletoudemy.secao015aula140.domain.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// TODO: Remover comentario apos todas as correcoes de nome
// Correcao de nomenclatura que esta no projeto no eclipse: secao010aula120e121e122
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room number: ");
            int number = sc.nextInt();

            System.out.println("Check-in date (dd/MM/yyyy)");
            Date checkIn = sdf.parse(sc.next());

            System.out.println("Check-out date (dd/MM/yyyy)");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter date to update the reservation: ");
            System.out.println("Check-in date (dd/MM/yyyy)");
            checkIn = sdf.parse(sc.next());

            System.out.println("Check-out date (dd/MM/yyyy)");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in resevartion: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error.");
        }
        sc.close();
    }
}
