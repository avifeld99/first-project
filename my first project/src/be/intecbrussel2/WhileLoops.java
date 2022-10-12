package be.intecbrussel2;

public class WhileLoops {

    public static void main(String[] args) {

        // while(boolean condition) {
        // statements
        // }

        int number = 1;

        while(number <= 5) {
            System.out.println("you made it");
            number++;
        }


        int sum = 0;
        for(int index = 0; index <= 100; index++) {
            if(index %7 == 0) {
                sum += index;

            }
        }
        System.out.println(sum);


        int counter = 1;
        while(counter <= 100) {

            if(counter %7 == 0) {
                sum += counter; // -> sum = sum + counter
            }
            counter++;
        } // einde van de while
        System.out.println("this is the sum: " + sum);










    }
}
