package be.intecbrussel;

public class datatypes {

    public static void main(String[] args) {

        byte myByte = 12;
        byte meSecondByte = 90;
        int result = myByte + myByte; //NO BYTE!

        short myShort = 400;
        short mySecondShort = 300;
        int shortResult = myShort + mySecondShort; //NO SHORT!

        long myLong = 6776567456434L; //long number with L

        float myFloat = 3.587976785675854564F; // float with F
        double myDouble = 5.59689656754584668; // D optioneel

        System.out.println(myFloat /2);
        System.out.println(myDouble);

        boolean myBoolean = true;
        boolean myBoolean2 = false;
        myBoolean = myShort > 200;

        System.out.println(myBoolean);


        char myCharacter = 'w';

        System.out.println(myCharacter);


        int myNumber = 34; // niet kommagetallen
        double myDecimal = 3.4; // kommagetallen
        boolean condition = true; // condities

    }

}
