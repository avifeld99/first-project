package be.intecbrussel;

public class FirstJavaClass {
    //hier komt onze code

    public static void main(String[]args) {
        // datatype variabelenaam = waarde
        int number; // int number -> variabele declaratie
        number = 5; // variabele initialisatie
        number = 7;

        System.out.println("hallo intec\nhoe gaat het?");

        System.out.println(number);

        number = number + 10;
        System.out.println(number);

        //number = number % 10; -> modulus
        //System.out.println(number);

        number = number + number;
        System.out.println(number);

        number += 10; // number = number + 10
        System.out.println(number);

        System.out.println("The value of a is " + number + number);
        System.out.println("The value of a is " + (number + number));


    }

}
