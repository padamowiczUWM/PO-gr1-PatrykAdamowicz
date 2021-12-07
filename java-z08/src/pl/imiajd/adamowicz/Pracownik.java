package pl.imiajd.adamowicz;

import java.time.LocalDate;

public class Pracownik extends Osoba {
    private int pensja;
    private LocalDate dataZatrudnienia;


    public Pracownik(String[] imiona, String nazwisko, LocalDate dataUrodzenia, boolean płeć, int rokUrodzenia, int pensja, LocalDate dataZatrudnienia) {
        super(imiona, nazwisko, dataUrodzenia, płeć, rokUrodzenia);
        this.pensja = pensja;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public int getPensja() {
        return this.pensja;
    }

    public LocalDate getDataZatrudnienia() {
        return this.dataZatrudnienia;
    }

    public String toString() {
        return String.format("%s Nauczyciel - %d zł\n", super.toString(), this.pensja);
    }
}