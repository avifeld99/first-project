package be.intecbrussel2;

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {

        Random random = new Random();


        int randomNum = random.nextInt(100); //'bound:' werkt alleen met int
        System.out.println(randomNum);

        long randomLong = random.nextLong();
        System.out.println(randomLong);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        float randomFloat = random.nextFloat();
        System.out.println(randomFloat);

        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);


        //int num = 67;
        System.out.println(random.nextInt(45));
        System.out.println(random.nextInt(45));
        System.out.println(random.nextInt(45));
        System.out.println(random.nextInt(45));
        System.out.println(random.nextInt(45));
        System.out.println(random.nextInt(45));










    }
}
