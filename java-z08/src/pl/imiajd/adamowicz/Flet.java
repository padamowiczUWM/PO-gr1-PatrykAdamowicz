package pl.imiajd.adamowicz;

import java.time.LocalDate;

public class Flet extends Instrument {

    public Flet(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    @Override
    public String dzwiek() {
        return "ffffffff";
    }
}