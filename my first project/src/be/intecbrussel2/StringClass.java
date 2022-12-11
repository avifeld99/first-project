package be.intecbrussel2;

public class StringClass {

    public static void main(String[] args) {



        String name = "Joey";

        String lastName = new String("       De Kort     ");
        String middleName = new String("Delano");  // new String = 'original:'

        String result01 = name.toUpperCase();
        System.out.println(result01);

        String result02 = name.toLowerCase();
        System.out.println(result02);

        String resultTrim = lastName.trim();
        System.out.println(lastName);
        System.out.println(resultTrim);

        String age = "32";

        int resultLengte = lastName.length();
        System.out.println("lastName length: " + resultLengte);

        String str01 = "";
        String str02 = " ";

        boolean resultIsBlank = str01.isBlank();
        System.out.println(resultIsBlank);

        boolean resultIsBlank2 = str02.isBlank();
        System.out.println(resultIsBlank2);

        boolean resultIsBlank3 = name.isBlank();
        System.out.println(resultIsBlank3);

        boolean resultIsEmpty = str02.isEmpty();
        System.out.println(resultIsEmpty);

        String resultReplace = name.replace('y', 'i');
        System.out.println(resultReplace);

        String hi = "Hello World";
        String resultReplace1 = hi.replace('l', 'k');
        System.out.println(resultReplace1);



        //String str = "   hello world      ";
        //System.out.println(str.strip());

        String naam = "Avi";
        System.out.println(naam.toUpperCase());

        String naam2 = "Avi";
        System.out.println(naam2.toLowerCase());

        String naam3 = "AviFeld";
        System.out.println(naam3.length());

        String naam4 = " ";
        System.out.println(naam4.isBlank());
        System.out.println(naam4.isEmpty());

        String naam5 = "AviFeld";
        System.out.println(naam5.replace('A', 'i'));

        String str = "     Hiiiiii    " + "hello";
        System.out.println(str.strip());
        System.out.println(str.trim());
        System.out.println(str.stripLeading());
        System.out.println(str.stripTrailing());

        String naam6 = "AviFeld";
        System.out.println(naam6.indexOf("ld"));

        String naam7 = "Avi Feld";
        System.out.println(naam7.contains("Fe "));

        String naam8 = "AviFeld";
        System.out.println(naam8.substring(1, 6));

        //oefeningen
        String naam9 = "Java exercises!";
        System.out.println(naam9.substring(5, 14));

        String naam10 = "walter, edwin, mike";
        System.out.println(naam10.contains("edwin"));

        String naam11 = "hello world";
        char h = 'H';
        char w = 'W';
        char r = 'R';
        char d = 'D';
        //System.out.println(naam11.replace(''));









    }
}
