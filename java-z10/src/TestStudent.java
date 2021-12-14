import pl.imiajd.adamowicz.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> grupa = new ArrayList<Student>();

        LocalDate ld = LocalDate.of(2020, 1, 2);
        LocalDate ld2 = LocalDate.of(2021, 6, 24);


        grupa.add(new Student("Dorochowicz", ld, 3.2));
        grupa.add(new Student("Ostaszewski", ld, 2.5));
        grupa.add(new Student("Błaszczykowski", ld, 5.3));
        grupa.add(new Student("Błaszczykowski", ld2, 4.6));
        grupa.add(new Student("Adamowicz", ld, 4.1));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
