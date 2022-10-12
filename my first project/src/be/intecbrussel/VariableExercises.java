package be.intecbrussel;

public class VariableExercises {

    public static void main(String[] args) {

        //1
        int number; // declaratie
        number = 350; // initialisatie
        int myNumber = 55; // declaratie & initialisatie
        System.out.println(number);
        System.out.println(myNumber);

        //2
        boolean myBoolean = true;
        myBoolean = number > 250;
        System.out.println(myBoolean);

        //3
        int t = 13;
        t += 14;
        //afgekort van 13 + 14 of t + 14
        System.out.println(t);

        int p = 14;
        p *= 10;
        System.out.println(p);

        int l = 675;
        l -= 101;
        System.out.println(l);

        int m = 88;
        m /= 4;
        System.out.println(m);

        int j = 90;
        j %= 11;
        System.out.println(j);


    }
}

