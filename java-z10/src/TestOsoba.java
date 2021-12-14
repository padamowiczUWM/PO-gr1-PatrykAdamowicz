import pl.imiajd.adamowicz.Osoba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {

    public static void main(String[] args) {
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();

        LocalDate ld = LocalDate.of(2020, 1, 2);
        LocalDate ld2 = LocalDate.of(2021, 6, 24);


        grupa.add(new Osoba("Dorochowicz", ld));
        grupa.add(new Osoba("Ostaszewski", ld));
        grupa.add(new Osoba("Błaszczykowski", ld));
        grupa.add(new Osoba("Błaszczykowski", ld2));
        grupa.add(new Osoba("Adamowicz", ld));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
