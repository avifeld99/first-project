package be.intecbrussel2;

public class OefeningBasisProgrammeren {

    public static void main(String[]args) {


        //vraag 1
        int number = 253;

        if(number %2 == 0) {
            System.out.println("even nummer");
        } else {
            System.out.println("oneven nummer");
        }


        //vraag 2

        //vraag 3

        int study = 3;

        while(study > 2 && study < 4) {
            System.out.println("3 uur gestudeerd");
            study++;
        }


        //vraag 4

        long getal = 8996305115L;

        if(getal %5 == 0 && getal %6 == 0) {
            System.out.println("deelbaar door 5 en 6");
        } else {
            System.out.println("niet deelbaar door 5 en 6");
        }


        //vraag 5

        int stocks = 400;

        if(stocks >= 750) {
            System.out.println("we gaan trouwen want + " + stocks);
        } else if (stocks >= 300 && stocks < 750) {
            System.out.println("ik koop je een Ipad want + " + stocks + " maar minder dan 750");
        } else if (stocks >= 100 && stocks < 300) {
            System.out.println("we doen een etentje want + " + stocks + " maar minder dan 300");
        } else {
            System.out.println("ik DUMP je want je bent te arm -> minder dan 100!");
        }


        //vraag 6

        //vraag 7

        int risico = 65;

        if(risico >= 65) {
            System.out.println("risicolevel 3");
        } else if (risico >= 45) {
            System.out.println("risicolevel 2");
        } else if (risico >= 25) {
            System.out.println("risicolevel 1");
        } else {
            System.out.println("risicolevel 0");
        }

        //ik weet niet hoe ik een risicolevel kan toepassen om het nadien in eenvoudige getallen
        // van 1, 2 en 3 te kunnen gebruiken voor Switch


        //vraag 8

        //vraag 9

        int netto = 1850;





    }
}
// ik heb het gevoel van de leerstof redelijk goed te begrijpen maar toch wel heel moeilijk heb om het
// aan te passen bij oefeningen, gebrek aan creativiteit en flexibiliteit misschien.