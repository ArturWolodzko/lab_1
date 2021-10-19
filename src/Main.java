import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        /*double[] tab1 = {10, 20, 30, 40, 50};

        System.out.printf("%.2f %.2f %.2f %.2f %.2f \n" , tab1[0],tab1[1],tab1[2], tab1[3], tab1[4]);
        System.out.printf("%.2f", tab1[4]);*/

        do
        {
        int imie;
        int odpowiedz;

        String[] tab1 ={"artur", "marcin", "marek", "dawid" , "adam" , "filip ", "stefan" , "stefan", "ziutek ," +
                "mikołaj"};
        Scanner skan = new Scanner(System.in);
        System.out.println("podaj liczbę od 1 do 10 aby wylosowac imię");
        imie = skan.nextInt();
        if (imie == 1 ){
            System.out.printf(tab1[0]);
        }else if(imie  == 2){
            System.out.printf(tab1[1]);
        }else if (imie == 3){
            System.out.printf(tab1[2]);
        }else if (imie == 4){
            System.out.printf(tab1[3]);
        }else if(imie == 5){
            System.out.printf(tab1[4]);
        }else if(imie == 6){
            System.out.printf(tab1[5]);
        }else if (imie == 7){
                System.out.printf(tab1[6]);
        }else if (imie ==8){
            System.out.printf(tab1[7]);
        }else if (imie == 9){
            System.out.printf(tab1[8]);
        }else if (imie == 10){
            System.out.printf(tab1[9]  +"\nczy chcesz wtylosować imie jeszcze raz ? jeśli tak kliknij 1 ");
        }
        odpowiedz = skan.nextInt();

        }







    }
}
