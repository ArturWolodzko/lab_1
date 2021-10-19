import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
       /* int a = 12;
        int b = 7;
        int c = 19;

        System.out.println("a == b daje wynik:  "   + (a == b ));
        System.out.println("a + b daje wynik:  " + (a + b));
        System.out.println("a & b daje wynik:  " + (a & b));


        boolean d = true;
        boolean e = false;
        boolean f = true;

        System.out.println("d && f daje wynik:   " + (d && f) );
        System.out.println("d || f daje wynik:   "+ (d || f));
        System.out.println("d ^ f daje wyhnik:   "+ (d^f));
        System.out.println("d ^ e daje wynik:    "+(d ^ e));
        System.out.println("d && e daje wynik:   " + (d&&e));
        System.out.println("d && f daje wynik:   "+ (d && f));*/

/*
        int a = 2;
        int b = 3;
        int c = 4;

        System.out.println("a == b daje wynik :   " + (a == b));
        System.out.println("a & b daje wynik :   " + (a & b));
        System.out.println("a == c daje wynik :   " + (a == c));
        System.out.println("a & c daje wynik :   " + (a & c) );
        System.out.println("c - a daje wynik :" +(c - a));*/

        Scanner skan = new Scanner(System.in);



        System.out.println("podaj pierwszy sygnał");
        boolean a = skan.nextBoolean();

        System.out.println("podaj drugi sygnał");
        boolean b = skan.nextBoolean();

        System.out.println("wynik bramki and =" + (a & b));
        System.out.println("wynik brammki or =" +(a | b));












    }
}
