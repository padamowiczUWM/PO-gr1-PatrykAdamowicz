package pl.edu.uwm.wmii.adamowiczpatryk.javaz06;

public class z1 {

    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        RachunekBankowy.setRocznaStopaProcentowa(4);
        System.out.format("saver1: %f\n", saver1.obliczMiesieczneOdestki());
        System.out.format("saver2: %f\n", saver2.obliczMiesieczneOdestki());
        RachunekBankowy.setRocznaStopaProcentowa(5);
        System.out.format("saver1: %f\n", saver1.obliczMiesieczneOdestki());
        System.out.format("saver2: %f", saver2.obliczMiesieczneOdestki());
    }
}
