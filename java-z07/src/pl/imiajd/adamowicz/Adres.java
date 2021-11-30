package pl.imiajd.adamowicz;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private int kod_pocztowy;

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, int kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, int numer_domu, String miasto, int kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz() {
        System.out.format("%s %s\n %s %d %d\n", this.kod_pocztowy, this.miasto, this.ulica, this.numer_domu, this.numer_mieszkania);
    }

    public boolean przed(Adres przed) {
        return this.kod_pocztowy > przed.kod_pocztowy;
    }
}