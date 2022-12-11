package be.intecbrussel2;

public class IfStatement {

    public static void main(String[] args) {


        //pseudo code

        //input -> age
        int age = 36;

        //if age >= 18
        if(age >= 18) {
            System.out.println("yes, i'm older than 18");
        } else {
            System.out.println("nope, younger");
        }
             //run code

        // we hebben 4 dagdelen. ochtend, middag, avond en nacht.
        // nu willen we een tijd controleren.

        // input
        int time = 0;

        // 4 verschillende condities onderwerp dag 24u.
            // if nacht 0 t/m 6
        if(time >= 0 && time <= 6) {
            System.out.println("it's night");
            // if ochtend 6 t/m 12
        } else if (time > 6 && time <= 12) {
            System.out.println("it's morning");
            // if middag 12 t/m 18
        } else if (time > 12 && time <=18) {
            System.out.println("it's afternoon");
            // if avond 18 t/m 24
        } else if (time > 18 && time <= 24) {
            System.out.println("it's evening");
        } else {
            System.out.println("invalid input");
        }

           // default alles onder of boven 24 uur opneemt.

        // output -> uitkomst


        // schrijf een if statement die controleert op leeftijd.
        // maak 5 cotagorien.
        // en een default die de rest van de data opvangt.

        int leeftijd = 7;

        if (leeftijd >= 30 && leeftijd < 40) {
            System.out.println("perfecte leeftijd");
        } else if (leeftijd >= 20 && leeftijd < 30) {
            System.out.println("nog wa jong");
        } else if (leeftijd >= 15 && leeftijd < 20) {
            System.out.println("pff boze teenager");
        } else if (leeftijd >= 7 && leeftijd < 15) {
            System.out.println("geniet van je zorgeloze jaren");
        } else if (leeftijd < 7) {
            System.out.println("huil maar gerust");
        } else {
            System.out.println("oeps, ge wordt oud");
        }



        int joey = 36;
        int john = 53;
        int eddy = 54;

        // schrijven een programma dat controleert wie van de 3 de oudste is.
        // en ook die controleert of dat de leeftijd gelijk is.

        if(joey > john && joey > eddy) {
            System.out.println("Joey is de oudste");
        } else if (john > joey && john > eddy) {
            System.out.println("John is de oudste");
        } else if (eddy > joey && eddy > john) {
            System.out.println("Eddy is de oudste");
        } else {
            System.out.println("not one person is the oldest");
        }

    }
}
