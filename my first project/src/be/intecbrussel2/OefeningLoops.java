package be.intecbrussel2;

public class OefeningLoops {

    public static void main(String[]args) {

        // for loop

        for(int index = 0; index <= 100; index++)
        if (index %2 == 0) {  // simpele oplossing!= 3de index -> index +=2
            System.out.println(index);
        }



        for(int index = 4; index < 9; index +=2)  {
            System.out.println("hiiii " + index);
        }


        int sum = 0;

        for(int index = 0; index <= 5; index++) {
            sum += index; // of: sum = sum + index
        }
        double avg = sum/5;
        System.out.println("de som is: " + sum + " het gemiddelde is " + avg);


        // while loop

        int i = 1;
        while (i < 6) {
            System.out.println("Hello World");

            i++;
        }


        int x = 1, summ = 0;
        while (x <= 10) {
            summ = summ + x;
            x++;
        }
        System.out.println("Summation: " + summ);



        boolean hungry = true;
        int count = 0;
        System.out.println("Take flour");
        System.out.println("Add milk");
        System.out.println("Add eggs");
        System.out.println("Mix ingredients");
        while (hungry) {
            ++count;
            System.out.println("Bake pancake " + count);
            System.out.println("Eat pancake " + count);
            if (count == 4) {
                hungry = false;
            }

        }


        //oefening typecasting

        int number01 = 253;
        long number02 = 2365L;

        double myDouble = number01;
        double myDouble2 = number02;
        System.out.println(myDouble);
        System.out.println(myDouble2);

        double number = 10.99;
        int myNumber = (int)number;
        System.out.println(myNumber);

    }
}
