package Classes;

import Inteface.PracownikI;

public class Pracownik implements PracownikI {

    private boolean pracaZdalna;
    private boolean multiSport;

    public Pracownik(boolean pracaZdalna, boolean multiSport) {
        this.pracaZdalna = pracaZdalna;
        this.multiSport = multiSport;
    }

    public boolean isPracaZdalna() {
        return pracaZdalna;
    }

    public void setPracaZdalna(boolean pracaZdalna) {
        this.pracaZdalna = pracaZdalna;
    }

    public boolean isMultiSport() {
        return multiSport;
    }

    public void setMultiSport(boolean multiSport) {
        this.multiSport = multiSport;
    }

    @Override
    public String getPlec() {
        return null;
    }

    @Override
    public String getMiejsceZamieszkania() {
        return null;
    }

    @Override
    public double getWynagrodzenie() {
        return 0;
    }

    @Override
    public String getRodzajUmowy() {
        return null;
    }

    @Override
    public String getTypPracy() {
        return null;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "pracaZdalna=" + pracaZdalna +
                ", multiSport=" + multiSport +
                '}';
    }
}
