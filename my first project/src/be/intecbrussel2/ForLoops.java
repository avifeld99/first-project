package be.intecbrussel2;

public class ForLoops {

    public static void main(String[]args)  {

        // for (statement 1; statement 2; statement 3;) {
        // initialiseren -> int index = 0;
        // testconditie -> index <= 10;
        // uitvoering verhogin/verlaging -> index++
        //}

        for(int index = 0; index < 10; index++) {
            System.out.println(index);
        }

        // een for loop die de even getallen van laag naar hoog uitprint.
        // een for loop die de oneven getallen van hoog naar laag uitprint.

        for(int index = 0; index < 100 + 1; index+=2) { // <= 100 of 100 + 1 -> 100 inbegrepen
            System.out.println("even " + index);
        }

        for(int index = 99; index > 0; index--) {
            if (index %2 == 1) {
                System.out.println("oneven " + index);
            }
        }


    }
}
