package be.intecbrussel2;

import java.util.Scanner;

public class OefeningIfElse {

    public static void main (String[]args) {



        int num = 32;

        if(num < 28) {
            System.out.println("jong");

        } else if(!(num == 32)) {
            System.out.println("klopt");

        } else {
            System.out.println("leuke leeftijd");

        }

        Scanner myScanner = new Scanner(System.in);

        System.out.println("enter a number: ");

        // juiste oplossing
        int number = myScanner.nextInt();

        if(number % 2 == 0) {
            System.out.println("even");

        } else {
            System.out.println("oneven");
        }








    }
}
