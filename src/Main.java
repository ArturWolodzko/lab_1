import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        float zmiennaFloat = 2.2124f;
        System.out.println("zmiennaFloat =" + zmiennaFloat);
        System.out.printf("zmiennaFloat = %f", zmiennaFloat);
        System.out.println("zmiennaInt = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */
        int a = 6, b = 3;
        int wynik = a + b;
        int wynik2 = a - b;
        int wynik3 = a * b;
        int wynik4 = a / b;
        System.out.println("wynik dodawania: " + wynik);
        System.out.println("wynik odejmowania :" + wynik2);
        System.out.println("wynik mnożenia:" + wynik3);
        System.out.println("wynik dzielenia:" + wynik4);


        Double x = 2.45, y = 3.56;
        double zmienna = x + y;
        double zmienna1 = x - y;
        double zmienna2 = x * y;
        double zmienna3 = x / y;
        System.out.println("wynik dodawania wynosi:" + zmienna);
        System.out.println("wynik odejmowania wynosi:" + zmienna1);
        System.out.println("wynik mnożenia wynosi "+  zmienna2);
        System.out.printf("wynik dzielenia wynosi:%10.4f,\n mnożenie wynosi:%10.2f" , zmienna3 , zmienna2);


    }
}
