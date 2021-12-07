import pl.imiajd.adamowicz.Flet;
import pl.imiajd.adamowicz.Fortepian;
import pl.imiajd.adamowicz.Instrument;
import pl.imiajd.adamowicz.Skrzypce;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestInstrumenty {
    public static void main(String[] args) {
        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();

        LocalDate rokProdukcji = LocalDate.of(2000, 1, 8);

        orkiestra.add(new Flet("x", rokProdukcji));
        orkiestra.add(new Fortepian("y", rokProdukcji));
        orkiestra.add(new Skrzypce("z", rokProdukcji));
        orkiestra.add(new Flet("a", rokProdukcji));
        orkiestra.add(new Fortepian("b", rokProdukcji));

        System.out.println(orkiestra.get(0).dzwiek());
        System.out.println(orkiestra.get(1).dzwiek());
        System.out.println(orkiestra.get(2).dzwiek());
        System.out.println(orkiestra.get(3).dzwiek());
        System.out.println(orkiestra.get(4).dzwiek());
        System.out.println(orkiestra.get(0).equals(orkiestra.get(3)));
        System.out.println(orkiestra);
    }
}
