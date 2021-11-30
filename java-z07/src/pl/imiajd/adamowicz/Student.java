package pl.imiajd.adamowicz;

public class Student extends Osoba {
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    public String getKierunek() {
        return this.kierunek;
    }

    public String toString() {
        return String.format("%s Student - %s\n", super.toString(), this.kierunek);
    }
}

