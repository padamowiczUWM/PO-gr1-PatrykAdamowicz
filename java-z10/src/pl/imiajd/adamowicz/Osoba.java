package pl.imiajd.adamowicz;

import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba> {
    private String nazwisko;
    protected LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia) {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public int compareTo(Osoba osoba) {
        int result = this.nazwisko.compareTo(osoba.nazwisko);
        if (result != 0) {
            return result;
        }
        if (result == 0) {
            result = this.dataUrodzenia.compareTo(osoba.dataUrodzenia);
        }

        return result;
    }

    public String toString() {
        return String.format("%s [%s %s]", this.getClass().getName(), this.nazwisko, this.dataUrodzenia);
    }

    public boolean equals(Osoba osoba) {
        return this.nazwisko.equals(osoba.nazwisko) && this.dataUrodzenia == osoba.dataUrodzenia;
    }
}
