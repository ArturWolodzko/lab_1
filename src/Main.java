import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */
        Scanner skanuj = new Scanner(System.in);

        System.out.print("podaj imię : ");
        String imie = skanuj.next();

        System.out.print("podaj nazwisko : ");
        String nazwisko =skanuj.next();

        System.out.print("podaj wiek :");
        int wiek = skanuj.nextInt();

        System.out.print("podaj indeks :");
        int indeks = skanuj.nextInt();

        System.out.printf("imie : %s,  Nazwisko %s, wiek : %d,  Indeks : %d,", imie , nazwisko , wiek , indeks);


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */
        System.out.print("podaj pierwsza liczbe:");
        int pierwsza = skanuj.nextInt();

        System.out.print("podaj drugą liczbe:");
        int druga = skanuj.nextInt();

        int dodawanie = pierwsza + druga ;
        int odejmowanie = pierwsza - druga ;
        int mnozenie = pierwsza * druga ;
        int dzielenie = pierwsza / druga;
        System.out.println("wynik dodawania wynosi : " + dodawanie);
        System.out.println("wynik odejmowania wynosi :" + odejmowanie);
        System.out.println("wynik mnozenia wynosi :" + mnozenie);
        System.out.println("wynik dzielenia wynosi :" + dzielenie);

    }
}
