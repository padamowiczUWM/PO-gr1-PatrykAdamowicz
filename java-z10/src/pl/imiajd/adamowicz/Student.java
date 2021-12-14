package pl.imiajd.adamowicz;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba> {
    private double sredniaOcen;

    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }


    public int compareTo(Osoba osoba) {
        return super.compareTo(osoba);
    }
}
