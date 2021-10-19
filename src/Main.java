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



       /* Scanner skan = new Scanner(System.in);
        String imie;

        System.out.println("podaj imię:");
        imie = skan.nextLine();
        if (imie.equals("marek")==true){
            System.out.println("dobry gosc");
        }else {
            System.out.println("nie dobry");
        }*/

        /*Scanner skan = new Scanner(System.in);
        String nazwa;

        System.out.println("podaj marke samochodu:");
        nazwa = skan.nextLine();
        if (nazwa.equals("mercedes")==true){
            System.out.println("Bardzo dobry niemiecki samochód");}
        else if(nazwa.equals("vw")==true){
            System.out.println("dobry niemiecki samochoód");
        }
        else if(nazwa.equals("bmw")==true){
            System.out.println("drogi niemiecki samochód");
        }
        else{
            System.out.println("nie kupuj tego badziewia");
        }*/








        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */



        /*Scanner skan = new Scanner(System.in);
        double liczba;

        System.out.println("podaj liczbę zmiennoprzecinkową");
        liczba = skan.nextDouble();
        if (liczba > 3 ){
            System.out.println("liczba jest większa od 3");
        }else if (liczba < 3) {
            System.out.println("liczba jest mniejsza od 3");
        }*/




        Scanner skan = new Scanner(System.in);
        int a;
        int odpowiedz;
        do
        {


            System.out.println("podaj mase pojazdu");
            a = skan.nextInt();
            if ((500 <= a) & (a <= 699)) {
                System.out.println("wypłać klientowi 300 zł\n");
            } else if ((700 <= a) & (a <= 899)) {
                System.out.println("wypłać klientowi 400 zł\n");
            } else if ((900 <= a) & (a <= 1100)) {
                System.out.println("wypłać klientowi 500 zł\n");
            }
            System.out.println("Czy chcesz powtórzyć 1 = Tak 2 = Nie");
            odpowiedz = skan.nextInt();
        }while (odpowiedz  == 1);







    }
}
