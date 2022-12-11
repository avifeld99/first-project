package be.intecbrussel2;

public class BreakContinueSwitch {

    public static void main(String[]args) {


        //break
        int money = 250;

        for(int index = 0; index < money + 1; index++) {
            if(index == 120) {
                System.out.println("shit, i lost 120 :(");
                break;
            }
            System.out.println(index);
        }


        //continue
        int day2 = 32;

        for(int index = 0; index < day2 +2; index++) {

            if(index == 13) {
                System.out.println("number 13 brings BAD luck!");
                continue;
            }
            System.out.println(index);
        }


        //switch
        int day = 6;

        if(day == 1) {
            System.out.println("it's Sunday");
        } else if(day == 2) {
            System.out.println("it's Monday");
        } else if(day == 3) {
            System.out.println("it's Tuesday");
        } else if(day == 4) {
            System.out.println("it's Wednesday");
        } else if(day == 5) {
            System.out.println("it's Thursday");
        } else if(day ==6) {
            System.out.println("it's Friday");
        } else if(day == 7) {
            System.out.println("it's Saturday");
        } else {
            System.out.println("you mean month?");
        }


        switch (day) {
            case 1:
                System.out.println("it's Sunday babe");
                break;
            case 2:
                System.out.println("it's Monday babe");
                break;
            case 3:
                System.out.println("it's Tuesday babe");
                break;
            case 4:
                System.out.println("it's Wednesday babe");
                break;
            case 5:
                System.out.println("it's Thursday babe");
                break;
            case 6:
                System.out.println("it's Friday babe");
                break;
            case 7:
                System.out.println("it's Saturday babe");
                break;
            default:
                System.out.println("babe it's about days, not months");


        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("ימי חול");
                break;
            case 6:
                System.out.println("ערב שבת");
                break;
            case 7:
                System.out.println("נוונוו! שבת קודש!");
                break;
            default:
                System.out.println("sorry, wrong input");

        }



        String str="you";
        switch(str)
        {
            case "I":
                System.out.println("I want to become a doctor.");
            case "we":
                System.out.println("We are Indian.");
            case "you":
                System.out.println("You are my crony friend.");
            case "our":
                System.out.println("Our Indian flag has tri-color.");
            default:
                System.out.println("It is the default statement.");
                // fall through without break
        }



        int index = 0;
        while (index < 10) {
            System.out.println(index);
            index++;
            if (index == 4) {
                break;
            }
        }



        String word = "hallo";
        System.out.println(word);





        //ternary operator

        int num = 5;

        if(num > 10) {
            System.out.println("number is bigger than 10");
        } else {
            System.out.println("number is smaller than 10");
        }

        // value = condition ? trueExpression : falseExpression;

        int number = 15;

        String message = number > 10 ? "number >10" : "number <10";
        System.out.println(message);





    }
}
