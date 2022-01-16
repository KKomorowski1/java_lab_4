import impl.Dom;
import interfaces.Budynek;
import interfaces.KolorEnum;

public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(interfaces.KolorEnum kolor);
        c) stworzyć enum interfaces.KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */
        Dom dom = new Dom();
        dom.setTypOgrzewania("Centralne");
        dom.setMaGaraz(true);
        dom.liczbaMieszkancow(5);
        dom.adresBudynku("Swietojanska");
        dom.kolorDomu(KolorEnum.CZARNY);
        dom.typ(12, 5);
        dom.liczbaOkien(30);
        dom.powierzchnia(500);
        System.out.println(dom);

        Budynek dom2 = new Dom();
        dom2.liczbaMieszkancow(5);
        dom2.adresBudynku("Mariacka");
        dom2.kolorDomu(KolorEnum.BIALY);
        dom2.typ(5, 2);
        dom2.liczbaOkien(5);
        dom2.powierzchnia(200);
        System.out.println(dom2);
    }
}