package interfaces;

public interface Budynek {
    double powierzchnia(double pow);
    String adresBudynku(String adres);
    int liczbaOkien(int value);
    void liczbaMieszkancow(int value);
    void kolorDomu(KolorEnum kolor);
    String typ(double wysokosc, int iloscKondygnacji);
}
