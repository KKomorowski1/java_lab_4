import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu
           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)
           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */


        int[] a = new int[6];

        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;
        a[5] = 5;
        try {
            Scanner myObj = new Scanner(System.in);
            int number;
            do {
                System.out.println("Podaj index");
                while (!myObj.hasNextInt()) {
                    System.out.println("Podaj numer");
                    myObj.next(); // this is important!
                }
                number = myObj.nextInt();
                if (number > a.length) {
                    System.out.println("Nie ma takiego indeksu");
                    number = myObj.nextInt();
                }
            } while (number <= 0);
            System.out.println(a[number]);
        } finally {
            System.out.println("Program zakonczony");
        }

        // zad.2
        //a) stworzyć dowolny przykład z NullPonterException,
        Object obj = null;
        obj.hashCode();

        //b) stworzyć dowolny przykład z ArithmeticException ,
        double x = 3/0; System.out.println("x = "+x);
        //c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,

        try{
            Object obj1 = null;
            obj.hashCode();
            double x1 = 3/0; System.out.println("x = "+x1);
        }catch (NullPointerException e){
            System.out.println(e);
        } catch (ArithmeticException e){
            System.out.println(e);
        } finally {
            System.out.println("done");
        }



    }
}