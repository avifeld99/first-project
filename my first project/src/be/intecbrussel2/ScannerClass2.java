package be.intecbrussel2;

import java.util.Scanner;

public class ScannerClass2 {

    public static void main(String[] args) {

        // schrijven die leeftijd controleerd van de input van de gebruiker
        // camelCase --- PascalCase

        // message -> welkom
        System.out.println("welkom");

        // message -> input data
        System.out.println("voer uw leeftijd in aub");

        // input(scanner)
        Scanner myScanner = new Scanner(System.in);
        int age = myScanner.nextInt();

        // controle leeftijd
           //if leeftijd > 18
           if(age >= 18) {
               // message old enough
               System.out.println("old enough");
           } else {
               // else leeftijd < 18
               // message too young
               System.out.println("too young");
           }

           // message goodbye
           System.out.println("Goodbye");





        // Scanner myScanner2 = new Scanner(System.in);

        System.out.println("enter age for joey");
        int joey = myScanner.nextInt();
        System.out.println("enter age for john");
        int john = myScanner.nextInt();
        System.out.println("enter age for eddy");
        int eddy = myScanner.nextInt();

        // schrijven een programma dat controleert wie van de 3 de oudste is.
        // en ook die controleert of dat de leeftijd gelijk is.

        if(joey > john && joey > eddy) {
            System.out.println("Joey is de oudste");
        } else if (john > joey && john > eddy) {
            System.out.println("John is de oudste");
        } else if (eddy > joey && eddy > john) {
            System.out.println("Eddy is de oudste");
        } else {
            System.out.println("not one person is the oldest");

        }



        //Scanner myScanner3 = new Scanner(System.in);
        System.out.println("enter number: ");

        int number = myScanner.nextInt();

        for(int index = 0; index < number; index++) {
        }
        System.out.println("thanks");



        for(int index = 0; index < 100; index+=2) {
            System.out.println("even " + index);
        }










    }
}
