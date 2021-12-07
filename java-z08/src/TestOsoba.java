import pl.imiajd.adamowicz.Pracownik;
import pl.imiajd.adamowicz.Student;

import java.time.LocalDate;

public class TestOsoba {
    public static void main(String[] args) {

        String[] imiona = new String[2];

        imiona[0] = "Łukasz";
        imiona[1] = "Paweł";

        LocalDate dataUrodzenia = LocalDate.of(2020, 1, 8);

        Student s = new Student(imiona, "Anon", dataUrodzenia, false,1980, "WMII", 4.2);
        System.out.println(s.getImiona()[0]);
        System.out.println(s.getPłeć());
        System.out.println(s.getNazwisko());
        System.out.println(s.getRokUrodzenia());
        s.setŚredniaOcen(5.2);
        System.out.println(s.getŚredniaOcen());
        System.out.println(s.getKierunek());

        System.out.println(s.toString());

        LocalDate dataZatrudnienia = LocalDate.of(2010, 12, 2);


        imiona[0] = "Szymon";
        imiona[1] = "Norbert";


        Pracownik p = new Pracownik(imiona, "Anon", dataUrodzenia, false,1980, 3200, dataZatrudnienia);
        System.out.println(p.getImiona()[0]);
        System.out.println(p.getDataUrodzenia());
        System.out.println(p.getPensja());
        System.out.println(p.getDataZatrudnienia());
        System.out.println(p);
    }
}
