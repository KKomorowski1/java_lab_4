package impl;

import interfaces.Budynek;
import interfaces.KolorEnum;


public class Dom implements Budynek {

    private boolean maGaraz;
    private String typOgrzewania;

    public boolean isMaGaraz() {
        return maGaraz;
    }

    public void setMaGaraz(boolean maGaraz) {
        this.maGaraz = maGaraz;
    }

    public String getTypOgrzewania() {
        return typOgrzewania;
    }

    public void setTypOgrzewania(String typOgrzewania) {
        this.typOgrzewania = typOgrzewania;
    }


    @Override
    public double powierzchnia(double pow) {
        return 200;
    }

    @Override
    public String adresBudynku(String adres) {
        return "Gdynia, legionow 111";
    }

    @Override
    public int liczbaOkien(int value) {
        return 20;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        System.out.println(value);
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {

    }

    @Override
    public String typ(double wysokosc, int iloscKondygnacji) {
        if (wysokosc <= 12 && iloscKondygnacji < 4) {
            return "Niski";
        } else if (wysokosc <= 25 && wysokosc > 12 && iloscKondygnacji >= 5 && iloscKondygnacji < 9) {
            return "Srenio wysoki";
        } else {
            return "Wysoki";
        }
    }

    public double zuzyciePradu(double kWh){
        return kWh * 0.77;
    }

    @Override
    public String toString() {
        return "Dom{" +
                "maGaraz=" + maGaraz +
                ", typOgrzewania='" + typOgrzewania + '\'' +
                '}';
    }
}

