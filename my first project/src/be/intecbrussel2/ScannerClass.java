package be.intecbrussel2;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("enter first name: ");

        String name = myScanner.nextLine();

        System.out.println("this is your name: " + name);


        System.out.println("enter number 01");

        int number01 = myScanner.nextInt();

        System.out.println("your number is: " + number01);

    }
}
