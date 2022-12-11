package be.intecbrussel2;

public class OefeningSwitch {

    public static void main(String[]args) {

        //switch oefeningen
        //oefening 1
        int time = 24;

        if(time >= 0 && time <= 6) {
            System.out.println("It's night");
        } else if(time > 6 && time <= 12) {
            System.out.println("It's morning");
        } else if(time > 12 && time <= 18) {
            System.out.println("It's afternoon");
        } else if(time > 18 && time <= 24) {
            System.out.println("It's Evening");
        } else {
            System.out.println("Nope invalid input");
        }

        switch (time) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("it's night");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("it's morning");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                System.out.println("it's afternoon");
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("it's evening");
                break;
            default:
                System.out.println("nope, invalid input");
        }

        //oefening 2
        int number = 15;
        int number2 = 20;









        //conditional operator oefeningen
        //oefening 1

        int num = 25;

        String message = num > 0 ? "nummer positief" : "nummer negatief";
        System.out.println(message);



        //oefening 2

        int test = 83;

        String message2 = test > 60 ? "geslaagd -> boven de 60%" : "onder 60%, niet geslaagd :(";
        System.out.println(message2);










    }
}
