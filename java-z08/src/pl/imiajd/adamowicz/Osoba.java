package pl.imiajd.adamowicz;

import java.time.LocalDate;

public class Osoba {
    protected String[] imiona;
    protected String nazwisko;
    protected LocalDate dataUrodzenia;
    protected boolean płeć;
    protected int rokUrodzenia;

    public Osoba(String[] imiona, String nazwisko, LocalDate dataUrodzenia, boolean płeć, int rokUrodzenia) {
        this.imiona = imiona;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.płeć = płeć;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String[] getImiona() {
        return this.imiona;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return this.dataUrodzenia;
    }

    public boolean getPłeć() {
        return this.płeć;
    }

    public int getRokUrodzenia() {
        return this.rokUrodzenia;
    }

    public String toString() {
        return String.format("%s %d\n", this.nazwisko, this.rokUrodzenia);
    }

}
