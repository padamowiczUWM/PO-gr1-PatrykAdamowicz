package pl.imiajd.adamowicz;

import java.time.LocalDate;

public class Student extends Osoba {
    private String kierunek;
    private double średniaOcen;

    public Student(String[] imiona, String nazwisko, LocalDate dataUrodzenia, boolean płeć, int rokUrodzenia, String kierunek, double średniaOcen) {
        super(imiona, nazwisko, dataUrodzenia, płeć, rokUrodzenia);
        this.kierunek = kierunek;
        this.średniaOcen = średniaOcen;
    }

    public String getKierunek() {
        return this.kierunek;
    }

    public double getŚredniaOcen() { return this.średniaOcen; }

    public void setŚredniaOcen(double średniaOcen) {
        this.średniaOcen = średniaOcen;
    }

    public String toString() {
        return String.format("%s Student - %s\n", super.toString(), this.kierunek);
    }
}

