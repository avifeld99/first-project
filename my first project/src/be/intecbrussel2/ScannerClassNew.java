package be.intecbrussel2;

import java.util.Scanner;

public class ScannerClassNew {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);

        //System.out.println("Enter username: ");

        //String username = myScanner.nextLine();

        //System.out.println("My username = " + username.toUpperCase());

        //int number = myScanner.nextInt();

        //System.out.println("Enter name: ");
        //String name = myScanner.nextLine();

        //System.out.println("Enter age: ");
        //int age = myScanner.nextInt();

        //System.out.println("Enter salary: ");
        //double salary = myScanner.nextDouble();

        //System.out.println("my name is: " + name
                           //+ "\n My age is:" + age
                           //+ "\n My salary is: " + salary);


        //System.out.println("Enter your password: ");

        //long password = myScanner.nextLong();

        //System.out.println("Thanks, you'll now be redirected to your profile");


        //System.out.println("are you mad? ");

        //boolean maybe = myScanner.nextBoolean();

        //System.out.println("well well well" + maybe);

        //String word1 = myScanner.nextLine(); //lege lijn, anders probleem

        //System.out.println("word of the day");

        //String word = myScanner.nextLine();

        //System.out.println("'inspirational' :) " + word);

        //double myDouble = myScanner.nextDouble();
        //System.out.println(myDouble); // input -> ,    niet .


        double sum = 0;

        while(myScanner.hasNextInt()) {

            double number = myScanner.nextDouble();
            //System.out.println(sum);
            sum += number;
            //System.out.println(sum);

        }

        System.out.println("the sum is: " + sum);












    }
}
