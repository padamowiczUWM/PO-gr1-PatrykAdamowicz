package pl.imiajd.adamowicz;

public class Osoba {
    protected String nazwisko;
    protected int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia) {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public int getRokUrodzenia() {
        return this.rokUrodzenia;
    }

    public String toString() {
        return String.format("%s %d\n", this.nazwisko, this.rokUrodzenia);
    }

}
