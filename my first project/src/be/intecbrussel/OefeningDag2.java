package be.intecbrussel;

public class OefeningDag2 {

    public static void main(String[]args) {

        //oefening 1
        int firstNumber = 1250;
        int secondNumber = 24000;

        int c = firstNumber + secondNumber;
        System.out.println(c);

        int b = firstNumber - secondNumber;
        System.out.println(b);

        int a = firstNumber * secondNumber;
        System.out.println(a);

        int g = firstNumber / secondNumber;
        System.out.println(g); //waarom 0?

        int t = secondNumber % firstNumber;
        System.out.println(t);


        //oefening 2
        int number = -5;
        System.out.println(number + 8*6);

        int number1 = 55;
        number1 += 9;
        System.out.println(number1 %9);

        int number2 = 20;
        number2 += -3*5/8;
        System.out.println(number2);

        int number3 = 5;
        number3 += 15/3*2-8 %3;
        System.out.println(number3);


        //oefening 3
        // zeker?
        double lengte = 25.5;
        double breedte = 12.5;
        double oppervlakte = lengte * breedte;
        System.out.println(oppervlakte);

        //oefening 4
        // da meen je toch niet
        int first = 25;
        int second = 39;
        //2 variabelen vergelijken met de relational operators?
        System.out.println(first == second);
        System.out.println(first != second);
        System.out.println(first > second);
        System.out.println(first < second);
        System.out.println(first >= second);
        System.out.println(first <= second);






        //oefening 5
        //failliet
        System.out.println("   J     a   v     v  a");
        System.out.println("   J    a a   v   v  a a");
        System.out.println("J  J   aaaaa   V V  aaaaa");
        System.out.println(" JJ   a     a   V  a     a");


        char letter ='\u0000';
        System.out.println("the value of letter is " + letter);

        var numbero = 1.8;
        var numbero2 = 65;
        numbero = numbero2;
        System.out.println(numbero);

        int aa = 10;
        int bb = 20;
        System.out.println(aa + bb);
        System.out.println(aa - bb);
        System.out.println("the result of deviding 20 by 10 is " + bb/aa);
        System.out.println("10 * 20 = " + aa*bb);


        int A = 10;
        int B = 20;
        int sum = A + B;
        int sub = A - B;
        int mul = A * B;
        int div = A / B;
        int mod = A % B;

        System.out.println("Sum of A and B = " + sum);
        System.out.println("Subtraction of A and B = " + sub);
        System.out.println("Multiplication of A and B = " + mul);
        System.out.println("Division of A and B = " + div); //why is result 0 and not 0.5?
        System.out.println("Modulus of A and B = " + mod);

        int mij = 256;
        int zij = 24;
        int hola = mij % zij;
        System.out.println(hola);

        int inc = ++mij;
        int dec = --mij;
        System.out.println("incrementing mij: " + inc);
        System.out.println("decrementing mij: " + dec); //terug naar startwaarde 256, niet 255
        System.out.println(++inc);
        System.out.println(mij++);
        System.out.println(mij);

        System.out.println(A == B);
        boolean equal = (A == B);
        System.out.println(equal);

        boolean AA = true;
        boolean BB = false;
        boolean result01 = (AA && BB); //beide operanden true = true
        boolean result02 = (AA || BB); //een operand true = true
        boolean result03 = (!(AA && BB)); //reverse
        boolean result04 = (!(AA || BB)); //reverse

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
        System.out.println(result04);


        int d = 10;
        int e = 20;
        int f = 0;

        f = (d + e);
        System.out.println(f);
        f += d;
        System.out.println(f);
        f -= d;
        System.out.println(f);
        f *= d;
        System.out.println(f);
        f /= d;
        System.out.println(f);
        f %= d;
        System.out.println(f);


        int num1 = 5;
        String message;

        if (num1 > 10) {
            message = "Number is greater than 10";
        } else {
            message = "Number is smaller than 10";
        }
        System.out.println(message);

        int num2 = 26;
        String message2;

        if (num2 < 19)  {
            message2 = "how are YOU";
        } else  {
            message2 = "how are WE";
        }
        System.out.println(message2);
        System.out.println(num2);



    }

}