package be.intecbrussel2;

public class Operators {

    public static void main(String[]args) {

        int num01 = 5;
        int num02 = 10;

        if(!(num01 > num02 && num01 < 8)) {
            System.out.println("ja");

        } else if(num01 > 3) {
            System.out.println("jazeker");

        } else {
            System.out.println("nee");
        }


        int age = 35;

        if(age < 10) {
            System.out.println("ok");

        } else if(age < 28) {
            System.out.println("goed");

        } else if(age > 45) {
            System.out.println("leuk");

        } else if(age < 49) {
            System.out.println("juist");

        } else {
            System.out.println("beter");

        }



        for(int index = 0; index <= 15; index++)  {
            System.out.println("nummer: " + index);
        }










    }
}
