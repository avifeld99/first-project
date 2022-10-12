package be.intecbrussel2;

public class MathClass {

    public static void main(String[] args) {


        int numberAbs = Math.abs(-10); //= enkel positieve getal
        System.out.println(numberAbs);

        int number01 = Math.max(10, 100);
        System.out.println(number01);

        int result01 = Math.max(10, 9);
        double result02 = Math.max(10.3, 9.6);
        long result03 = Math.max(17L, 8L);
        float result04 = Math.max(8F, 30.5F);
        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
        System.out.println(result04);  // ctrl - alt - l = rijen onder elkaar krijgen


        double num01 = Math.round(10.3);
        System.out.println(num01);
        double num02 = Math.round(10.8);
        System.out.println(num02);

        double num03 = Math.ceil(10.3);
        System.out.println(num03);

        double num04 = Math.floor(10.8);
        System.out.println(num04);

        double randomNumber01 = Math.random();
        System.out.println(randomNumber01);

        double randomNumber = (Math.random() * 10);
        long randNum = Math.round(randomNumber);
        System.out.println(randNum);

        double result = Math.pow(2.9, 9);
        System.out.println(result);


    }
}
