package Classes;

import Inteface.StudentI;

public class Student implements StudentI {

    private String kierunek;
    private boolean stypendium;

    public Student(String kierunek, boolean stypendium) {
        this.kierunek = kierunek;
        this.stypendium = stypendium;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public boolean isStypendium() {
        return stypendium;
    }

    public void setStypendium(boolean stypendium) {
        this.stypendium = stypendium;
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
    public String getWydzial() {
        return null;
    }

    @Override
    public String getUczelnia() {
        return null;
    }

    @Override
    public double getSrednia() {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "kierunek='" + kierunek + '\'' +
                ", stypendium=" + stypendium +
                '}';
    }
}
