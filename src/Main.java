public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        Kwadrat kwadrat = new Kwadrat();
        System.out.println(kwadrat.pole(13.2, 13.2));
        System.out.println(kwadrat.obwod(15, 15));
        Prostokat prostokat = new Prostokat();
        System.out.println(prostokat.pole(13.2, 25.2));
        System.out.println(prostokat.obwod(15, 25));

    }
}