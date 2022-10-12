package be.intecbrussel2;

public class Typecasting {

    public static void main(String[] args) {

        int myInt = 9;
        System.out.println(myInt);

        double myDouble = myInt;
        System.out.println(myDouble);



        double myDouble2 = 9.99;
        System.out.println(myDouble);

        int myInt2 = (int)myDouble;
        System.out.println(myInt); // resultaat is 9 ipv 9.99!


        //boolean myBoolean = true;
        //long myLong = (long)myBoolean; -> kan niet, boolean is alleen false or true






    }
}
