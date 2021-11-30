import pl.imiajd.adamowicz.Adres;
import pl.imiajd.adamowicz.BetterRectangle;
import pl.imiajd.adamowicz.Student;

public class TestNazwanyPunkt {
    public static void main(String[] args) {
        Adres adres = new Adres("Nowa", 12, 14, "Gołdap", 16201);

        adres.pokaz();

        BetterRectangle br = new BetterRectangle(0, 0, 200, 100);

        System.out.println(br.getPerimeter());

        Student s = new Student("Anon", 1980, "WMII");

        System.out.println(s.toString());
    }
}
