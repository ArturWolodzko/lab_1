import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
       // int mojWiek = 0;
      /*  int mojWiekModulo = 0;
        Scanner skanuj = new Scanner(System.in);


        System.out.println("podaj wiek:");
        mojWiek = skanuj.nextInt();
        mojWiekModulo = mojWiek % 3;
        if (mojWiekModulo == 0 ) {
            System.out.println("podzielny przez 3");
        }else {
            System.out.println("nie podzielny przez 3");
        }
        */



        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

     /*   int numerIndeksu = 0;
        Scanner skanuj = new Scanner(System.in);
        boolean parzysty;

        System.out.println("podaj numer indeksu:");
        numerIndeksu = skanuj.nextInt();
        parzysty = (numerIndeksu % 2 == 0) ? true:false;
        if (parzysty == true){
            System.out.println("parzysty");
        }else {
            System.out.println("nieparzysty");
        }
        */
        /*int miesiac = 0;
        Scanner Skanuj = new Scanner(System.in);
        boolean parzysty;

        System.out.println("podaj miesiąc:");
        miesiac = Skanuj.nextInt();
        parzysty = (miesiac % 2 == 0) ? true:false;
        if (parzysty == true){
            System.out.println("parzysty");}
        else{
            System.out.println("nieparzysty");
        }

        int wiek = 0;
        boolean mlody;
        Scanner skanuj = new Scanner(System.in);

        System.out.println("podaj wiek");
        wiek = skanuj.nextInt();
        mlody = (wiek < 50) ? true:false;
        if (mlody == true){
            System.out.println("młody");}
        else{
            System.out.println("do piachu :)");
        }*/



        Scanner skan = new Scanner(System.in);
        String imie;

        System.out.println("podaj imię:");
        imie = skan.nextLine();
        if (imie.equals("marek")==true){
            System.out.println("dobry gosc");
        }else {
            System.out.println("nie dobry");
        }







        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */






    }
}
